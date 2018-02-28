package core;

import org.junit.Test;

/**
 * @author Thiago Alves
 */
public class ByteArrayTest {

	@Test
	public void test01() {
		String example = "Example";
		byte[] bytes = example.getBytes();

		System.out.println("Text : " + example);
		System.out.println("Text [bytes] : " + bytes);
		System.out.println("Text [bytes.toString] : " + bytes.toString());

		String s = new String(bytes);
		System.out.println("Text [new String] : " + s);
	}

}
