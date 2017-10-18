package com.epam.hw1;


public class TrainTicket extends Ticket {
    public TrainTicket() {
    }

    public TrainTicket(String classTicket) {
        this.classTicket = classTicket;
    }

    public String getClassTicket() {
        return this.classTicket;
    }

    public void setClassTicket(String classTicket) {
        this.classTicket = classTicket;
    }

    public String getTypeTicket() {
        return "train";
    }
}

