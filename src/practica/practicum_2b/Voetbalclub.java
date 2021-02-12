package practica.practicum_2b;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int punten;

    public Voetbalclub(String nm) {
        naam = nm;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
        punten = (aantalGewonnen * 3) + aantalGelijk;
        return punten;
    }

    public int aantalGespeeld() {
        return (aantalGewonnen + aantalGelijk + aantalVerloren);
    }

    public String toString() {
        String str = naam + "\t" + aantalGespeeld() + aantalGewonnen + aantalGelijk + aantalVerloren + aantalPunten();
        return str;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

}
