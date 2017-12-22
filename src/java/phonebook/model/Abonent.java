/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.model;

import java.util.ArrayList; 
import java.util.List; 
import java.util.Objects;

/**
 *
 * @author Пользователь
 */
public class Abonent {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private List<PhoneNumber> phonenumber;
    
    public Abonent() {
    }

    public Abonent(int id, String firstName, String lastName, String patronymic, List<PhoneNumber> phonenumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.phonenumber = phonenumber;
    }

    public Abonent(int id, String firstName, String lastName, String patronymic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        phonenumber = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public List<PhoneNumber> getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(List<PhoneNumber> phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.firstName);
        hash = 97 * hash + Objects.hashCode(this.lastName);
        hash = 97 * hash + Objects.hashCode(this.patronymic);
        hash = 97 * hash + Objects.hashCode(this.phonenumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abonent other = (Abonent) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.patronymic, other.patronymic)) {
            return false;
        }
        if (!Objects.equals(this.phonenumber, other.phonenumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Abonent{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", patronymic=" + patronymic + ", phonenumber=" + phonenumber + '}';
    }

   
}
