    var today6 = new Date();
    today6.setDate(today6.getDate());
    var yyyy = today6.getFullYear();
    var mm = ("0"+(today6.getMonth()+1)).slice(-2);
    var dd = ("0"+today6.getDate()).slice(-2);
    document.getElementById("today6").value=yyyy+'-'+mm+'-'+dd;