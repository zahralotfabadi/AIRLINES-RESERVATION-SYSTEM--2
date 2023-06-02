import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Sign {

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        Scanner input = new Scanner(System.in);
        Inputs inputs=new Inputs();
        Admin admin = new Admin();
        Passengers passengers = new Passengers();

        public String password;
        public String user;
        ArrayList<Passenger> passengersArray = new ArrayList<>();

        //signUp function
        public void signUp() {
            Passenger passenger = new Passenger(user,password,0);
            System.out.println("enter user:");
            user = input.nextLine();
            passenger.setPsrName(user);
            System.out.println("enter password:");
            password = input.nextLine();
            passenger.setPsrPassword(password);
            passengersArray.add(passenger);
        }

        //signIn function
        public int signIn() throws IOException {
            String AdminName = "Admin";
            String AdminPassword = "Admin";
            System.out.println("enter user:");
            user = input.nextLine();
            System.out.println("enter password:");
            password = input.next();
            //If the user is an admin,this condition should be implemented
            if (Objects.equals(user, AdminName) && Objects.equals(password, AdminPassword)) {
                while (true) {
                    System.out.println(ANSI_PURPLE + "\n:::::::::::::::::::::::::::::::::::::::::::\n" +
                            "            ADMIN MENU OPTIONS             \n" +
                            ":::::::::::::::::::::::::::::::::::::::::::\n" +
                            "...........................................\n\n" +
                            "<1> Add\n<2> Update\n<3> Remove\n<4> Flight Schedules\n<0> Sign Out" + ANSI_RESET);

                    int num1;
                    num1 =inputs.inputs();
                    if (num1 == 1) {
                        admin.Add();
                    } else if (num1 == 2) {
                        admin.Update();
                    } else if (num1 == 3) {
                        admin.Remove();
                    } else if (num1 == 4) {
                        admin.FlightSchedules();
                    } else if (num1 == 0) {
                        return 1;
                    }
                }
            } else {
                for (Passenger passenger : passengersArray) {
                    if (passenger.getPsrName().equals(user) && passenger.getPsrPassword().equals(password)) {
                        //If the user was registered,this loop while be executed
                        while (true) {
                            passengers.setPassenger(passenger);
                            System.out.println(ANSI_YELLOW + "\n:::::::::::::::::::::::::::::::::::::::::::\n" +
                                    "            PASSENGER MENU OPTIONS             \n" +
                                    "::::::::::::::::::::::::::::::::::::::::::::\n" +
                                    "............................................\n\n" +
                                    "<1> Change password\n<2> Search flight tickets\n<3> Booking ticket\n<4> Ticket cancellation\n<5> Booked tickets\n<6> Add charge\n<0> Sign out" + ANSI_RESET);
                            int num2;
                            num2 = inputs.inputs();
                            if (num2 == 1) {
                                passengers.ChangePassword();
                            } else if (num2 == 2) {
                                passengers.SearchFlightTickets();
                            } else if (num2 == 3) {
                                passengers.BookingTicket();
                            } else if (num2 == 4) {
                                passengers.TicketCancellation();
                            } else if (num2 == 5) {
                                passengers.BookedTickets();
                            } else if (num2 == 6) {
                                passengers.AddCharge();
                            } else if (num2 == 0) {
                                return 1;
                            }

                        }
                    }

                }
            }
            return 0;
        }

    }

