package com.unistmo.Semaforos;

public class Semaphore {

	/*
	 * implementacion del problema de la cena de los filosofos donde cada
	 * filosofo tiene que tener 2 tenendores para poder comer su plato de
	 * spaguetti, existen 5 filosofos y 5 tenedores los cuales tendran que
	 * compartir, por lo tanto , el maximo de filosofos los cuales pueden comer
	 * al mismo tiempo son 2 , donde filosofo A y filosofo B no pueden compartir
	 * los tenedores X e Y asi tenemos que para todo filosofo que este en tiempo
	 * de "comer o comiendo" debe estar ocupando 2 tenedores (espacios libres
	 * minimo 2 en un arreglo de 5 tenedores), y marcar cada tenedor como en
	 * uso, al termino de la comida o de comer, cada filosofo deja sus
	 * tenedores(desocupa el espacio requerido para que otro filosofo pueda
	 * disponer del tenedor). punto importante un filosofo solo puede comer del
	 * tenedor de ahora
	 */
	public static void main(String argv[]) {
		String[] nom={"Jesper","Lang","Dvorak","Andy","Alexandre"};
		Fork[] forks = new Fork[5];
		Philosophers[] philosophers = new Philosophers[5];
		for (int i = 0; i < philosophers.length; i++) {
			forks[i] = new Fork();
			philosophers[i] = new Philosophers(forks);
			philosophers[i].setNombre(nom[i]);
		}
		while(true)
			for (int i = 0; i < philosophers.length; i++) {
				philosophers[i].doit();
			}
			
	
	}

}
