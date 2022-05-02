import static org.junit.Assert.*;
import org.junit.*;

public class skillTest {
    @Test
    public void testabs() {
        assertEquals(2, skill.absValue(-1));
    }
}
