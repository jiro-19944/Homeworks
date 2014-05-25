import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestSelectionSort{
    int[] arr1 = {10,34,2,56,7,67,88,42};
    int[] arr2 = {2,7,10,34,42,56,67,88};
    MySelectionSort sort = new MySelectionSort();
    @Test
    public void testDoSelectionSort(){
        assertEquals(arr2, sort.doSelectionSort(arr1));

    }
}
