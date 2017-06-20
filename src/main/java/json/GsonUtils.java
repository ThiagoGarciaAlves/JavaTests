package json;

import com.google.gson.Gson;

/**
 * @author Thiago Alves
 */
public class GsonUtils {

	private static Gson gson = new Gson();

	public static String serialize(Object o) {
		return gson.toJson(o);
	}

	public static Object deserialize(String json) {
		return gson.fromJson(json, Object.class);
	}

}
