package com.unistmo.Philosophers.mvc;

public class PlatesAndForks {
	/*
	 * arreglo de tenedores, en nuestro caso 5 si el tenedor esta en estado
	 * false esto es igual a que no esta siendo ocupado, pero si esta en true el
	 * tenedor esta siendo ocuapado.
	 */
	private boolean[] forks;

	/*
	 * Constructor en el cual se crean y se iniciliza el vector de tenedores.
	 */
	public PlatesAndForks() {
		forks = new boolean[5];

		for (int i = 0; i < forks.length; i++)
			forks[i] = false;
	}

	/*
	 * Como el filosofo en posicion @param i es igual a la de su posicion en su
	 * tenedor izquiero , se regresa la misma posicion.
	 */
	private int forkLeft(int i) {
		return i;
	}

	/*
	 * Como la mesa es redonda al conseguir el tenedor derecho puede que se
	 * tenga que reinciar la cuenta, por eso que si el tenedor en la posicion
	 * i+1(i es el filosofo, i+1 es el tenedor derecho) es mayor que 5 entonces
	 * estamos hablando que es el tenedor del primer filosofo.
	 */
	private int forkRight(int i) {
		return (i + 1 < forks.length) ? i + 1 : 0;
	}

	/*
	 * los filosofos pueden dejar los tenedores cuando los desocupen pues no hay
	 * restrccion para que los dejen, se notifica a todos los filosofos que los
	 * tenedores que el otro filosofo desocupo ya estan listos para su uso.
	 */
	public synchronized void BackForks(int pos) {
		forks[forkLeft(pos)] = false;
		forks[forkRight(pos)] = false;
		notifyAll();
	}

	/*
	 * el filosofo solo puede tomar los tenedores que estan a sus lados mientras
	 * algun tenedor este ocupado ,el filosofo espera ,hasta que se desocupen.
	 */
	public synchronized void takeForks(int pos) throws InterruptedException {
		while (forks[forkLeft(pos)] || forks[forkRight(pos)]) {
			wait();
		}
		forks[forkLeft(pos)] = true;
		forks[forkRight(pos)] = true;
	}

}
