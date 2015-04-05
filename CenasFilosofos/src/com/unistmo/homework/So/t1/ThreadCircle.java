package com.unistmo.homework.So.t1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class ThreadCircle extends Thread{

	Frame fr;
	Color c;
	/*
	 * el delay es aleatorio.
	 */
	private int x,y,sx,sy=420,delay=GenerarR(2,20);
	
	int jump=400;
	public boolean go=true;
	
	
	/*
	 * Constructor que resive un Frame 
	 * esto es para que todas las instancias
	 * creadas de esta clase solo sean visibles en un mismo 
	 * frame.
	 * se generar un color aleatorio y una posicion aleatoria 
	 *
	 */
	public ThreadCircle(Frame fr){
		this.fr=fr;	
	c=new Color(GenerarR(0,255),GenerarR(0,255),GenerarR(0,255));
	setSx(ThreadCircle.GenerarR(0,600));
	}
	
	/*
	 * Metodo run aqui se describe la logica del 
	 * circulo y el recorrido que es desde la base del frame
	 * hasta el tope superior del mismo, haciendo el efecto de estar 
	 * rebotando
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		while (go) {
			
			try {
				if (sy == 20) {
					for ( int i = 0; i <=400; i++) {
						sy++;
						fr.repaint();
						sleep(delay);	
					}
					sy=420;
				}
				
				if (sy == 420){
					for ( int i = 0; i <=jump;i++) {
						sy--;
						fr.repaint();
						sleep(delay);
					}
					sy=20;
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	public int getD() {
		return delay;
	}

	public void setD(int d) {
		this.delay = d;
	}
/*
 * este metodo crea el circulo y es el que es llamado desde
 * el frame principal
 */
	public void paintCircle(Graphics G){	
		G=G.create();
		G.setColor(c);
		G.fillOval(sx,sy, 50, 50);
	}
	
	/*
	 * metodo que genera un numero aleatorio enterio y sus entradas son los limites
	 * superiores e inferiores.
	 */
	public static int GenerarR(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSx() {
		return sx;
	}

	public int getSy() {
		return sy;
	}

	public void setFr(Frame fr) {
		this.fr = fr;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setSx(int sx) {
		this.sx = sx;
	}

	public void setSy(int sy) {
		this.sy = sy;
	}
}
