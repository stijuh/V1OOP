package practica.practicum_2a;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {
    private Zwembad z;

    @Test
    void testBerekendeInhoud() {
        System.out.println("testBerekendeInhoud");
        z = new Zwembad(2.5, 100.0, 2.0);
        assertEquals(500, z.inhoud(), "De correcte waarde komt niet overeen met de door inhoud() berekende waarde.");
    }

}