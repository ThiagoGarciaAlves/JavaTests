package core;

import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.SortedMap;

import static org.junit.Assert.assertTrue;

/**
 * @author Thiago Alves
 */
public class SerializationTest {

	@Test
	public void serializingDeserializing() throws IOException, ClassNotFoundException {
		Person p = new Person();
		p.setAge(20);
		p.setName("Joe");

		FileOutputStream fileOutputStream
				= new FileOutputStream("person.txt");
		ObjectOutputStream objectOutputStream
				= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(p);
		objectOutputStream.flush();
		objectOutputStream.close();

		FileInputStream fileInputStream
				= new FileInputStream("person.txt");
		ObjectInputStream objectInputStream
				= new ObjectInputStream(fileInputStream);
		Person p2 = (Person) objectInputStream.readObject();
		objectInputStream.close();

		assertTrue(p2.getAge() == p.getAge());
		assertTrue(p2.getName().equals(p.getName()));
	}

	@Test
	public void customSerializingDeserializing() throws IOException, ClassNotFoundException {
		Person p = new Person();
		p.setAge(20);
		p.setName("Joe");
		p.setHeight(175);

		FileOutputStream fileOutputStream
				= new FileOutputStream("person.txt");
		ObjectOutputStream objectOutputStream
				= new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(p);
		objectOutputStream.flush();
		objectOutputStream.close();

		FileInputStream fileInputStream
				= new FileInputStream("person.txt");
		ObjectInputStream objectInputStream
				= new ObjectInputStream(fileInputStream);
		Person p2 = (Person) objectInputStream.readObject();
		objectInputStream.close();

		assertTrue(p2.getAge() == p.getAge());
		assertTrue(p2.getName().equals(p.getName()));
		assertTrue(p2.getHeight() == p.getHeight());
	}

	@Test
	public void byteArrayCharsetTest() {
		String sp = "São Paulo";
		byte[] sp_bytes = sp.getBytes();
		SortedMap<String, Charset> charsets = Charset.availableCharsets();
		for (Map.Entry<String, Charset> entry : charsets.entrySet()) {
			System.out.printf("%s: %s%n", entry.getKey(), new String(sp_bytes, entry.getValue()));
		}
	}

}

class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private static String country;
	private int age;
	private String name;
	private transient int height;

	private void writeObject(ObjectOutputStream oos)
			throws IOException {
		oos.defaultWriteObject();
		oos.writeInt(this.getHeight());
	}

	private void readObject(ObjectInputStream ois)
			throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		this.setHeight(ois.readInt());
	}

	// getters and setters
	public static String getCountry() {
		return country;
	}

	public static void setCountry(String country) {
		Person.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}