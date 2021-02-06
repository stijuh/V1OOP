package practica.practicum_2a;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;
    private double inhoud;

    public Zwembad(double br, double le, double di) {
        breedte = br;
        lengte = le;
        diepte = di;
    }

    public Zwembad(){
        ;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setBreedte(double br) {
        breedte = br;
    }

    public void setLengte(double le) {
        lengte = le;
    }

    public void setDiepte(double di) {
        diepte = di;
    }

    public double inhoud() {
        return breedte * lengte * diepte;
    }

    public String toString() {
        return "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
    }
}
