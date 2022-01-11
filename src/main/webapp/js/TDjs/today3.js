    var today3 = new Date();
    today3.setDate(today3.getDate());
    var yyyy = today3.getFullYear();
    var mm = ("0"+(today3.getMonth()+1)).slice(-2);
    var dd = ("0"+today3.getDate()).slice(-2);
    document.getElementById("today3").value=yyyy+'-'+mm+'-'+dd;