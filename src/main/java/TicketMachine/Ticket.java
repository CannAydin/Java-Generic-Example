package TicketMachine;

public abstract class Ticket {

    private final String ownerName;
    Ticket(String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return ownerName;
    }

    public abstract int getPrice();
}
