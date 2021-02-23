package qa.guru;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    void simplePassedTest() {
        assertTrue(true);
    }

    @Test
    void simpleFailureTest() {
        assertTrue(false, "failure test is failed. It's Ok.");
    }
}
