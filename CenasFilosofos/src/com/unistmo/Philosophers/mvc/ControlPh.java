package com.unistmo.Philosophers.mvc;

public class ControlPh {

	private FrmPh ph;
	PlatesAndForks pf;

	public ControlPh(FrmPh ph) {
		this.setPh(ph);
		setFr();
	}

	/*
	 * Metodo setFr, hace la union entre la mesa(PlatesAndForks) y los
	 * filosofos(Philosoph) y la interfaz grafica(FrmPh).
	 */
	public void setFr() {
		pf = new PlatesAndForks();
		for (int i = 0; i < 5; i++)
			new Philosoph(pf, i, ph);

	}

	public FrmPh getPh() {
		return ph;
	}

	public void setPh(FrmPh ph) {
		this.ph = ph;
	}

}
