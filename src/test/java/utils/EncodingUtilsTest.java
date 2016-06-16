package utils;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * Testando encodings
 * Fonte: http://blog.caelum.com.br/entendendo-unicode-e-os-character-encodings/
 */
public class EncodingUtilsTest {

    EncodingUtils encodingUtils;

    public EncodingUtilsTest() {
        encodingUtils = new EncodingUtils();
    }

    @Test
    public void test001() throws UnsupportedEncodingException {
        String[] encodings = { "ISO-8859-1", "UTF-8", "UTF-16" };
        String string = "ç";
        encodingUtils.printStringCodesByEncodings(string,encodings);
    }

    @Test
    public void test002() throws UnsupportedEncodingException {
        String[] encodings = { "ISO-8859-1", "UTF-8", "UTF-16" };
        String string = "a";
        encodingUtils.printStringCodesByEncodings(string,encodings);
    }

    @Test
    public void test003() throws UnsupportedEncodingException {
        System.out.println(encodingUtils.convertEncoding("ç","UTF-8", "UTF-8"));
        System.out.println(encodingUtils.convertEncoding("ç","UTF-8", "UTF-16"));
        System.out.println(encodingUtils.convertEncoding("ç","UTF-8", "ISO-8859-1"));
    }

    @Test
    public void test004() throws UnsupportedEncodingException {
        System.out.println(encodingUtils.convertEncoding("a","UTF-8", "UTF-8"));
        System.out.println(encodingUtils.convertEncoding("a","UTF-8", "UTF-16"));
        System.out.println(encodingUtils.convertEncoding("a","UTF-8", "ISO-8859-1"));
    }

}
