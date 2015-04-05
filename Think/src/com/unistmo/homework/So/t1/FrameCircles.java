package com.unistmo.homework.So.t1;


import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class FrameCircles extends Frame implements WindowListener{
	public static final int H=640;
	public static final int W=500;
	private ThreadCircle[] tCircle =new ThreadCircle[30];
	
	
	/*
	 * Constructor de la ventana 
	 * Aqui se establece tamaño de la ventana
	 * se agrega un listener para el cerrado  de la misma
	 * ademas de que se crean los circulos que seran los que 
	 * se moveran en el frame y se inician porque cada 
	 * circulo es un Thread
	 *
	 */
	public FrameCircles(){
		
	    setSize(H,W);
		addWindowListener(this);
		CreateCircles();
		repaint();
		for (int i = 0; i < tCircle.length; i++) {
			tCircle[i].start();
		}
		
	}
	/*
	 * Aqui se repintan los circulos en el frame 
	 * @see java.awt.Window#paint(java.awt.Graphics)
	 */
	public void paint(Graphics G){
		for (int i = 0; i < tCircle.length; i++) {
			tCircle[i].paintCircle(G);
		}
		
	}		
	/*
	 * Creacion de los circulos
	 */
	public void CreateCircles(){
	
		for (int i = 0; i < tCircle.length; i++) {
			tCircle[i]=new ThreadCircle(this);		
		}
		
	}
	/*
	 * Main	
	 */
	public static void main(String argv[]){
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCircles frame =new FrameCircles();
					frame.setVisible(true);	
	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
	
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
