import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculateDniTest {

    private final CalculateDni calculateDni = new CalculateDni();


    @ParameterizedTest
    @CsvSource({
        "25770734, Q",
        "58620431, D",
        "68201010, F",
        "63017640, D",
        "40424825, W",
        "99841762, G"
})

    public void testCalculateLetter(int dni, char lletraEsperada) {
        assertEquals(lletraEsperada, calculateDni.calculateLetter(dni));
    }
}
