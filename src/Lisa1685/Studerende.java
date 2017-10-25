package Lisa1685;

public class Studerende {

    String fuldenavn;
    String studieid;
    int telefonnummer;

    public  Studerende() {
    }

    public Studerende(String fuldenavn, String studieid, int telefonnummer) {
        this.fuldenavn = fuldenavn;
        this.studieid = studieid;
        this.telefonnummer = telefonnummer;
    }


   // Set metoder
    public void setFuldenavn() {
        this.fuldenavn = fuldenavn;
    }

    public void setStudieid() {
        this.studieid = studieid;
    }

    public void setTelefonnummer() {
        this.telefonnummer = telefonnummer;
    }

    // Get metoder

    public String getFuldenavn() {
        return fuldenavn;
    }

    public String getStudieid() {
        return studieid;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }
}

