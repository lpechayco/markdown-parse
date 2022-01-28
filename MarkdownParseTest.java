import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;



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
    public void testGetLinks1() throws IOException() {
        assertEquals(List.of("https://something.com", "some-page.html"), 
            MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }
}