package TicketMachine;

public class ChildTicket extends Ticket {

    ChildTicket(String ownerName) {
        super(ownerName);
    }
    @Override
    public int getPrice() {
        return 5;
    }
    public String toString() {
        return "Child Ticket";
    }

}
