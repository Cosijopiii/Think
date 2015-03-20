package com.unistmo.Philosophers.mvc;

public class ControlPh {

	private FrmPh ph;

	public ControlPh(FrmPh ph) {
		this.setPh(ph);
		setFr();
	}

	public void setFr() {
		PlatesAndForks pf = new PlatesAndForks();
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
