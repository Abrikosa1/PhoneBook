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
        
        var result="<div class='btn-group-vertical'>";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var firstName=data[i].firstName;
            var lastName=data[i].lastName;
            var patronymic=data[i].patronymic;
            //!!!!!!!onmousemove
            result += "<button onclick='abonentClick(" + id+ ")' type='button' class='btn btn-default'>"+ firstName +" "+ lastName+" "+patronymic+ "</button>";
        }
        result+="</div>";
        var element =document.getElementById("abonent");
        element.innerHTML = result;
    }
    
    
}
