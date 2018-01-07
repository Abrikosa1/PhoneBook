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
    getAllPhoneNumber() {
         var request = new XMLHttpRequest();
         request.open('GET', '/Phonebook/GetAllPhoneNumber', false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var phonenumberList= JSON.parse(request.responseText );
             return phonenumberList;
         }
         return null;
    }
    insertPhoneNumber(json)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Phonebook/InsertPhoneNumber?json='+json, false);
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
      deletePhoneNumberById(id)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Phonebook/DeletePhoneNumberById?id=' + id, false);
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
    deletePhoneNumber(id)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Phonebook/DeletePhoneNumber?id=' + id, false);
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
    updatePhoneNumber(json)
    {
        var request = new XMLHttpRequest();
        request.open('GET', '/Phonebook/UpdatePhoneNumber?json='+json, false);
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
    getPhoneNumByPhoneNum(num)
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/Phonebook/GetPhoneNumberByPhoneNum?num=' + num, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var phonenumberList= JSON.parse(request.responseText );
             return phonenumberList;
         }
         return null;
    }
}