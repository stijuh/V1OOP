package practica.practicum_4b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur ah;
    private Klant k;
    private Auto a;

    @BeforeEach
    void init() {
        this.ah = new AutoHuur();
        this.k = new Klant("Frits");
        this.a = new Auto("bmw", 50);
    }

    @Test
    void testTotaalMetKortingPrijs() {
        k.setKorting(10.0);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);
        ah.setAantalDagen(4);

        assertEquals(180, ah.totaalPrijs());
    }

    @Test
    void testTotaalMetKortingString() {
        k.setKorting(10.0);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);
        ah.setAantalDagen(4);
        assertEquals("\tautotype: bmw met prijs per dag: 50.0\n\top naam van: Frits (korting: 10.0%)\n\taantal dagen: 4 en dat kost 180.0", ah.toString());
    }

    @Test
    void testTotaalZonderKortingPrijs() {
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);
        ah.setAantalDagen(4);

        assertEquals(200, ah.totaalPrijs());
    }

    @Test
    void testTotaalZonderKortingString() {
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);
        ah.setAantalDagen(4);

        assertEquals("\tautotype: bmw met prijs per dag: 50.0\n\top naam van: Frits (korting: 0.0%)\n\taantal dagen: 4 en dat kost 200.0", ah.toString());
    }

    @Test
    void testNogEenPrijs() {
        Auto a2 = new Auto("volvo", 300.0);
        ah.setHuurder(k);
        k.setKorting(20.0);
        ah.setGehuurdeAuto(a2);
        ah.setAantalDagen(4);

        assertEquals(960, ah.totaalPrijs());
        assertEquals("\tautotype: volvo met prijs per dag: 300.0\n\top naam van: Frits (korting: 20.0%)\n\taantal dagen: 4 en dat kost 960.0", ah.toString());
    }

    @Test
    void testNullAutoEnKlant() {
        ah.setAantalDagen(5);
        assertEquals(0, ah.totaalPrijs());
        assertEquals("\ter is geen auto bekend\n\ter is geen huurder bekend\n\taantal dagen: 5 en dat kost 0.0", ah.toString());
    }

    @Test
    void testNullKlant() {
        ah.setAantalDagen(5);
        ah.setGehuurdeAuto(a);
        assertEquals(0, ah.totaalPrijs());
        assertEquals("\tautotype: bmw met prijs per dag: 50.0\n\ter is geen huurder bekend\n\taantal dagen: 5 en dat kost 0.0", ah.toString());
    }

    @Test
    void testNullAuto() {
        ah.setAantalDagen(5);
        ah.setHuurder(k);
        assertEquals(0, ah.totaalPrijs());
        assertEquals("\ter is geen auto bekend\n\top naam van: Frits (korting: 0.0%)\n\taantal dagen: 5 en dat kost 0.0", ah.toString());
    }
}