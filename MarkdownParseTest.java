import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

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

    @Test
    public void testGetLinks1() throws IOException {
        assertEquals("[]", 
            MarkdownParse.getLinks(Files.readString(Path.of("test-file5.md"))));
    }
}