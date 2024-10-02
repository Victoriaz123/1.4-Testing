import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculateDniTest {

    private final CalculateDni calculateDni = new CalculateDni();


    @Test
    public void testCalculateLetterForDni12345678() {
        assertEquals('Z', calculateDni.calculateLetter(12345678));
    }

    @Test
    public void testCalculateLetterForDni55555555 () {
        assertEquals('K', calculateDni.calculateLetter(55555555));
    }
}
