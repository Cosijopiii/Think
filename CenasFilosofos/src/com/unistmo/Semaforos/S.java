package com.unistmo.Semaforos;

public class S {
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String[] nom={"Jesper","Lang","Dvorak","Andy","Alexandre"};
		Fork[] forks = new Fork[5];
		Philosophers[] philosophers = new Philosophers[5];
		for (int i = 0; i < philosophers.length; i++) {
			forks[i] = new Fork();
		}
		for (int i = 0; i < philosophers.length; i++) {
		
			philosophers[i] = new  Philosophers(forks);
			philosophers[i].setNombre(nom[i]);
			philosophers[i].run();
		
		}
		philosophers[1].start();
		philosophers[2].start();
		philosophers[3].start();
		philosophers[4].start();
		philosophers[5].start();
		
	}
	
	 


}
