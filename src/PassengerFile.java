import java.io.IOException;
import java.io.RandomAccessFile;

public class PassengerFile {
    private RandomAccessFile rfile;
    private final int FIX_SIZE=30;

    public PassengerFile(RandomAccessFile rfile) {this.rfile = rfile;}

    public void writePassengerInFile(Passenger passenger) throws IOException {
        rfile.writeChars(fixStringToWrite(passenger.getPsrName()));
        rfile.writeChars(fixStringToWrite(passenger.getPsrPassword()));
        rfile.writeInt(passenger.getCharge());
    }
    private String fixStringToWrite(String str){
        while (str.length()<FIX_SIZE)
            str+=" ";
        return str.substring(0,FIX_SIZE);
    }
    public Passenger readPassengerFormatFile() throws IOException {
        String name=readFixString();
        String password=readFixString();
        int charge=rfile.readInt();
        return new Passenger(name,password,charge);
    }
    private String readFixString() throws IOException {
        String tmp="";
        for (int i=0;i<FIX_SIZE;i++){
            tmp+=rfile.readChar();
        }
        return tmp.trim();
    }
}
