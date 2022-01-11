package restAssuredAPI;

import org.json.simple.JSONObject;

public class JSONEncode {

	public static void main(String[] args) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("Name", "Mir");
		jsonObj.put("Age", "26");
		jsonObj.put("City", "Delhi");
		System.out.println(jsonObj);
	}
}
