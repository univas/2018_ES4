package br.edu.univa.si8.es4.solucao.singleton;

import java.util.HashMap;
import java.util.Map;

public class Statistics {
	private Map<String, Integer> counters = new HashMap<String, Integer>();

	private static Statistics instance;

	private Statistics() {
	}

	public static Statistics getInstance() {
		if (instance == null) {
			instance = new Statistics();
		}
		return instance;
	}

	public void count(String name) {
		int value = 0;
		if (counters.containsKey(name)) {
			value = counters.get(name);
		}
		value++;
		counters.put(name, value);
	}

	public int counterValue(String name) {
		int value = 0;
		if (counters.containsKey(name)) {
			value = counters.get(name);
		}
		return value;
	}
}
