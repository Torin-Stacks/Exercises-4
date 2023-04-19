import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorialTest() {

        Factorial obj = new Factorial();
        obj.factorial(5);
        assertEquals(120,obj.factorial(5));
    }
}