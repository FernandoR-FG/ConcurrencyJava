package com.javacourse.concurrency;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;
	//Se usa la palabra synchronized para que cada hilo inicie y termine el codigo completo
	//Lock lockForI = new ReentrantLock();
	synchronized public void incrementI() {
		//Get lock for I
		//lockForI.lock();
		i++;
		//lockForI.unlock();
		//Release Lock
	}
	
	synchronized public void incrementJ() {
		//Get lock for J
		j++;
	}

	public int getI() {
		return i;
	}

	
	public void setI(int i) {
		this.i = i;
	}

}
