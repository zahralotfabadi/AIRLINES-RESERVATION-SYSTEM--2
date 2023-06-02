import java.io.IOException;
import java.io.RandomAccessFile;

public class FlightFile {
    private RandomAccessFile sfile;
    private final int FIX_SIZE=10;

    public FlightFile(RandomAccessFile sfile) {
        this.sfile = sfile;
    }
    public void writeFlightInFile(Flight flight) throws IOException {
        sfile.writeChars(fixStringToWrite(flight.getFlightId()));
        sfile.writeChars(fixStringToWrite(flight.getOrigin()));
        sfile.writeChars(fixStringToWrite(flight.getDestination()));
        sfile.writeChars(fixStringToWrite(flight.getDate()));
        sfile.writeChars(fixStringToWrite(flight.getTime()));
        sfile.writeInt(flight.getPrice());
        sfile.writeInt(flight.getSeats());
    }
    private String fixStringToWrite(String str){
        while (str.length()<FIX_SIZE)
            str+=" ";
        return str.substring(0,FIX_SIZE);
    }
    public Flight readFlightFormatFile() throws IOException {
        String flightId=readFixString();
        String origin=readFixString();
        String  destination=readFixString();
        String data=readFixString();
        String time=readFixString();
        int price=sfile.readInt();
        int seats=sfile.readInt();
        return new Flight(flightId,origin,destination,data,time,price,seats);
    }
    private String readFixString() throws IOException {
        String tmp="";
        for (int i=0;i<FIX_SIZE;i++){
            tmp=tmp+sfile.read();
        }
        return tmp.trim();
    }
}
