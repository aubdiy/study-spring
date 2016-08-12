package self.aub.study.mvc.act.bean;

import java.util.LinkedHashMap;

@SuppressWarnings("serial")
public class TT extends LinkedHashMap<String, String> {

	@Override
	public String put(String key, String value) {
		System.out.println(key + ":" + value);
		if (value != null && value.length() == 0) {
			value = null;
		}
		System.out.println(key + ":" + value);
		return super.put(key, value);
	}

}
