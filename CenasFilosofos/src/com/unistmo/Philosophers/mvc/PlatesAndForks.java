package com.unistmo.Philosophers.mvc;

public class PlatesAndForks {

		private boolean[] forks;

		public PlatesAndForks() {
			forks = new boolean[5];

			for (int i = 0; i < forks.length; i++)
				forks[i] = false;
		}

		private int forkLeft(int i) {
			return i;
		}
		/*
		 * Como la mesa es redonda al conseguir el tenedor derecho puede que se tenga que reinciar la cuenta, 
		 * por eso que si el tenedor en la posicion i+1(i es el filosofo i+1 es el tenedor derecho) es mayor que 5 entonces estamos hablando 
		 * que es el tenedor del primer filosofo.
		 */
		private int forkRight(int i) {
			return (i+1< forks.length) ? 1+1 :0;
		}
		
		public synchronized void BackForks(int pos) {
			forks[forkLeft(pos)] = false;
			forks[forkRight(pos)] = false;
			notifyAll();
		}		
		/*
		 * el filosofo solo puede tomar los tenedores que estan a sus lados
		 * mientras algun tenedor este ocupado , espero ,hasta que se desocupen.
		 */
		public synchronized void takeForks(int pos) {
			while (forks[forkLeft(pos)] || forks[forkRight(pos)]) {
				try {
					wait();
				} catch (InterruptedException e) {
				}
			}
			forks[forkLeft(pos)] = true;
			forks[forkRight(pos)] = true;
		}

	
	
}
