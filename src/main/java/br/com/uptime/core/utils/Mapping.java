package br.com.uptime.core.utils;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	static Map<String, String> example = new HashMap<String, String>();
	
	public static void set(String key, String value) {
		example.put(key, value);
	}

	public static String get(String key) {
		return example.get(key);
	}
}
