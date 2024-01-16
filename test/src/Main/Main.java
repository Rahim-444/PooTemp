package Main;

import Ticket.*;

public class Main {
    public static void main(String[] args) {
        TicketAme[] tickets = new TicketAme[3];
        for (int i = 0; i < 2; i++) {
            tickets[i] = new TicketAme();
            tickets[i].afficher();
        }
        System.out.println("the total of the day is : " + TicketAme.dayTotal);
    }
}
