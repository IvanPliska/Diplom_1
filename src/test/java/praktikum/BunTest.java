package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class BunTest {

    @Test
    public void shouldGetName() {
        Bun bun = new Bun("black bun", 100);
        String expected = "black bun";
        String actual = bun.getName();
        assertEquals("Name bun is incorrect", expected, actual);
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun("black bun", 100);
        float expected = 100;
        float actual = bun.getPrice();
        assertEquals("Price bun is incorrect", expected, actual, 0);
    }
}