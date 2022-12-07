package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class BunTest {

    Bun bun = new Bun("black bun", 100);

    @Test
    public void shouldGetName() {
        String expected = "black bun";
        String actual = bun.getName();
        assertEquals("Name bun is incorrect", expected, actual);
    }

    @Test
    public void getPrice() {
        float expected = 100;
        float actual = bun.getPrice();
        assertEquals("Price bun is incorrect", expected, actual, 0);
    }
}