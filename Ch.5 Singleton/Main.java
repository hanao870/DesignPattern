public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2)
            System.out.println("obj1 と obj2 は同じインスタンスです");
        else
            System.out.println("obj1 と obj2 は異なるインスタンスです");

        System.out.println("End.");

        TestTicketMaker();
        TestTriple();
    }

    public static void TestTicketMaker() {
        TicketMaker maker = TicketMaker.getInstance();
        System.out.println("Ticket Num : " + maker.getNextTicketNumber());
        System.out.println("Ticket Num : " + maker.getNextTicketNumber());
        System.out.println("Ticket Num : " + maker.getNextTicketNumber());
    }

    public static void TestTriple() {
        for(int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + " : " + triple);
        }
    }
}
