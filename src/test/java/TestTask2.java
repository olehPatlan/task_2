import org.junit.Test;
import ua.patlan.Task2;

import static org.junit.Assert.*;

public class TestTask2 {

    @Test
    public void testInterviewRecursionTest() {
        assertEquals("h*e*ll*o", Task2.interviewRecursionTest("hello"));
        assertEquals("h*a*e*ll*o", Task2.interviewRecursionTest("haello"));
        assertEquals("a*bc", Task2.interviewRecursionTest("abc"));
        assertEquals("a*o*c", Task2.interviewRecursionTest("aoc"));
        assertEquals("A*o*e*y*tj*Y", Task2.interviewRecursionTest("AoeytjY"));
    }
}
