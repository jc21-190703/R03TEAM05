
    var today2 = new Date();
    today2.setDate(today2.getDate());
    var yyyy = today2.getFullYear();
    var mm = ("0"+(today2.getMonth()+1)).slice(-2);
    var dd = ("0"+today2.getDate()).slice(-2);
    document.getElementById("today2").value=yyyy+'-'+mm+'-'+dd;