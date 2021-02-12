package practica.practicum_2b;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    private Voetbalclub v;

    @Test
    void testLegeClubNaam() {
        Voetbalclub v1 = new Voetbalclub("");
        assertEquals("FC", v1.getNaam());
    }

    @Test
    void testVerwerkResultaten() {
        Voetbalclub v1 = new Voetbalclub("PEC Zwolle");
        v1.verwerkResultaat('w');
        assertEquals(3, v1.aantalPunten());

        v1.verwerkResultaat('g');
        assertEquals(4, v1.aantalPunten());

        v1.verwerkResultaat('v');
        assertEquals(4, v1.aantalPunten());

        v1.verwerkResultaat('k');
        assertEquals(3, v1.aantalGespeeld());
    }

    @Test
    void testToString(){
        Voetbalclub v1 = new Voetbalclub("Feijenoord");
        v1.verwerkResultaat('w');
        assertEquals(3, v1.aantalPunten());

        v1.verwerkResultaat('g');
        assertEquals(4, v1.aantalPunten());

        v1.verwerkResultaat('v');
        assertEquals(4, v1.aantalPunten());

        assertEquals("Feijenoord\t31114", v1.toString());
    }

    @Test
    void testHerhaaldelijkVerwerken(){
        Voetbalclub v1 = new Voetbalclub("Heracles");
        v1.verwerkResultaat('w');
        assertEquals(3, v1.aantalPunten());
        v1.verwerkResultaat('w');
        assertEquals(6, v1.aantalPunten());

        v1.verwerkResultaat('g');
        assertEquals(7, v1.aantalPunten());

        v1.verwerkResultaat('v');
        assertEquals(7, v1.aantalPunten());

        // testcases
        assertEquals(4, v1.aantalGespeeld());
        assertEquals(2, v1.getAantalGewonnen());
        assertEquals(1, v1.getAantalGelijk());
        assertEquals(1, v1.getAantalVerloren());
    }
}