package de.grundid.dienstleister.azh;

import static org.springframework.util.StringUtils.hasText;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptableObject;

import de.grundid.dienstleister.ServiceProvider;
import de.grundid.dienstleister.merge.DataMerger;
import de.grundid.dienstleister.merge.ServiceProviderComparator;
import de.grundid.utils.GrabUtils;

public class EMailDecoder {

	private static final String SCRIPT = "function encodeEmail(param1, param2, subject) {\n" + "	var v2=param1;\n"
			+ "	var v7=unescape(param2);\n" + "	var v5=v2.length;\n" + "	var v1=\"\";\n"
			+ "	for(var v4=0;v4<v5;v4++){\n" + "		v1+=String.fromCharCode(v2.charCodeAt(v4)^v7.charCodeAt(v4));\n"
			+ "	}\n" + "	 document.write( v1);\n" + "}\n";

	private void run() {
		List<ServiceProvider> list = GrabUtils.loadData("azh-service-provider.json");
		System.out.println("All: " + list.size());
		Set<ServiceProvider> unique = new TreeSet<ServiceProvider>(new ServiceProviderComparator());
		unique.addAll(list);
		de.grundid.standesamt.Document doc = new de.grundid.standesamt.Document();
		Context cx = Context.enter();
		ScriptableObject scope = cx.initStandardObjects();
		Object wrappedOut = Context.javaToJS(doc, scope);
		ScriptableObject.putProperty(scope, "document", wrappedOut);
		int validEmails = 0;
		for (ServiceProvider serviceProvider : unique) {
			if (hasText(serviceProvider.getMail())) {
				doc.reset();
				String script = SCRIPT + serviceProvider.getMail();
				cx.evaluateString(scope, script, "script", 0, null);
				String email = doc.getContent();
				if (email.contains("@")) {
					serviceProvider.setMail(email);
					validEmails++;
				}
				else {
					serviceProvider.setMail(null);
				}
			}
		}
		GrabUtils.writeJsonObject(unique, "azh-service-provider-decoded.json");
		System.out.println("Unque: " + unique.size());
		System.out.println("Valid mails: " + validEmails);
		DataMerger.exportCsv(unique);
	}

	public static void main(String[] args) {
		new EMailDecoder().run();
	}
}
