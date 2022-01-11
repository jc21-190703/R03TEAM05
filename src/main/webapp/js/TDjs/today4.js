    var today4 = new Date();
    today4.setDate(today4.getDate());
    var yyyy = today4.getFullYear();
    var mm = ("0"+(today4.getMonth()+1)).slice(-2);
    var dd = ("0"+today4.getDate()).slice(-2);
    document.getElementById("today4").value=yyyy+'-'+mm+'-'+dd;