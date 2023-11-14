/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daud Raza
 */
public class FlightController extends FlightInformation{
    String show;
   String filename="Flighta.txt";
   String data,d;
   String source,Destination,Arrival,Departure;
   public void setTime(String s,String d,String a,String dep)
   {
       this.source=s;
       this.Destination=d;
       this.Arrival=a;
       this.Departure=dep;
   }
   public void setSearc(String d)
   {
       this.data=d;
       
   }
   String getSearc()
   {
       return this.data;
   }
   
   
     public void writeflight()
    {
        
        try{
         
        FileWriter fw2 = new FileWriter("Flighta.txt",true);
            try (BufferedWriter bb = new BufferedWriter(fw2)) {
                
                bb.write(
                        this.name+"\r\n"+
                        this.Id+"\r\n"+
                        this.Type+"\r\n"+
                        this.source+"\r\n"+
                        this.destination+"\r\n"+
                        this.arrivalTime+"\r\n"+
                        this.departureTime+"\r\n"+
                        this.flightNumber+"\r\n"
                );
            }
        }
        catch(Exception e){
           System.out.println("cannot excess file");
      }
    }    
        
          public void checkinFile(){
        try {
            
            int lines=0;
            FileReader fr1=new FileReader("Flighta.txt");
            BufferedReader br1=new BufferedReader(fr1);
            while(br1.readLine()!=null){
                lines++;
                }
           
            fr1.close();
            br1.close();
            FileReader fr2=new FileReader("Flighta.txt");
            BufferedReader br2=new BufferedReader(fr2);
            for(int i=0;i<lines-1;i++){
                this.d=br2.readLine();
                if(d.equals(this.flightNumber)){
                    this.name=name;
                    this.Id=br2.readLine();
                     this.Type=br2.readLine();
                     this.source=br2.readLine();
                     this.destination=br2.readLine();
                     this.arrivalTime=br2.readLine();
                     this.departureTime=br2.readLine();
                     this.flightNumber=br2.readLine();
                 
                   
                    lines=1000;
                    break;
               
                }
            }    
           
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("error opening file");
        } catch (IOException ex) {
           // Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        } 
          }
          
      
               
        
        
        public void setUpdate(String s,String dd,String a,String d){
            this.source=s;
            this.Destination=dd;
            this.Arrival=a;
            this.Departure=d;
       
        }    
        
        
        public void ChangeTimes(){
        String[] data=new String[8];
        try {
            FileReader fr1= new FileReader(filename);
            BufferedReader br1=new BufferedReader(fr1);
            for(int i=0;i<8;i++){
                data[i]=br1.readLine();
            }
            br1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FlightInformation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FlightInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        data[3]="Source : "+this.source;
        data[4]="Destination : "+this.Destination;
        data[5]="Arrival : "+this.Arrival;
        data[6]="Departure :"+this.Departure;
       
        
        try {
           FileWriter f1= new FileWriter(filename);
           PrintWriter p1=new PrintWriter(f1);
           for(int j=0;j<8;j++){
               p1.write(data[j]+"\r\n");
           }
           p1.close();
        } catch (IOException ex) {
            Logger.getLogger(FlightInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        
        
        public void chekairline()
    {
        this.setData(this.Id);
        readfromfile();
        this.name=getName();
        this.Id=getId();
        this.Type=this.getType();
        this.source=this.getSource();
        this.Destination=this.getDestination();
        this.Arrival=this.getArrivalTime();
        this.Departure=this.getDepartureTime();
        this.flightNumber=this.getFlightNumber();
    }
        
        
        
        public void readfromfile(){
        try {
            
            int lines=0;
            FileReader fr1=new FileReader("Flighta.txt");
            BufferedReader br1=new BufferedReader(fr1);
            while(br1.readLine()!=null){
                lines++;
                }
           
            fr1.close();
            br1.close();
            FileReader fr2=new FileReader("Flighta.txt");
            BufferedReader br2=new BufferedReader(fr2);
            for(int i=0;i<lines-1;i++){
                this.d=br2.readLine();
                if(d.equals(this.flightNumber)){
                    this.name=name;
                    this.Id=br2.readLine();
                     this.Type=br2.readLine();
                     this.source=br2.readLine();
                     this.destination=br2.readLine();
                     this.arrivalTime=br2.readLine();
                     this.departureTime=br2.readLine();
                     this.flightNumber=br2.readLine();
                 
                   
                    lines=1000;
                    break;
               
                }
            }    
           
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("error opening file");
        } catch (IOException ex) {
           // Logger.getLogger(DataView.class.getName()).log(Level.SEVERE, null, ex);
        } 
          }
        
        
        
    
}
