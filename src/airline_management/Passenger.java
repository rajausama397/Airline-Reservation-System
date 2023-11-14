/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_management;
/**
 *
 * @author Daud Raza
 */
public class Passenger {
     public String name,phoneNum,address,country,cnicNo,gender,id;
     String data,d;
     public void setData(String d)
     {
         this.data=d;
     }
     String getData()
     {
         return this.data;
     }
     public void setId(String iddd)
     {
         this.id=iddd;
     }
     public String getId()
     {
      return this.id;   
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCnicNo() {
        return cnicNo;
    }

    public void setCnicNo(String cnicNo) {
        this.cnicNo = cnicNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
   
    
     
    
}
