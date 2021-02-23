package qa.guru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    void simplePassedTest() {
        assertTrue(Boolean.toString(true).equals("true"));
    }
}
