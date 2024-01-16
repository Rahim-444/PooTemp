package Ticket;

public class TicketAme extends TicketAchat {
    public static float dayTotal = 0;

    public TicketAme() {
        super();
        dayTotal += super.totalPrice();
    }
}
