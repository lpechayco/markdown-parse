import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    List strList = List.of("hi", "hey", "hello");

    @Test
    public void checkContents() {
        assertEquals("hey", strList.get(1));
    }
}