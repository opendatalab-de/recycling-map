module.exports = function(grunt) {
	'use strict';
	grunt.initConfig({
		pkg: grunt.file.readJSON('package.json'),
		rsync: {
			options: {
				args: ['--verbose', '--update'],
				exclude: ['.git*', '.DS_Store', 'node_modules', '.project', '.settings', '.buildpath', '.classpath', 'debug.log', 'package.json',
					'Gruntfile.js'],
				recursive: true,
				compareMode: 'checksum',
				ssh: true,
			},
			toPrdDry: {
				options: {
					dryRun: true,
					src: './static/',
					dest: 'odl:/var/www/opendatalab/public/projects/recycling-map/'
				}
			},
			toPrd: {
				options: {
					src: './static/',
					dest: 'odl:/var/www/opendatalab/public/projects/recycling-map/'
				}
			}
		}
	});

	grunt.loadNpmTasks('grunt-rsync');

	grunt.registerTask('push', ['rsync:toPrd']);
	grunt.registerTask('dryPush', ['rsync:toPrdDry']);
};
