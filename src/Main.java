import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        menu.menuFunc();
        try {
            RandomAccessFile rfile = new RandomAccessFile("AIRLINE_Passenger.dat", "rw");
            PassengerFile passengerFile = new PassengerFile(rfile);
            //write
            Sign sign = new Sign();
            passengerFile.writePassengerInFile(new Passenger(sign.user, sign.password, 0));
            //read
            rfile.seek(124 * 2);
            System.out.println(passengerFile.readPassengerFormatFile());
            rfile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            RandomAccessFile sfile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
//            FlightFile flightFile = new FlightFile(sfile);
            //write
            Schedule schedule = new Schedule();
//            flightFile.writeFlightInFile(new Flight(schedule.flightId1, schedule.origin1, schedule.destination1, schedule.date1, schedule.time1, schedule.price1, schedule.seats1));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId2, schedule.origin2, schedule.destination2, schedule.date2, schedule.time2, schedule.price2, schedule.seats2));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId3, schedule.origin3, schedule.destination3, schedule.date3, schedule.time3, schedule.price3, schedule.seats3));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId4, schedule.origin4, schedule.destination4, schedule.date4, schedule.time4, schedule.price4, schedule.seats4));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId5, schedule.origin5, schedule.destination5, schedule.date5, schedule.time5, schedule.price5, schedule.seats5));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId6, schedule.origin6, schedule.destination6, schedule.date6, schedule.time6, schedule.price6, schedule.seats6));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId7, schedule.origin7, schedule.destination7, schedule.date7, schedule.time7, schedule.price7, schedule.seats7));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId8, schedule.origin8, schedule.destination8, schedule.date8, schedule.time8, schedule.price8, schedule.seats8));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId9, schedule.origin9, schedule.destination9, schedule.date9, schedule.time9, schedule.price9, schedule.seats9));
//            flightFile.writeFlightInFile(new Flight(schedule.flightId10, schedule.origin10, schedule.destination10, schedule.date10, schedule.time10, schedule.price10, schedule.seats10));
//            //read
//            sfile.seek(308*2);
//            System.out.println(flightFile.readFlightFormatFile());
//            sfile.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        }
}
}