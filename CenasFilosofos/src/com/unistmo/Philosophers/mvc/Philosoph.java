package com.unistmo.Philosophers.mvc;

import java.awt.Color;

class Philosoph extends Thread {
	private PlatesAndForks pAndf;
	private int pos;
	private FrmPh ph;
	public Philosoph(PlatesAndForks p, int fr, FrmPh ph) {
		this.pAndf = p;
		this.pos = fr;
		this.ph=ph;
		start();
	}
/*
 * Piensas luego comes jajajajjaja
 * 
 */
	public void run() { 
		while (true) {
			
			thinking(pos);
			pAndf.takeForks(pos);
			eating(pos);
			pAndf.BackForks(pos);
		}
	}

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
		}
	}

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
