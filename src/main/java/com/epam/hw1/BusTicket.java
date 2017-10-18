package com.epam.hw1;


public class BusTicket extends Ticket{
    public BusTicket() {
    }

    public BusTicket (String classTicket){
        this.classTicket = classTicket;
    }

    public String getClassTicket(){
        return this.classTicket;
    }

    public void setClassTicket(String classTicket){
        this.classTicket = classTicket;
    }

    public String getTypeTicket(){
        return "bus";
    }
}
