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
        var result="";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            //var abonentId=data[i].abonentId;
            var phoneNum=data[i].phoneNum;
             result +=  "<div class='row'>"+
                        "<div class='col-sm-4 col-md-8'>"+
                          "<div class='thumbnail' onclick ='phonenumberClick("+id+")'   >"+
                            "<div class='caption'>"+
                              "<p>"+phoneNum+"</p>"+
                            "</div>"+
                          "</div>"+
                        "</div>"+
                      "</div>";
        }

        var element =document.getElementById("phonenumber");
        element.innerHTML = result;
    }
    
    getPhoneNumberById(id)  {
        return this.phonenumberService.getPhoneNumberById(id);
    }
    
    //ViewController
   getPhoneNumberById(id)  {
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
}
