public class TicketMaker {
    private int ticket = 100;
    private static TicketMaker ticketmaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("Create a TicketMaker instance");
    }

    public static TicketMaker getInstance() {
        return ticketmaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
