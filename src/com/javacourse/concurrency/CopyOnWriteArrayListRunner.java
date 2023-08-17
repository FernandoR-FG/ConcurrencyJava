package com.javacourse.concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//Threads 3
		list.add("Ant");
		list.add("Happy");
		list.add("Tired");
		
		for(String element:list) {
			System.out.println(element);
		}
	}

}
