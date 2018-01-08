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
        var num = 0;
        var result="<div style='margin-left:60px; width:1050px' class='row col-md-6 col-md-offset-2 custyle'>"+
                    "<table class='table table-striped custab'style='width:100%'>"+
                    "<thead>"+
                    "<tr>"+
                    "<th>#</th>"+
                    "<th>ФИО</th>" +
                    "<th style='width:300px;'>Телефон</th>" +
                    "<th class='text-center' ></th>" +
                    "</tr>" +
                    "</thead>";
        for(var i=0; i<data.length;i++)
        {   
            num +=1; 
            var id=data[i].id;
            var firstName=data[i].firstName;
            var lastName=data[i].lastName;
            var patronymic=data[i].patronymic;
            var phoneNum="";
            for( var j=0;j<data[i].phonenumber.length;j++)
                phoneNum +="<div>"+data[i].phonenumber[j].phoneNum+"</div>";        
           result += 
                    "<tr>" +
                    "<td>" + num + "</td>" +
                    "<td>" + lastName + " " + firstName + " " + patronymic + "</td>" +
                    "<td>" + phoneNum + "</td>" +
                    //"<td class='text-center'><button type='button' onclick='deleteClick("+ id +")' class='btn btn-danger btn-xs'> Del</button></td>" +
                    "<td class='text-center'><button disabled type='button' class='btn btn-info btn-xs mur' onclick='updateClick("+ id +")' style='margin-right:10px;'>Edit</button><button disabled onclick='deleteClick("+ id +")' type='button' class='btn btn-danger btn-xs mur'>Del</button></td>"+
                    "</tr>";  
        }
        result+="</table>"+
                "</div>";
        
        var element =document.getElementById("abonent");
        element.innerHTML = result;
    }
     getAbonentByFullname(name)
    {
        return this.abonentService.getAbonentByFullname(name);
    }
    //ViewController
   getAbonentByFullnameView(name)  {
            var data=this.getAbonentByFullname(name);
             var num = 0;
        var result="<div style='margin-left:60px; width:1050px' class='row col-md-6 col-md-offset-2 custyle'>"+
                    "<table class='table table-striped custab'style='width:100%'>"+
                    "<thead>"+
                    "<tr>"+
                    "<th>#</th>"+
                    "<th style='width:470px;'>ФИО</th>" +
                    "<th style='width:300px;'>Телефон</th>" +
                    "<th class='text-center' ></th>" +
                    "</tr>" +
                    "</thead>";
        for(var i=0; i<data.length;i++)
        {   
            num +=1; 
            var id=data[i].id;
            var firstName=data[i].firstName;
            var lastName=data[i].lastName;
            var patronymic=data[i].patronymic;
            var phoneNum="";
            for( var j=0;j<data[i].phonenumber.length;j++)
                phoneNum +="<div>"+data[i].phonenumber[j].phoneNum+"</div>";        
           result += 
                    "<tr>" +
                    "<td>" + num + "</td>" +
                    "<td>" + lastName + " " + firstName + " " + patronymic + "</td>" +
                    "<td>" + phoneNum + "</td>" +
                    //"<td class='text-center'><button type='button' onclick='deleteClick("+ id +")' class='btn btn-danger btn-xs'> Del</button></td>" +
                    "<td class='text-center'><button disabled type='button' class='btn btn-info btn-xs mur' onclick='updateClick("+ id +")' style='margin-right:10px;'>Edit</button><button disabled type='button' onclick='deleteClick("+ id +")' class='btn btn-danger btn-xs mur'>Del</a></td>"+
                    "</tr>";  
        }
        result+="</table>"+
                "</div>";
        var element =document.getElementById("abonent2");
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
            var num = 0;
            var firstName=data.firstName;
            var lastName=data.lastName;
            var patronymic=data.patronymic;
            var phoneNum="";
            for( var j=0;j<data.phonenumber.length;j++){
                phoneNum +=  data.phonenumber[j].phoneNum+"</br>";
                num +=1;
                }
            document.getElementById("mur").style.visibility = "visible";
        var result="<div style='margin-left:60px; width:1050px; margin-top:20px;' class='row col-md-6 col-md-offset-2 custyle'>"+
                "<table class='table table-striped custab' style='margin-top:0px;width:100%'>"+
                "<thead>" +
                "<tr>" +
                "<th>#</th>" +
                "<th style='width:450px;'>ФИО</th>" +
                "<th style='width:300px;'>Телефон</th>" +
                "<th class='text-center'></th>" +
                "</tr>" +
                "</thead>" +
                "<tr>" +
                "<td id='td'>" + num + "</td>" +
                "<td>" + lastName + " " + firstName + " " + patronymic + "</td>" +
                "<td>" + phoneNum + "</td>" +
                "<td class='text-center'><button disabled type='button' class='btn btn-info btn-xs mur' onclick='updateClick("+ id +")' style='margin-right:10px;'>Edit</button><button disabled type='button' onclick='deleteClick("+ id +")' class='btn btn-danger btn-xs mur'>Del</a></td>"+
                //<a class='btn btn-info btn-xs' onclick='updateClick("+ id +")'>Edit</a> 
                "</tr>" +
                "</table>" +
                "</div>";        
        var element =document.getElementById("abonent2");
        element.innerHTML += result;
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
    updateAbonent(json)
    {
       return this.abonentService.updateAbonent(json);    
    }
    abonentByPhoneNumView(name) {
             var data = this.getAllAbonent();
             var num = 0;
             var result="<div style='margin-left:60px; width:1050px' class='row col-md-6 col-md-offset-2 custyle'>"+
                    "<table class='table table-striped custab'style='width:100%'>"+
                    "<thead>"+
                    "<tr>"+
                    "<th>#</th>"+
                    "<th style='width:470px;'>ФИО</th>" +
                    "<th style='width:300px;'>Телефон</th>" +
                    "<th class='text-center' ></th>" +
                    "</tr>" +
                    "</thead>";
        for(var i=0; i<name.length;i++)
        {   
            for(var j=0; j<data.length;j++){
                if(name[i].abonentId==data[j].id){
            num +=1; 
            var id=data[j].id;
            var firstName=data[j].firstName;
            var lastName=data[j].lastName;
            var patronymic=data[j].patronymic;
            var phoneNum="";
            for( var v=0;v<data[j].phonenumber.length;v++)
                phoneNum +="<div>"+data[j].phonenumber[v].phoneNum+"</div>";        
           result += 
                    "<tr>" +
                    "<td>" + num + "</td>" +
                    "<td>" + lastName + " " + firstName + " " + patronymic + "</td>" +
                    "<td>" + phoneNum + "</td>" +
                    //"<td class='text-center'><button type='button' onclick='deleteClick("+ id +")' class='btn btn-danger btn-xs'> Del</button></td>" +
                    "<td class='text-center'><button disabled type='button' class='btn btn-info btn-xs mur' onclick='updateClick("+ id +")' style='margin-right:10px;'>Edit</button><button disabled type='button' onclick='deleteClick("+ id +")' class='btn btn-danger btn-xs mur'>Del</a></td>"+
                    "</tr>";
                }
            }
        }
        result+="</table>"+
                "</div>";
        var element =document.getElementById("abonent2");
        element.innerHTML = result;
    }
}
