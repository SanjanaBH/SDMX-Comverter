

function SetStyles(Sitename, SiteLink) {
    document.cookie = "Sitename=" + Sitename + ";path=/";
    document.cookie = "SiteLink=" + SiteLink + ";path=/";

    var functionWiseCookie = "";
    var arrNewFunctionWiseReg = ["CB", "COPB", "NB", "RFM"];
    var arrNewFunctionWiseSup = ["SCB", "SCOB", "SNB"];
   
    if (arrNewFunctionWiseReg.indexOf(Sitename) != -1) {
        functionWiseCookie = $("#" + Sitename + ">span").text();
        document.cookie = "functionName=" + functionWiseCookie.trim() + " in regulations" + ";path=/";
    }

    else if (arrNewFunctionWiseSup.indexOf(Sitename) != -1) {
       
        functionWiseCookie = $("#" + Sitename + ">span").text();
        document.cookie = "functionName=" + functionWiseCookie.trim() + " in supervision" + ";path=/";
    }

    else {
        var myElement = document.getElementById(Sitename);
        var strSiteName = (myElement.innerText || myElement.textContent);
        document.cookie = "functionName=" + strSiteName.trim() + ";path=/";
    }



}
//function SetInnerStyles() {
//    var name = getCookie('Sitename');
//    var link = getCookie('SiteLink');    
//    if (name != null && link != null) {
//        if (name != "" && link != "") {       
//            document.getElementById(name).setAttribute("class", "accordionButton");
//            document.getElementById(name).setAttribute("style", "font-weight:bold");
//            document.getElementById(name + "Content").style.display = "block";
//            document.getElementById(name+link).setAttribute("class", "active");
//        }
//    }
//    function getCookie(name) {
//        name += '=';
//        var parts = document.cookie.split(/;\s*/);
//        for (var i = 0; i < parts.length; i++) {
//            var part = parts[i];
//            if (part.indexOf(name) == 0)
//                return part.substring(name.length)
//        }
//        return null;
//    }
//}
$(document).ready(function () {
    var arrDivMain = ["MP", "IC", "BDMG", "BB", "BR", "RC", "NBS", "UB", "FM", "FEMA", "PSS", "RND", "NBFC", "CS", "CB", "COPB", "NB", "RFM", "SCB", "SCOB", "SNB"];
    //var arrDivInner = ["FAQ", "Legal", "Notifications", "Other", "Overview", "PR", "Pub", "Speech", "Stat"];
    var arrDivInner = ["Overview", "Notifications", "PR", "Speech", "Stat", "FAQ", "RTI", "UsefulInfoCustomer", "UsefulInfo","Forms","LF","IDs"];
    var temp = '#';
    jQuery.each(arrDivMain, function (index1) {
        //        $('#' + arrDivMain[index1]).click(function () {
        //            document.cookie = "functionName=" + $('#' + arrDivMain[index1]).text() + ";path=/";
        //        });
        jQuery.each(arrDivInner, function (index2) {
            $("div ul li a#" + arrDivMain[index1] + arrDivInner[index2]).on("click", function () {
                SetStyles(arrDivMain[index1], arrDivInner[index2]);
            });
        });
    });
}); 