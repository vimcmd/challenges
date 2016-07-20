package Simple.directionsReduction.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirReductionTest {

    @Test
    public void testSimpleDirReduc() throws Exception {
        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
                new String[]{"WEST"},
                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));

        assertArrayEquals("\"NORTH\", \"WEST\", \"SOUTH\", \"EAST\"",
                new String[]{"NORTH", "WEST", "SOUTH", "EAST"},
                DirReduction.dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}));
    }

}