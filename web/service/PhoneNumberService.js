class PhoneNumberService
{
    getPhoneNumberByAbonentId(id)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/NewsPin1/GetAbonentById?id=' + id, false);
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
}