package core;

import org.junit.Test;

import java.io.*;

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

}

class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private static String country;
	private int age;
	private String name;
	private transient int height;

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