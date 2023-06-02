import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
    public class Schedule  {
        public ArrayList<Flight> flightArray = new ArrayList<>();

        public String flightId1 = "WX-12", origin1 = "Yazd", destination1 = "Tehran", date1 = "1401-12-10", time1 = "12:30",
                flightId2 = "WZ-15", origin2 = "Mashhad", destination2 = "Ahvaz", date2 = "1401-12-11", time2 = "08:00",
                flightId3 = "BG-22", origin3 = "Shiraz", destination3 = "Tabriz", date3 = "1401-12-12", time3 = "22:30",
                flightId4 = "AW-30", origin4 = "Qom", destination4 = "Mashhad", date4 = "1402-01-05", time4 = "15:15",
                flightId5 = "ZL-31", origin5 = "Sanandaj", destination5 = "Isfahan", date5 = "1402-01-31", time5 = "18:00",
                flightId6 = "SY-20", origin6 = "Yasuj", destination6 = "Birjand", date6 = "1402-01-06", time6 = "16:45",
                flightId7 = "EP-19", origin7 = "Bushehr", destination7 = "Sari", date7 = "1402-01-07", time7 = "10:50",
                flightId8 = "QU-99", origin8 = "Arak", destination8 = "Orumiyeh", date8 = "1402-01-08", time8 = "14:10",
                flightId9 = "IO-77", origin9 = "Rasht", destination9 = "Gorgan", date9 = "1402-01-09", time9 = "07:45",
                flightId10 = "CK-88", origin10 = "Abadan", destination10 = "Ardabil", date10 = "1402-01-10", time10 = "08:25";

        public int price1 = 700000, seats1 = 51,
                price2 = 900000, seats2 = 245,
                price3 = 1100000, seats3 = 12,
                price4 = 500000, seats4 = 38,
                price5 = 550000, seats5 = 30,
                price6 = 600000, seats6 = 26,
                price7 = 950000, seats7 = 23,
                price8 = 450000, seats8 = 19,
                price9 = 300000, seats9 = 24,
                price10 = 750000, seats10 = 37;

        @Override
        public String toString() {
            return "Schedule{" +
                    "price1=" + price1 +
                    ", seats1=" + seats1 +
                    ", price2=" + price2 +
                    ", seats2=" + seats2 +
                    ", price3=" + price3 +
                    ", seats3=" + seats3 +
                    ", price4=" + price4 +
                    ", seats4=" + seats4 +
                    ", price5=" + price5 +
                    ", seats5=" + seats5 +
                    ", price6=" + price6 +
                    ", seats6=" + seats6 +
                    ", price7=" + price7 +
                    ", seats7=" + seats7 +
                    ", price8=" + price8 +
                    ", seats8=" + seats8 +
                    ", price9=" + price9 +



                    ", seats9=" + seats9 +
                    ", price10=" + price10 +
                    ", seats10=" + seats10 +
                    '}';
        }
        public void write_file() throws IOException {
            RandomAccessFile sfile = new RandomAccessFile("AIRLINE_Flight.dat", "rw");
            FlightFile flightFile = new FlightFile(sfile);
            flightFile.writeFlightInFile(new Flight(flightId1, origin1, destination1, date1, time1, price1, seats1));
            flightFile.writeFlightInFile(new Flight(flightId2, origin2, destination2, date2, time2, price2, seats2));
            flightFile.writeFlightInFile(new Flight(flightId3, origin3, destination3, date3, time3, price3, seats3));
            flightFile.writeFlightInFile(new Flight(flightId4, origin4, destination4, date4, time4, price4, seats4));
            flightFile.writeFlightInFile(new Flight(flightId5, origin5, destination5, date5, time5, price5, seats5));
            flightFile.writeFlightInFile(new Flight(flightId6, origin6, destination6, date6, time6, price6, seats6));
            flightFile.writeFlightInFile(new Flight(flightId7, origin7, destination7, date7, time7, price7, seats7));
            flightFile.writeFlightInFile(new Flight(flightId8, origin8, destination8, date8, time8, price8, seats8));
            flightFile.writeFlightInFile(new Flight(flightId9, origin9, destination9, date9, time9, price9, seats9));
            flightFile.writeFlightInFile(new Flight(flightId10, origin10, destination10, date10, time10, price10, seats10));
        }
}
