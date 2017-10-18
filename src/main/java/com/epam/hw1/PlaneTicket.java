package com.epam.hw1;


public class PlaneTicket extends Ticket {
    public PlaneTicket() {
    }

    public PlaneTicket(String classTicket) {
        this.classTicket = classTicket;
    }

    public String getClassTicket() {
        return this.classTicket;
    }

    public void setClassTicket(String classTicket) {
        this.classTicket = classTicket;
    }

    public String getTypeTicket() {
        return "plane";
    }
}
