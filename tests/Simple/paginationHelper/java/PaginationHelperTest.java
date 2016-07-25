package Simple.paginationHelper.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PaginationHelperTest {

    List<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
    PaginationHelper<Integer> helper = new PaginationHelper<>(collection, 10);

    @Test
    public void testPageCount() throws Exception {
        assertEquals("pageCount is returning incorrect value", 3, helper.pageCount());
    }

    @Test
    public void testPageItemCount() throws Exception {
        assertEquals("pageItemCount is returning incorrect value", 10, helper.pageItemCount(1));
        assertEquals("pageItemCount is returning incorrect value", 4, helper.pageItemCount(2));
        assertEquals("pageItemCount is returning incorrect value", -1, helper.pageItemCount(3));
    }

    @Test
    public void testPageIndex() throws Exception {
        assertEquals("pageIndex is returning incorrect value when provided a itemIndex argument that was out of range", -1, helper
                .pageIndex(40));
        assertEquals("pageIndex is returning incorrect value", 2, helper.pageIndex(22));
        assertEquals("pageIndex is returning incorrect value", 0, helper.pageIndex(3));
        assertEquals("pageIndex is returning incorrect value", 0, helper.pageIndex(0));
        assertEquals("pageIndex is returning incorrect value", -1, helper.pageIndex(-1));
        assertEquals("pageIndex is returning incorrect value", -1, helper.pageIndex(-23));
        assertEquals("pageIndex is returning incorrect value", -1, helper.pageIndex(-15));
    }

    @Test
    public void testItemCount() throws Exception {
        assertEquals("itemCount is returning incorrect value", 24, helper.itemCount());
    }

    @Test
    public void testEmptyCollection() throws Exception {
        PaginationHelper empty = new PaginationHelper(new ArrayList<Integer>(), 10);
        assertEquals("pageIndex(0) called when there was an empty collection", -1, empty.pageIndex(0));
    }

}