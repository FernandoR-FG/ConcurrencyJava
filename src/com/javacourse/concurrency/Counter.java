package com.javacourse.concurrency;

public class Counter {
	
	private int i = 0;
	//Se usa la palabra synchronized para que cada hilo inicie y termine el codigo completo
	
	synchronized public void increment() {
		
		//No es una threadsafe operation
		//Porque hay un chance de que el valor actualizado se peirda
		i++;  //Esta i no es atomica tiene 3 operaciones 
		//get i
		//increment
		//set i
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}
