package collections;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionTest {

    @Test
    public void collectionIndexTest() {
        Collection<String> collection = Arrays.asList("a","b","c","d","e");
        List<String> letras = Arrays.asList("a","b","c","d","e");
        for (int i = 0; i < 1000; i++) {
            int x = 0;
            for (String s : collection) {
                assertEquals(x++, letras.indexOf(s));
            }
        }
    }

}
