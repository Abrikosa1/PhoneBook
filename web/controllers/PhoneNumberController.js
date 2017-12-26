class PhoneNumberController
{
    constructor()
    {
        this.phonenumberService = new PhoneNumberService();
    }
    
    // DATAController
    getPhoneNumberByAbonentId(id)
    {
        return this.phonenumberService.getPhoneNumberByAbonentId(id)   
    }
    
    //ViewController
    getPhoneNumberByAbonentIdView(id)  {
         var data=this.getPhoneNumberByAbonentId(id)
        //var result="";
        var result="<table class='table'>" +
                "<thead>" +
                "<tr>" +
                "<th>Телефон</th>" +
                "<th style='width: 36px;'></th>" +
                "</tr>" +
                "</thead>";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            //var abonentId=data[i].abonentId;
            var phoneNum=data[i].phoneNum;
                result +="<tbody>" +
                "<tr onclick ='phonenumberClick("+id+")'>" +
                "<td>"+phoneNum+"</td>"+
                "<td></td>" +
                "</tr>" +
                "</tbody>";
        }
        result+="</table>"+
                "</div>";
        var element =document.getElementById("phonenumber");
        element.innerHTML = result;
    }
    
    getPhoneNumberById(id)  {
        return this.phonenumberService.getPhoneNumberById(id);
    }
    
    //ViewController
   getPhoneNumberByIdView(id)  {
        var data=this.getPhoneNumberById(id);
        var id=data.id;
        var phoneNum=data.phoneNum;
       
        var result =  "<div class='row'>"+
                        "<div class='col-sm-12 col-md-12'>"+
                          "<div class='thumbnail' >"+
                            "<div class='caption'>"+
                              "<p>"+phoneNum+"</p>"+
                            "</div>"+
                          "</div>"+
                        "</div>"+
                      "</div>";
        var element =document.getElementById("phonenumber");
        element.innerHTML = result;
    }
    
     getAllPhoneNumber()
    {
        return this.phonenumberService.getAllPhoneNumber()   
    }
    getAllPhoneNumberView()
    {
        var data=this.getAllPhoneNumber();
        var result="<table class='table' style='margin-left:160px;'>" +
                "<thead>" +
                "<tr>" +
                "<th>Телефон</th>" +
                "<th style='width: 36px;'></th>" +
                "</tr>" +
                "</thead>";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var phoneNum=data[i].phoneNum;
                result +="<tbody>" +
                "<tr>" +
                "<td>"+phoneNum+"</td>"+
                "<td></td>" +
                "</tr>" +
                "</tbody>";
        }
        result+="</table>"+
                "</div>";
        var element =document.getElementById("phonenumber");
        element.innerHTML = result;
    }
    
}
