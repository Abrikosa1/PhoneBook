class AbonentController
{
    constructor()
    {
        this.abonentService = new AbonentService();
    }
    
    // DATAController
    getAllAbonent()
    {
        return this.abonentService.getAllAbonent();
    }
    
    //ViewController
    getAllAbonentView()
    {
        var data=this.getAllAbonent();
        var result="<div style='margin-left:60px; width:1050px' class='row col-md-6 col-md-offset-2 custyle'>"+
                    "<table class='table table-striped custab'>"+
                    "<thead>"+
                    "<tr>"+
                    "<th>#</th>"+
                    "<th>ФИО</th>" +
                    "<th style='width:300px;'>Телефон</th>" +
                    "<th class='text-center' style='width:100px;'></th>" +
                    "</tr>" +
                    "</thead>";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var firstName=data[i].firstName;
            var lastName=data[i].lastName;
            var patronymic=data[i].patronymic;
            var phoneNum="";
            for( var j=0;j<data[i].phonenumber.length;j++)
                phoneNum +=  data[i].phonenumber[j].phoneNum+"</br>";
            //result += "<label onclick='abonentClick(" + id+ ")' type='button' class='label'>"+ lastName +" "+firstName +" "+patronymic+ "</label>";
           result += 
                    "<tr>" +
                    "<td>" + id + "</td>" +
                    "<td>" + lastName + " " + firstName + " " + patronymic + "</td>" +
                    "<td>" + phoneNum + "</td>" +
                    "<td class='text-center'><button type='button' onclick='deleteClick(" + id+ ")'class='btn btn-danger btn-xs' data-toggle='modal'> Del</button></td>" +
                    "</tr>";  
        }
        result+="</table>"+
                "</div>";
        
        var element =document.getElementById("abonent");
        element.innerHTML = result;
    }
    getAbonentById(id)
    {
        return this.abonentService.getAbonentById(id);
    }
    
    //ViewController
   getAbonentByIdView(id)  {
        var data=this.getAbonentById(id);
        var id=data.id;
            var firstName=data.firstName;
            var lastName=data.lastName;
            var patronymic=data.patronymic;
            var phoneNum="";
            for( var j=0;j<data.phonenumber.length;j++)
                phoneNum +=  data.phonenumber[j].phoneNum+"</br>";
        var result="<div style='margin-left:60px; width:1050px' class='row col-md-6 col-md-offset-2 custyle'>"+
                "<table class='table table-striped custab'>"+
                "<thead>" +
                "<tr>" +
                "<th>#</th>" +
                "<th>ФИО</th>" +
                "<th style='width:180px;'>Телефон</th>" +
                "<th class='text-center' style='width:100px;'></th>" +
                "</tr>" +
                "</thead>" +
                "<tr>" +
                "<td id='td'>" + id + "</td>" +
                "<td>" + lastName + " " + firstName + " " + patronymic + "</td>" +
                "<td>" + phoneNum + "</td>" +
                "<td class='text-center'><button type='button' onclick='deleteClick(" + id+ ")'class='btn btn-danger btn-xs' data-toggle='modal'> Del</button></td>" +
                "</tr>" +
                "</table>" +
                "</div>";        
        var element =document.getElementById("abonent");
        element.innerHTML = result;
    }
    deleteAbonentById(id)
    {
        return this.abonentService.deleteAbonentById(id);
    }
    deleteAbonentByIdView(id){
        this.deleteAbonentById(id);
    }

    insertAbonent(json)
    {
       return this.abonentService.insertAbonent(json);    
    }
}
