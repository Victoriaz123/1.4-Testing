import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOfCarsTest {

    @Test
     void testInvalidIndex() {
        ArrayOfCars  example = new ArrayOfCars ();

        ArrayIndexOutOfBoundsException exception =
                assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
                    example.accessInvalidIndex();
                });
        assertEquals("Index 4 out of bounds for length 4", exception.getMessage());
    }

}
