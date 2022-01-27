import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getLinks() throws IOException{
        String contents = Files.readString(Path.of("./test-file.md"));
        List<String> expectedOutput = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expectedOutput);
    }
}
