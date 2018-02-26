package core;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Thiago Alves
 */
public class MemRefTest {

	@Test
	public void enhancedForTest() {

		List<Map<String, String>> maps = new ArrayList<>();

		maps.add(new HashMap<>());
		maps.add(new HashMap<>());
		maps.add(new HashMap<>());

		putInMaps(maps, "a", "1");
		putInMaps(maps, "b", "2");
		putInMaps(maps, "c", "3");

		System.out.println("maps => " + maps);

		assertThat(maps.size(), is(3));
		assertThat(maps.get(0).size(), is(3));
		assertThat(maps.get(1).size(), is(3));
		assertThat(maps.get(2).size(), is(3));

	}

	private void putInMaps(List<Map<String, String>> maps, String a, String b) {
		for (Map<String,String> map : maps) {
			map.put(a, b);
		}
	}

}
