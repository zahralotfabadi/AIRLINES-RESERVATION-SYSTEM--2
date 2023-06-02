import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class TicketFile {
    private RandomAccessFile zfile;
    private final int FIX_SIZE=30;

    public TicketFile(RandomAccessFile zfile) {
        this.zfile = zfile;
    }
    public void writeTicketInFile(Ticket ticket) throws IOException {
        zfile.writeChars(fixStringToWrite(ticket.getTicketId()));
    }
    private String fixStringToWrite(String str) {
        while (str.length() < FIX_SIZE)
            str += " "; //read StringBuilder class for better performance
        return str.substring(0, FIX_SIZE);
    }
    public Ticket readTicketFormatFile() throws IOException {
        String ticketId=readFixString();
        return new Ticket(ticketId);
    }
    private String readFixString() throws IOException {
        String tmp = "";
        for (int i = 0; i < FIX_SIZE; i++) {
            tmp += zfile.readChar();
        }
        return tmp.trim();
    }
}
