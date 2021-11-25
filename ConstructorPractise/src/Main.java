public class Main {

    public static void main(String[] args){

        RailwayTicketBooking booking = new RailwayTicketBooking("13110","delhi",
                "banglore","mukesh");

        booking.setModeOfPayment("UPI");
        booking.setPassangerAge("25");
        booking.setBerthSelection("window Side");


        System.out.println(booking.toString());

        System.out.println(booking.bookingProcess());

        booking.setPnr();
        System.out.println("PNR"+" "+"-"+" "+booking.getPnr());
    }
}
