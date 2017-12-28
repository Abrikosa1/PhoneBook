class AdminController
{
    constructor()
    {
        this.adminService = new AdminService();
    }
    
    // DATAController
    getAllAdmin()
    {
        return this.adminService.getAllAdmin();
    }
    
    //ViewController
    getAllAdminView()
    {
        var data=this.getAllAdmin();
        var result="<div style='margin-left:60px; width:1050px' class='row col-md-6 col-md-offset-2 custyle'>"+
                    "<table class='table table-striped custab'style='width:100%'>"+
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
                phoneNum +="<div>"+data[i].phonenumber[j].phoneNum+"</div>";        
           result += 
                    "<tr>" +
                    "<td>" + id + "</td>" +
                    "<td>" + lastName + " " + firstName + " " + patronymic + "</td>" +
                    "<td>" + phoneNum + "</td>" +
                    "<td class='text-center'><button type='button' onclick='deleteClick("+ id +")' class='btn btn-danger btn-xs'> Del</button></td>" +
                    "</tr>";  
        }
        result+="</table>"+
                "</div>";
        
        var element =document.getElementById("admin");
        element.innerHTML = result;
    }
    getAdminById(id)
    {
        return this.adminService.getAdminById(id);
    }
    
    //ViewController
   getAdminByIdView(id)  {
       
        var data=this.getAdminById(id);
        var id=data.id;
            var firstName=data.firstName;
            var lastName=data.lastName;
            var patronymic=data.patronymic;
            var phoneNum="";
            for( var j=0;j<data.phonenumber.length;j++)
                phoneNum +=  data.phonenumber[j].phoneNum+"</br>";
            document.getElementById("mur").style.visibility = "visible";
        var result="<div style='margin-left:60px; width:1050px; margin-top:20px;' class='row col-md-6 col-md-offset-2 custyle'>"+
                "<table class='table table-striped custab' style='margin-top:0px;'>"+
                "<thead>" +
                "<tr>" +
                "<th>#</th>" +
                "<th>ФИО</th>" +
                "<th style='width:300px;'>Телефон</th>" +
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
        var element =document.getElementById("admin2");
        element.innerHTML += result;
    }
    deleteAdminById(id)
    {
        return this.adminService.deleteAdminById(id);
    }
    deleteAdminByIdView(id){
        this.deleteAdminById(id);
    }

    insertAdmin(json)
    {
       return this.adminService.insertAdmin(json);    
    }
}
