package TicketMachine;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class TicketMachine {

    public static void main(String[] args){

        List<List<String>> destinationList = List.of(
                asList("Istanbul", "Eskisehir", "Ankara")
        );

        List<List<Ticket>> ticketList = asList(
                asList(new AdultTicket("Adult 1"), new AdultTicket("Adult 2")),
                asList(new ChildTicket("Child 1"), new ChildTicket("Child 2"))
        );

        List<String> destinations = flattenList(destinationList);
        System.out.println(destinations);

        List<Ticket> tickets = flattenList(ticketList);
        String names = getTicketOwnersName(tickets);
        System.out.println(names);
        System.out.println(tickets);

        System.out.println("Total Price of tickets: " + getTotalPrice(tickets));

        List<AdultTicket> adultTickets = asList(new AdultTicket("Adult 3"), new AdultTicket("Adult 4"));
        System.out.println("Total price of two adult tickets: " + getTotalPrice(adultTickets));


    }

    static <T> List<T> flattenList(List<List<T>> nestedList) {
        List<T> flattenedList = new ArrayList<>();
        nestedList.forEach(flattenedList::addAll);
        return flattenedList;
    }

    static int getTotalPrice(List<? extends Ticket> tickets){
        int totalPrice = 0;
        for(Ticket ticket : tickets){
            totalPrice += ticket.getPrice();
        }

        return totalPrice;
    }

    static String getTicketOwnersName(List<? extends Ticket> tickets){
        StringBuilder names = new StringBuilder();
        for(Ticket ticket : tickets){
            names.append(ticket.getOwnerName()).append(" ");
        }

        return names.toString().trim();
    }
}
