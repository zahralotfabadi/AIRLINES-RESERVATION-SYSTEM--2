import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Admin {
    Scanner scanner = new Scanner(System.in);
    String flightIdNew, originNew, destinationNew, dateNew, timeNew;
    int priceNew, seatsNew;


    //Admin adds flights with this function
    public void Add() throws IOException {
        System.out.println("to add a flight,enter its information:\nflightId:");
        flightIdNew = scanner.nextLine();
        System.out.println("origin:");
        originNew = scanner.next();
        System.out.println("destination:");
        destinationNew = scanner.next();
        System.out.println("date:");
        dateNew = scanner.next();
        System.out.println("time:");
        timeNew = scanner.next();
        System.out.println("price:");
        priceNew = scanner.nextInt();
        System.out.println("seats:");
        seatsNew = scanner.nextInt();
        RandomAccessFile randomAccessFile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
        FlightFile flightFile = new FlightFile(randomAccessFile);
        flightFile.writeFlightInFile(new Flight(flightIdNew, originNew, destinationNew, dateNew, timeNew, priceNew, seatsNew));
        FlightSchedules();
    }

    //Admin updates flights with this function
    public void Update() throws IOException {
        FlightSchedules();

        RandomAccessFile randomAccessFile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
        FlightFile flightFile = new FlightFile(randomAccessFile);
        System.out.println("enter name of flight  want to update:");
        String numUpdate1 = scanner.next();
        String numUpdate2;
        switch (numUpdate1) {
            case "flightId":
                System.out.println("enter element of flightId:");
                numUpdate2 = scanner.nextLine();
                if (flightFile.readFlightFormatFile().getFlightId().equals(numUpdate2)) {
                    System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    System.out.println("enter element_new");
                    flightFile.readFlightFormatFile().setFlightId(scanner.nextLine());
                }
                break;
            case "origin":
                System.out.println("enter element of origin:");
                numUpdate2 = scanner.nextLine();

                if (flightFile.readFlightFormatFile().getOrigin().equals(numUpdate2)) {
                    System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    System.out.println("enter element_new");
                    flightFile.readFlightFormatFile().setOrigin(scanner.nextLine());
                }
                break;
            case "destination":
                System.out.println("enter element of destination:");
                numUpdate2 = scanner.nextLine();
                if (flightFile.readFlightFormatFile().getDestination().equals(numUpdate2)) {
                    System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    System.out.println("enter element_new");
                    flightFile.readFlightFormatFile().setDestination(scanner.nextLine());
                }
                break;
            case "date":
                System.out.println("enter element of date:");
                numUpdate2 = scanner.nextLine();
                if (flightFile.readFlightFormatFile().getDate().equals(numUpdate2)) {
                    System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    System.out.println("enter element_new");
                    flightFile.readFlightFormatFile().setDate(scanner.nextLine());
                }
                break;
            case "time":
                System.out.println("enter element of time:");
                numUpdate2 = scanner.nextLine();
                if (flightFile.readFlightFormatFile().getTime().equals(numUpdate2)) {
                    System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    System.out.println("enter element_new");
                    flightFile.readFlightFormatFile().setTime(scanner.nextLine());
                }
                break;
            case "price":
                System.out.println("enter element of price:");
                int numUpdate3 = scanner.nextInt();
                if (flightFile.readFlightFormatFile().getPrice() == numUpdate3) {
                    System.out.println("|\t" + flightFile.readFlightFormatFile().getFlightId() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    System.out.println("enter element_new");
                    flightFile.readFlightFormatFile().setPrice(scanner.nextInt());
                }
                break;
            case "seats":
                System.out.println("enter element of seats:");
                numUpdate3 = scanner.nextInt();
                if (flightFile.readFlightFormatFile().getSeats() == (numUpdate3)) {
                    System.out.println("|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
                    System.out.println("enter element_new");
                    flightFile.readFlightFormatFile().setSeats(scanner.nextInt());
                }
                break;

            default:
                System.out.println("invalid input");
                break;
        }
        FlightSchedules();

    }

    //Admin removes flights with this function
    public void Remove() throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
        FlightFile flightFile = new FlightFile(randomAccessFile);
        FlightSchedules();

        System.out.println("to remove a flight,enter its index:");
        String flightIdRmv = scanner.nextLine();
        if (flightFile.readFlightFormatFile().getFlightId().equals(flightIdRmv)) {
            System.out.println("|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|\t" + flightFile.readFlightFormatFile().getOrigin() + "\t|\t" + flightFile.readFlightFormatFile().getDestination() + "\t|\t" + flightFile.readFlightFormatFile().getDate() + "\t|\t" + flightFile.readFlightFormatFile().getTime() + "\t|\t" + flightFile.readFlightFormatFile().getPrice() + "\t|\t" + flightFile.readFlightFormatFile().getSeats() + "\t|");
            //delete
        }
        FlightSchedules();
    }
    //Admin prints the flight schedule with this function

    public void FlightSchedules() throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
        FlightFile flightFile = new FlightFile(randomAccessFile);
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("|\t%8s\t|%10s\t|\t%10s\t|\t%8s\t|\t%4s\t|\t%8s\t|\t%4s\t|\n", "Flight Id", "Origin", "Destination", "Date", "Time", "Price", "Seats");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.printf("|\t%8s\t|%10s\t|\t%10s\t|\t%8s\t|\t%4s\t|\t%8d\t|\t%4d\t|\n", flightFile.readFlightFormatFile().getFlightId(), flightFile.readFlightFormatFile().getOrigin(), flightFile.readFlightFormatFile().getDestination(), flightFile.readFlightFormatFile().getDate(), flightFile.readFlightFormatFile().getTime(), flightFile.readFlightFormatFile().getPrice(), flightFile.readFlightFormatFile().getSeats());
        System.out.println("-----------------------------------------------------------------------------------------------------");

}
    }
