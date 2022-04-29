package test;
import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }
    @Test
    public void leftGreater(){
        assertEquals(-1, BonusBinarySearch.binarySearch(new int[]{0,1,4,3,5,8,13}, 5));
    }
}
