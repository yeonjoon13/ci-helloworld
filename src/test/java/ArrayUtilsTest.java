import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testFindLastNull() {
        // Do not execute fault c
        assertThrows(NullPointerException.class, () -> {ArrayUtils.findLast(null, 3);});
    }


    @Test
    public void testFindLastEmpty() {
        // For any input where y appears in the second or later position, there is no error. Also,
        // if x is empty, there is no error.
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNonExistent() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2}, 3));
    }

    @Test
    public void testFindLastExistsFirstElement() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testOddOrPosNull() {
        // Do not execute fault
        assertThrows(NullPointerException.class, () -> {ArrayUtils.oddOrPos(null);});
    }


    @Test
    public void testOddOrPosAllPositives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPositiveBothPositivesAndNegatives() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testCountOfNull() {
        assertThrows(NullPointerException.class, () -> ArrayUtils.countOf(null, 3));
    }

    @Test
    public void testCountOfEmpty() {
        assertEquals(0, ArrayUtils.countOf(new int[]{}, 3));
    }

    @Test
    public void testCountOfNonExistent() {
        assertEquals(0, ArrayUtils.countOf(new int[]{1, 2}, 3));
    }

    @Test
    public void testCountOfSingleOccurrence() {
        assertEquals(1, ArrayUtils.countOf(new int[]{1, 2, 3}, 2));
    }

    @Test
    public void testCountOfMultipleOccurrences() {
        assertEquals(3, ArrayUtils.countOf(new int[]{1, 2, 2, 3, 2}, 2));
    }

    @Test
    public void testOddOrPosAllNegatives() {
        assertEquals(1, ArrayUtils.oddOrPos(new int[]{-3, -2, -4}));
    }

    @Test
    public void testOddOrPosMixed() {
        assertEquals(2, ArrayUtils.oddOrPos(new int[]{-3, 0, 1}));
    }

    @Test
    public void testOddOrPosZero() {
        assertEquals(0, ArrayUtils.oddOrPos(new int[]{0}));
    }

    @Test
    public void testOddOrPosOnlyOddNegatives() {
        assertEquals(2, ArrayUtils.oddOrPos(new int[]{-3, -5}));
    }

    @Test
    public void testOddOrPosOnlyEvenPositives() {
        assertEquals(2, ArrayUtils.oddOrPos(new int[]{2, 4}));
    }

    @Test
    public void testOddOrPosOnlyEvenNegatives() {
        assertEquals(0, ArrayUtils.oddOrPos(new int[]{-2, -4}));
    }

    @Test
    public void testOddOrPosOnlyOddPositives() {
        assertEquals(2, ArrayUtils.oddOrPos(new int[]{1, 3}));
    }

    @Test
    public void testFindLastExistsLastElement() {
        assertEquals(2, ArrayUtils.findLast(new int[]{2, 3, 2}, 2));
    }

    @Test
    public void testFindLastExistsMiddleElement() {
        assertEquals(1, ArrayUtils.findLast(new int[]{2, 3, 2}, 3));
    }
}