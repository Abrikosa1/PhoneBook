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
            var phoneNum=data[i].phoneNum;
            result +=  "<div class='row'>"+
                        "<div class='col-sm-12 col-md-12'>"+
                          "<div class='thumbnail'>"+
                            "<div class='caption'>"+
                              "<h3>"+phoneNum+"</h3>"+
                            "</div>"+
                          "</div>"+
                        "</div>"+
                      "</div>";
        }

        var element =document.getElementById("phonenumber");
        element.innerHTML = result;
    }
    
    
}
