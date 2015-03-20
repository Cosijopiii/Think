package com.unistmo.Semaforos;

public class Philosophers extends Thread{
	private String Nombre;
	private Fork[]forks;
	private int v=0,k=0;
	
	
	public Philosophers(Fork[] forks) {
		this.setForks(forks);	
	}
	
	

	public void run(){
		
		while(true){
			
			try {
				eat();
				think();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	public void doit(){
		
		while(true){
			
			try {
				eat();
				think();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			break;
		}
		
	}
	
	public void eat() throws InterruptedException {
		
			k=0;v=0;
		   while(k==v){
			k=GenerarR(0,4);
			v=GenerarR(0,4);
		  }
			if (!forks[k].isBusy() && !forks[v].isBusy())
			{
				forks[k].setBusy(true);
				forks[v].setBusy(true);
				System.out.println(Nombre+" Eating Spaguetti");
							
			}
			Thread.sleep(1000);
		}
	
	public void think() throws InterruptedException {
		
			forks[k].setBusy(false);
			forks[v].setBusy(false);
			System.out.println(Nombre+" is thinking");
			Thread.sleep(1000);
	
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Fork[] getForks() {
		return forks;
	}

	public void setForks(Fork[] forks) {
		this.forks = forks;
	}
	
	public int GenerarR(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	
	
	

}
