package app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.junit.Test;

import linkedlist.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void queueInsertion() {
        final Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        assertEquals("first", queue.remove());
        assertEquals("second", queue.remove());
        assertEquals("third", queue.peek());
        assertEquals("third", queue.remove());
    }

    @Test
    public void testQuicksort() {
        final List<Integer> numbers = Arrays.asList(6, 4, 9, 5);
        final List<Integer> expected = Arrays.asList(4, 5, 6, 9);

        final List<Integer> actual = Quicksort.quicksort(numbers);
        assertEquals(expected, actual);
    }
}
