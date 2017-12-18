class AbonentService
{
    getAllAbonent()
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/PhoneBook/GetAllAbonent', false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var abonentList= JSON.parse(request.responseText );
             return abonentList;
         }
         return null;
    }
    
    getabonentById(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/PhoneBook/GetAbonentById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var abonent= JSON.parse(request.responseText );
             return abonent;
         }
         return null;
    }
}