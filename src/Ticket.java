import java.util.ArrayList;

    public class Ticket {
        private String ticketId;

        public Ticket(String ticketId) {
            this.ticketId = ticketId;
        }
        //        public ArrayList<Flight> bookTicket = new ArrayList<>();

//        public ArrayList<Flight> getBookTicket() {
//            return bookTicket;
//        }

//        public void setBookTicket(ArrayList<Flight> bookTicket) {
//            this.bookTicket = bookTicket;
//        }

        public String getTicketId() {
            return ticketId;
        }

        public void setTicketId(String ticketId) {
            this.ticketId = ticketId;
        }
    }
