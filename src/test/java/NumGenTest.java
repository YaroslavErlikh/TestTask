import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class NumGenTest {

    public NumGenTest(List<Integer> input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object> input(){
        return Arrays.asList(new Object[][] {
                {Arrays.asList(1,2,4), "003"},
                {Arrays.asList(11,12,14), "013"},
                {Arrays.asList(111,112,114), "113"},
        });
}

    private List<Integer> input;
    private String expected;
    private NumGen numGen;

    @Before
    public void init(){
        numGen = new NumGen();
    }

    @Test
    public void generateNum() {
        assertEquals(expected, numGen.generateNum(input));
    }
}