import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringMap2DImplTest {

    @Test
    public void put() {
        StringMap2DImpl map2D = new StringMap2DImpl();
        assertTrue(map2D.isEmpty());
        map2D.put("Daniel Düsentrieb", "Raketenbau", "1.8");
        assertEquals("1.8", map2D.get("Daniel Düsentrieb", "Raketenbau"));
        assertEquals(1, map2D.size());

    }

}