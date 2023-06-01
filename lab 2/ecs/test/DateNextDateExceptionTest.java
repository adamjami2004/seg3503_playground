import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest {

    private int année;
    private int mois;
    private int jour;
    public DateNextDateExceptionTest(int a, int b , int c) {
        this.année = a;
        this.mois = b;
        this.jour = c;
    }

    @Parameters
    public static List<Integer[]> data() {
        List<Integer[]> params = new LinkedList<Integer[]>();
        params.add(new Integer[] { 1500, 2, 31 });
        params.add(new Integer[] { 1500, 2, 29 });
        params.add(new Integer[] { -1, 10, 20 });
        params.add(new Integer[] { -1458, 15, 12 });
        params.add(new Integer[] { 1975, 6, -50 });
        return params;
    }
    @Test
    public void testNextDateException() {
        Assert.assertThrows(IllegalArgumentException.class, () -> new Date(année, mois, jour));

    }

}