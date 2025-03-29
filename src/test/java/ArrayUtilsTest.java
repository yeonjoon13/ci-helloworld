import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*

Branches of 0.7142857142857143 is below passing threshold of 1.0
Failing the workflow run.


 */
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







}