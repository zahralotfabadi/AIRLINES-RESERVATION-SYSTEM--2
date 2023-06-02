import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
    public class Passengers {
        Scanner scanner = new Scanner(System.in);
        Schedule schedule = new Schedule();
        Passenger passenger;
//        Ticket ticket = new Ticket();
//        int counter = schedule.flightArrayList().size();

        public void setPassenger(Passenger passenger) {
            this.passenger = passenger;
        }

        //The passenger changes his password with this function
        public void ChangePassword() {
            System.out.println("enter passWordNew:");
            passenger.setPsrPassword(scanner.nextLine());
        }

        //The passenger searches for the desired flight with this function

        public void SearchFlightTickets() throws IOException {

            RandomAccessFile sfile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
            FlightFile flightFile = new FlightFile(sfile);
            System.out.println("enter a word to search for a flight ticket: ");
            String wordSearch1 = scanner.nextLine();
            String wordSearch2;


            switch (wordSearch1) {
                case "flightId":
                    System.out.println("enter element of flightId:");
                    wordSearch2 = scanner.nextLine();
                    if (flightFile.readFlightFormatFile().getFlightId().equals(wordSearch2)) {
                        System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    }

                    break;
                case "origin":
                    System.out.println("enter element of origin:");
                    wordSearch2 = scanner.nextLine();
                    if (flightFile.readFlightFormatFile().getOrigin().equals(wordSearch2)) {
                        System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    }
                    break;
                case "destination":
                    System.out.println("enter element of destination:");
                    wordSearch2 = scanner.nextLine();
                    if (flightFile.readFlightFormatFile().getDestination().equals(wordSearch2)) {
                        System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    }
                    break;
                case "data":
                    System.out.println("enter element of data:");
                    wordSearch2 = scanner.nextLine();
                    if (flightFile.readFlightFormatFile().getDate().equals(wordSearch2)) {
                        System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    }
                    break;
                case "time":
                    System.out.println("enter element of time:");
                    wordSearch2 = scanner.nextLine();
                    if (flightFile.readFlightFormatFile().getTime().equals(wordSearch2)) {
                        System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    }
                    break;
                case "price":
                    System.out.println("enter element of price:");
                   int wordSearch3 = scanner.nextInt();
                    if (flightFile.readFlightFormatFile().getPrice()==(wordSearch3)) {
                        System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    }
                    break;
                case "seats":
                    System.out.println("enter element of seats:");
                    wordSearch3 = scanner.nextInt();
                    if (flightFile.readFlightFormatFile().getSeats()==(wordSearch3)) {
                        System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    }
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }


        }

        //The passenger book tickets with this function
        public void BookingTicket() throws IOException {
            RandomAccessFile sfile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
            FlightFile flightFile = new FlightFile(sfile);
            TicketFile ticketFile = new TicketFile(sfile);
            System.out.println("enter Flight Id to book the ticket:");
            String enterFlightId = scanner.next();
            if (enterFlightId.equals(flightFile.readFlightFormatFile().getFlightId())){
                if (passenger.getCharge()>=(flightFile.readFlightFormatFile().getPrice())){
                    flightFile.readFlightFormatFile().setSeats(flightFile.readFlightFormatFile().getSeats()-1);

                    passenger.setCharge(passenger.getCharge() - flightFile.readFlightFormatFile().getPrice());
                    System.out.println(passenger.getCharge());
                    String ticketId = passenger.getPsrName() + passenger.getPsrPassword() + flightFile.readFlightFormatFile().getFlightId();

//                    ticket.setTicketId(ticketId);
                    System.out.println("ticketId:" + ticketId);
                    ticketFile.writeTicketInFile(new Ticket(ticketId));
//                    ticket.bookTicket.add(flightFile.readFlightFormatFile());
                }
            }else {
                        System.out.println("not enough charge!=>return to the previous menu.");
                    }
        }
//The passenger cancels the ticket with this function

        public void TicketCancellation() throws IOException {

            RandomAccessFile sfile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
            FlightFile flightFile = new FlightFile(sfile);
            System.out.println("enter ticket Id to cancel the ticket:");
            String enterTicketId = scanner.next();

                if (enterTicketId.equals(passenger.getPsrName() + passenger.getPsrPassword() + flightFile.readFlightFormatFile().getFlightId())) {
                    flightFile.readFlightFormatFile().setSeats(flightFile.readFlightFormatFile().getSeats() + 1);
                    passenger.setCharge(passenger.getCharge() + flightFile.readFlightFormatFile().getPrice());
//                    for (int j = 0; j < ticket.bookTicket.size(); j++) {
//                        if (flightFile.readFlightFormatFile().getFlightId().equals(ticket.bookTicket.get(j).getFlightId())) {
//                            ticket.bookTicket.remove(j);
//                            j--;
//                        }
//                    }

                }
            }

        //The passenger sees the booked tickets with this function
        public void BookedTickets() {
//            for (int j = 0; j < ticket.getBookTicket().size(); j++) {
//                System.out.println("|\t"+ticket.getBookTicket().get(j).getFlightId()+"\t|\t" + ticket.getBookTicket().get(j).getOrigin()+"\t|\t" + ticket.getBookTicket().get(j).getDestination()+"\t|\t" + ticket.getBookTicket().get(j).getDate()+"\t|\t" + ticket.getBookTicket().get(j).getTime() +"\t|\t"+ ticket.getBookTicket().get(j).getPrice()+"\t|\t" + ticket.getBookTicket().get(j).getSeats()+"\t|\t");
//            }
        }
//The passenger increases the charge with this function

        public void AddCharge() {
            System.out.println("enter the charge increment amount:");
            int addCharge = scanner.nextInt();
            passenger.setCharge(passenger.getCharge() + addCharge);
            System.out.println(passenger.getCharge());
        }

    }
