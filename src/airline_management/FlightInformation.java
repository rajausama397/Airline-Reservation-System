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
public class FlightInformation extends Airlines{
    String despartre,sorce,arri,dext;
    String flightNumber;
    String destination;
    String source;
    String departureTime;
    String arrivalTime;
    String data,d;
     public void setData(String d)
     {
         this.data=d;
     }
     String getData()
     {
         return this.data;
     }
   
   
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
   
        }
         
      
