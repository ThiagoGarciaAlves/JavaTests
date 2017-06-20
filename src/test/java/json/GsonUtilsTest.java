package json;

import object.Pessoa;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Thiago Alves
 */
public class GsonUtilsTest {

	@Test
	public void serializeArrayTest() {

		List<String> arrayList = Arrays.asList("a","b","c");

		System.out.println("01 -> "+GsonUtils.serialize(arrayList));

	}

	@Test
	public void serializeObjectTest() {

		Pessoa thiago = new Pessoa();
		thiago.setNome("Thiago");
		thiago.setAltura(1.75);

		Pessoa isabelly = new Pessoa();
		isabelly.setNome("Isabelly");
		isabelly.setAltura(1.50);

		Pessoa gustavo = new Pessoa();
		gustavo.setNome("Gustavo");
		gustavo.setAltura(1.40);

		thiago.addFilho(isabelly);
		thiago.addFilho(gustavo);

		System.out.println("02 -> "+GsonUtils.serialize(thiago));

	}

	@Test
	public void deserializeObjectTest() {

		Pessoa thiago = new Pessoa();
		thiago.setNome("Thiago");
		thiago.setAltura(1.75);

		Pessoa isabelly = new Pessoa();
		isabelly.setNome("Isabelly");
		isabelly.setAltura(1.50);

		Pessoa gustavo = new Pessoa();
		gustavo.setNome("Gustavo");
		gustavo.setAltura(1.40);

		thiago.addFilho(isabelly);
		thiago.addFilho(gustavo);

		System.out.println("03-a -> "+thiago);

		String json = "{\"nome\":\"Thiago\",\"altura\":1.75,\"filhos\":[{\"nome\":\"Isabelly\",\"altura\":1.5,\"filhos\":[]},{\"nome\":\"Gustavo\",\"altura\":1.4,\"filhos\":[]}]}";

		Object obj = GsonUtils.deserialize(json);

		System.out.println("03-b -> "+obj);

	}

}
