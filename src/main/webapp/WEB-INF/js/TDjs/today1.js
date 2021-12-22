    var today1 = new Date();
    today1.setDate(today1.getDate());
    var yyyy = today1.getFullYear();
    var mm = ("0"+(today1.getMonth()+1)).slice(-2);
    var dd = ("0"+today1.getDate()).slice(-2);
    document.getElementById("today1").value=yyyy+'-'+mm+'-'+dd;