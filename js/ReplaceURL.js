$('a.links').each(function () {

    var $this = $(this);
    var aHref = $this.attr('href');
    $this.attr('href', aHref.replace('http://rbi.org.in', 'https://' + $(location).attr('host')));
});

$('a.links').each(function () {

    var $this = $(this);
    var aHref = $this.attr('href');
    $this.attr('href', aHref.replace('http://www.rbi.org.in', 'https://' + $(location).attr('host')));
});

$('.text1 a[href]').each(function () {

    var $this = $(this);
    var aHref = $this.attr('href');
    $this.attr('href', aHref.replace('http://rbi.org.in', 'https://' + $(location).attr('host')));
});

$('.text1 a[href]').each(function () {

    var $this = $(this);
    var aHref = $this.attr('href');
    $this.attr('href', aHref.replace('http://www.rbi.org.in', 'https://' + $(location).attr('host')));
});

$('a[href]').each(function () {

    var $this = $(this);
    var aHref = $this.attr('href');
    $this.attr('href', aHref.replace('http://www.rbi.org.in', 'https://' + $(location).attr('host')));
});


$('a[href]').each(function () {

    var $this = $(this);
    var aHref = $this.attr('href');
    $this.attr('href', aHref.replace('http://rbi.org.in', 'https://' + $(location).attr('host')));
});

$('a[href]').each(function () {

    var $this = $(this);
    var aHref = $this.attr('href');
    $this.attr('href', aHref.replace('http://rbidocs.rbi.org.in/rbiadmin', 'http://' + $(location).attr('host')));
});

$("a[href^='http://www.']").each(function () {
    var $this = $(this);
    var aHref = $this.attr('href');
    if (aHref.indexOf('rbi') > 0) {
        $this.attr('href', aHref.replace('http://www.', 'https://' + ''));
    }

});

//$("a[href$='.xml']").each(function () {
//    var $this = $(this);
//    var aHref = $this.attr('href');
//    $this.attr('href', aHref.replace('https://', 'http://'));

//});

$("img[src^='http://rbi.']").each(function () {
    var $this = $(this);
    var src = $this.attr('src');
    if (src.indexOf('rbi') > 0) {
        $this.attr('src', src.replace('http://rbi', 'https://rbi' + ''));
    }

});

$("img[src^='http://www.rbi.']").each(function () {
    
    var $this = $(this);
    var src = $this.attr('src');
    if (src.indexOf('rbi') > 0) {
        $this.attr('src', src.replace('http://www.rbi', 'https://rbi' + ''));
    }

});


//manoj
//$("img[src]').each(function () {
  //  var $this = $(this);
   // var aHref = $this.attr('src');
    //$this.attr('src', aHref.replace('https://', 'http://'));

//});

//$('a.link2').each(function () {

//    var $this = $(this);
//    var aHref = $this.attr('href');
//    //alert(aHref.length);
//    var ext = aHref.substring(aHref.length - 3, aHref.length);
//    //alert(ext);
//    if (ext == 'xml') {
//        //alert(aHref);
//        $this.attr('href', aHref.replace('http://www.rbi.org.in', 'http://' + $(location).attr('host')));
//    }

//});

//$('a.link2').each(function () {

//    var $this = $(this);
//    var aHref = $this.attr('href');
//    var ext = aHref.substring(aHref.length - 3, aHref.length);
//    //alert(ext);
//    if (ext == 'xml') {
//        //alert(aHref);
//        $this.attr('href', aHref.replace('http://rbi.org.in', 'http://' + $(location).attr('host')));
//    }

//});


$(".breadcrumbs a[href*='resultsnew.aspx']").attr('href', 'https://opportunities.rbi.org.in/Scripts/resultsnew.aspx')

$(".breadcrumbs a[href*='resultsnew.aspx']").attr('target', '_blank')