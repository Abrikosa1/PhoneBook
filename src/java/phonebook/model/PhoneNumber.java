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
    private int abonentId;
    private String phoneNum;

    public PhoneNumber() {
    }

    public PhoneNumber(int id, int abonentId, String phoneNum) {
        this.id = id;
        this.abonentId = abonentId;
        this.phoneNum = phoneNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAbonentId() {
        return abonentId;
    }

    public void setAbonentId(int abonentId) {
        this.abonentId = abonentId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        hash = 37 * hash + this.abonentId;
        hash = 37 * hash + Objects.hashCode(this.phoneNum);
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
        if (this.abonentId != other.abonentId) {
            return false;
        }
        if (!Objects.equals(this.phoneNum, other.phoneNum)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + "id=" + id + ", abonentId=" + abonentId + ", phoneNum=" + phoneNum + '}';
    }

    

}
