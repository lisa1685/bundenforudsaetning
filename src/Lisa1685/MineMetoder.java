package Lisa1685; // min package, så jeg kan få de enkelte klasser til at køre sammen.

public class MineMetoder {

    // Objekter til min bog.
    double pris;
    String titel;
    String genre;
    int sidetal;

    //Set metoder - sætter værdien i en variabel.
    // void er returtypen fordi den ikke skal retunere i setmetoden.
    // derefter den variabel man ønsker at give en værdi.
    // Ved at bruge this kan man give det det samme navn, så ved den at det er variablen den skal referere til.

    void setPris(double pris){
        this.pris = pris;
    }
    void setTitel(String titel) {
        this.titel = titel;
    }
    void setGenre(String genre){
        this.genre = genre;
    }
    void setSidetal(int sidetal){
        this.sidetal = sidetal;
    }

//get metoder - returnere værdien i en variabel. Tager ingen parametre fordi den returnere til set metoden.
    double getPris(){
        return pris;
}
    String getTitel(){
        return titel;
}
    String getGenre(){
        return genre;
}
    int getSidetal(){
        return sidetal;
}


    }




