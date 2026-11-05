package TicketMachine;

public class AdultTicket extends Ticket {
    AdultTicket(String ownerName) {
        super(ownerName);
    }
    @Override
    public int getPrice() {
        return 10;
    }
    public String toString() {
        return "AdultTicket";
    }
}
