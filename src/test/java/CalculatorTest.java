import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(3, 2));
    }

    @Test
    void difference() {
        assertEquals(10, calculator.difference(15, 5));
    }

    @Test
    void division() {
        assertEquals(2, calculator.division(20, 10));
    }

    @Test
    void times() {
        assertEquals(30, calculator.times(3, 10));
    }

}
