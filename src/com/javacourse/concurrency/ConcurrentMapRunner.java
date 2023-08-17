package com.javacourse.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		ConcurrentMap<Character,LongAdder> occurances = new ConcurrentHashMap<>();
		String str = "Abc asass asa  efe";
		//Este metodo si es thread safe
		for(char character: str.toCharArray()) {
			occurances.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}	
		/*
		for(char character: str.toCharArray()) {
				LongAdder longAdder = occurances.get(character);
				if(longAdder == null) {
					longAdder = new LongAdder();
				}
				longAdder.increment();
				occurances.put(character, longAdder);
		}*/
	}

}
