package com.unistmo.Philosophers.mvc;

import java.awt.Color;

class Philosoph extends Thread {
	private PlatesAndForks pAndf;
	private int pos;
	private FrmPh ph;

	/*
	 * Constructor Philosoph un filosofo tiene una mesa @param p una posicion
	 * @param fr Y un Frame @param pg donde sera visualizado el filosofo.
	 */
	public Philosoph(PlatesAndForks p, int fr, FrmPh ph) {
		this.pAndf = p;
		this.pos = fr;
		this.ph = ph;
		start();
	}

	/*
	 * metodo run el cual llama a los metodos por el orden que esta establecido
	 * en el problema el filosofo piensa, el filosofo toma tenedores el filosofo
	 * come el filosofo deja los tenedores
	 */
	public void run() {
		while (true) {

			thinking(pos);
			try {
				pAndf.takeForks(pos);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			eating(pos);
			pAndf.BackForks(pos);
		}
	}

	/*
	 * Metodo pensar @param place este parametro es el lugar en donde esta
	 * sentado el filosofo dependiendo del lugar se le asigna un label del Frame
	 * el pensar implica que el filosofo pase un tiempo sin comer.
	 */
	private void thinking(int place) {
		switch (place) {
		case 0:
			ph.getLblPh1().setBackground(Color.RED);
			break;
		case 1:
			ph.getLblPh2().setBackground(Color.RED);
			break;
		case 2:
			ph.getLblPh3().setBackground(Color.RED);
			break;
		case 3:
			ph.getLblPh4().setBackground(Color.RED);
			break;
		case 4:
			ph.getLblPh5().setBackground(Color.RED);
			break;
		default:
			break;
		}

		try {
			sleep((int) (Math.random() * 2000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/*
	 * metodo comer @param place este parametro es el lugar en donde esta
	 * sentado el filosofo igual que el metodo pensar, esto es el tiempo el cual
	 * el filosofo pasa comiendo , y ocupando los tenedores.
	 */
	private void eating(int place) {
		switch (place) {
		case 0:
			ph.getLblPh1().setBackground(Color.GREEN);
			break;
		case 1:
			ph.getLblPh2().setBackground(Color.GREEN);
			break;
		case 2:
			ph.getLblPh3().setBackground(Color.GREEN);
			break;
		case 3:
			ph.getLblPh4().setBackground(Color.GREEN);
			break;
		case 4:
			ph.getLblPh5().setBackground(Color.GREEN);
			break;
		default:
			break;
		}
		try {
			sleep((int) (Math.random() * 2000));
		} catch (InterruptedException e) {
		}

	}
}
