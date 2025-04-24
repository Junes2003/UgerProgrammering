package Uge17.Cup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getPercentageFilled() {
        Cup c = new Cup("Orange Juice", 84);
        assertEquals("Orange Juice", c.getLiquidType());
    }
}