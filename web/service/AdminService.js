class AdminService
{
    getAllAdmin()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Phonebook/GetAllAdmin',false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var adminList= JSON.parse(request.responseText );
             return adminList;
         }
         return null;
    }
    
    getAdminById(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Phonebook/GetAdminById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var admin= JSON.parse(request.responseText );
             return admin;
         }
         return null;
    }
    
    deleteAbonentById(id)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Phonebook/DeleteAdminById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var admin= JSON.parse(request.responseText );
             return admin;
         }
         return null;
    }
    insertAdmin(json)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Phonebook/InsertAdmin?json='+json, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             json= JSON.parse(request.responseText );
             return json;
         }
         return null;
    }
}