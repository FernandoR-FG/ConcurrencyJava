package com.javacourse.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	//Estos atomic se usan cuando se necesita un contador safe thread
	 public void incrementI() {
		i.incrementAndGet();
	}
	
	public void incrementJ() {
		//Get lock for J
		j.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	
	public void setI(AtomicInteger i) {
		this.i = i;
	}

}
