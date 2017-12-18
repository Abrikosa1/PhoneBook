/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook.model;

import java.util.Objects;

/**
 *
 * @author Пользователь
 */
public class PhoneNumber {
    private int id;
    private String phoneNum;
    

    public PhoneNumber() {
    }
    public PhoneNumber(int id, String phoneNum) {
        this.id = id;
        this.phoneNum = phoneNum;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.phoneNum);
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
        final PhoneNumber other = (PhoneNumber) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.phoneNum, other.phoneNum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "id=" + id + ", phoneNum=" + phoneNum + '}';
    }
    
}
