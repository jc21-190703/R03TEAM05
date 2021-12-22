    var today5 = new Date();
    today5.setDate(today5.getDate());
    var yyyy = today5.getFullYear();
    var mm = ("0"+(today5.getMonth()+1)).slice(-2);
    var dd = ("0"+today5.getDate()).slice(-2);
    document.getElementById("today5").value=yyyy+'-'+mm+'-'+dd;