import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addsTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void divideByZeroThrowsException() {
        Calculator calc = new Calculator();
        assertThrows(
            IllegalArgumentException.class,
            () -> calc.divide(10, 0)
        );
    }
}