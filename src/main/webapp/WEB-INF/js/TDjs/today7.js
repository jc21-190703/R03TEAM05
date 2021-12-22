    var today7 = new Date();
    today7.setDate(today7.getDate());
    var yyyy = today7.getFullYear();
    var mm = ("0"+(today7.getMonth()+1)).slice(-2);
    var dd = ("0"+today7.getDate()).slice(-2);
    document.getElementById("today7").value=yyyy+'-'+mm+'-'+dd;