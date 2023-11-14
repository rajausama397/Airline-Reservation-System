/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daud Raza
 */
public class passengerData extends Passenger{
    
    
     public void writefile()
    {
        
        try{
         
        FileWriter fw2 = new FileWriter("MyFile.txt",true);
            try (BufferedWriter bb = new BufferedWriter(fw2)) {
                
                bb.write(name+"\r\n"+
                        id+"\r\n"+
                        gender+"\r\n"+
                        phoneNum+"\r\n"+
                        cnicNo+"\r\n"+
                        address+"\r\n");
            }
        }
        catch(Exception e){
           System.out.println("cannot excess file");
      }
}
    public void chekfile()
    {
        this.setData(this.name);
        checkinFile();
        this.name=getName();
        this.id=getId();
        this.cnicNo=this.getCnicNo();
        this.gender=this.getGender();
        this.phoneNum=this.getPhoneNum();
        this.address=this.getAddress();
    }
    
      public void checkinFile(){
        try {
            
            int lines=0;
            FileReader fr1=new FileReader("MyFile.txt");
            BufferedReader br1=new BufferedReader(fr1);
            while(br1.readLine()!=null){
                lines++;
                }
           
            fr1.close();
            br1.close();
            FileReader fr2=new FileReader("MyFile.txt");
            BufferedReader br2=new BufferedReader(fr2);
            for(int i=0;i<lines-1;i++){
                d=br2.readLine();
                if(d.equals(this.name)){
                    this.name=name;
                    this.id=br2.readLine();
                    this.cnicNo=br2.readLine();
                    this.gender=br2.readLine();
                    this.phoneNum=br2.readLine();
                    this.address=br2.readLine();
                 
                   
                    lines=1000;
                    break;
               
                }
            }    
           
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("error opening file");
        } catch (IOException ex) {
            Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
}
