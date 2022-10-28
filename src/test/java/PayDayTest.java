import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PayDayTest {

    @Test
    public void testPay()
    {
        PayDay testPay = new PayDay();
        String test = testPay.pay("Kris", 21.0, 10.0, 0.05);
        assertEquals("Kris 21.00 10.00 0.05 ", test);

    }
}