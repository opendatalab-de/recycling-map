(function () {
    'use strict';
    function padLeft (str){
        var pad = "00";
        var ans = pad.substring(0, pad.length - str.length) + str
        return ans;
    }
    angular.module('rc').filter("time",function(){
        return function(input){
            var minute=input%60, hour;
            hour = padLeft(Math.floor(input/60)+"");
            minute=padLeft(minute+"");
            return hour+":"+minute;
        }
    })
})();