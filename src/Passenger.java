public class Passenger {
    private String psrName;
    private String psrPassword;
    private int charge;

    public Passenger(String psrName, String psrPassword, int charge) {
        this.psrName = psrName;
        this.psrPassword = psrPassword;
        this.charge = charge;
    }

    public String getPsrName() {
        return psrName;
    }

    public void setPsrName(String psrName) {
        this.psrName = psrName;
    }

    public String getPsrPassword() {
        return psrPassword;
    }

    public void setPsrPassword(String psrPassword) {
        this.psrPassword = psrPassword;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }
}
