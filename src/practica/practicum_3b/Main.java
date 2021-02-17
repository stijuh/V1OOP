package practica.practicum_3b;

public class Main {
    public static void main(String[] args) throws Exception {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}

// java stopt tijdens het uitvoeren als het try/catch-blok wordt verwijderd.