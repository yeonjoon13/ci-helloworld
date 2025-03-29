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







}