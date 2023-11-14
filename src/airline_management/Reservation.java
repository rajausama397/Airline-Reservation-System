/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_management;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Daud Raza
 */
public class Reservation {
    
    int aaa;
    public void setAmount(int aa)
    {
        this.aaa=aa;
    }
    int getAmount()
    {
        return this.aaa;
    }
    public String Data;
    public int total;
    public int total1;
    public int seats;
    public int bseats;
    public int totalseats = 60;
    public int totalseats1 = 60;
    public int totalamount;
    public int totalamount1;
    public int bill = 9500;
    public int businessseat = 12500;
    public int returnedamount;
    public int totalbalance;
    public int returnedamount1;
    public int totalbalance1;
     int a;
     
   
    public int seatfunction(int b){
  
      this.seats = b;
  
      return seats;
  }
    public int bSeatFunction(int b){
    this.bseats = b;
    
    return bseats;
    
    }
 
    public int calculation(){
    
        if(seats <= 0){
            JOptionPane.showMessageDialog(null, "Total Seats Are 60");
        
        }
        else
            if(seats < 60)
            {
                
        total = totalseats - seats;
        
       
             
        
        }else{
            JOptionPane.showMessageDialog(null, "Total Seats Are 60");
            
            }
         
       
    return total;
    }
    public int businessCalculation(){
     if(bseats <= 0){
            JOptionPane.showMessageDialog(null, "Total Seats Are 60");
        
        }
        else
            if(bseats < 60)
            {
                
        total1 = totalseats1 - bseats;
        
       
             
        
        }else{
            JOptionPane.showMessageDialog(null, "Total Seats Are 60");
            
            }
         
       
    return total1;
    
    }
    public int billfn(int a){
    
    this.bill = a;
    
    return bill;
    }
    public int businessBill(int b){
    
    this.businessseat = b;
    
    return businessseat;
    }
    public int billCalculation(){
     if(seats <= 0){ 
         
     }
      else  if(seats < 30){    
    totalamount = seats * bill;
    } 
    
       
    
    
    return totalamount;
    }
    
    public int returningamount(int amount){
    
        this.returnedamount = amount;
    
        return returnedamount;
    }
    public int BusinessReturningAmount(int Businessamount){
    
    this.returnedamount1 = Businessamount;
    
    return returnedamount1;
    
    
    }
    
    public int remainingBalance(){
     if(returnedamount < totalamount){
         JOptionPane.showMessageDialog(null, "Check the amount entered");
     }  else{
         totalbalance = returnedamount - totalamount ;
         
     }
    return totalbalance;
    }
    public int businessRemainingBalance(){
     if(returnedamount1 < totalamount1){
         JOptionPane.showMessageDialog(null, "Check the amount entered");
     }  else{
         totalbalance1 = returnedamount1 - totalamount1 ;
         
     }
    return totalbalance1;
    
    
    
    
    }
    
    public void setSeats(int seat){
    this.seats = seat;
    
    }
    public int getSeats(){
    
        return this.seats;
    
    }
    public void setBSeats(int bseat){
    
        this.bseats=bseat;
    
    }
    public int getBSeats(){
    
    return this.bseats;
    }
     public int billBusinessCalculation(){
     if(bseats <= 0){ 
         
     }
      else  if(bseats < 60){    
    totalamount1 = bseats * businessseat;
    
    } 
    return totalamount1;
     }    
   public void setvalue(int a){
   
   this.a = a;
   
   }
   public void setCalculation(int b){
   
    seatfunction(b);
   
   }
   public void businessSetCalculation(int b){
       
        bSeatFunction(b);
   
   }
   
   public int setFn(){
   
       return calculation();
   
   }
   public int showfn(){
   
       return calculation();
   
   }
   public int setBusinessFn(){
   
       return businessCalculation();
   
   }
   public int showBusinessFn(){
   
       return businessCalculation();
   
   }
   public void setbill(int a){
          billfn(a);
   
   
   }
   public void setBusinessBill(int b){
   
       businessBill(b);
   
   }
   public int setBill(){
   
       return billCalculation();
   
   
   }
   public void getBill(){
   
           billCalculation();
   }
   public int setBusinessClassBill(){
   
       return billBusinessCalculation();
   }
   public int showbill(){
       
       return billCalculation();
   
   }
   public int showBusinessBill(){
   
   return billBusinessCalculation();
   }
   public void returningbalance(int amount){
   
   returningamount(amount);
   }
   public void businessReturningBalance(int businessamount){
   
       BusinessReturningAmount(businessamount);
   
   }
   
   public int returnedamount(){
   
   return remainingBalance();
   
   }
   public int amount(){
       
      return remainingBalance();
       
   }
   public int businessReturnedAmount(){
   
       return businessRemainingBalance() ;
   
   }
   public int businessAmount(){
   
       return businessRemainingBalance();
   
   
   }
  
   public int getseat(){
   
   return getSeats();
   }
   public int showbusinessClassBill(){
   
   return billBusinessCalculation();
   
   }
          
 

}
