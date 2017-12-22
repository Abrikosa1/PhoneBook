class PhoneNumberService
{
    getPhoneNumberByAbonentId(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Phonebook/GetAbonentById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var abonent= JSON.parse(request.responseText );
             return abonent.phonenumber;
         }
         return null;
    }
    getPhoneNumberById(id) {
         var request = new XMLHttpRequest();
         request.open('GET', '/Phonebook/GetPhoneNumberById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var phonenumber= JSON.parse(request.responseText );
             return phonenumber;
         }
         return null;
    }
}