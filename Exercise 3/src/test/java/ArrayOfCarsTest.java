import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfCarsTest {

    @Test
     void testInvalidIndex() {
        ArrayOfCars  example = new ArrayOfCars ();

        ArrayIndexOutOfBoundsException exception =
                assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    example.accessInvalidIndex(4);
                });
        assertEquals("Index out of limits", exception.getMessage());
    }
}
