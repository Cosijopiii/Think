package so;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Circulo extends JFrame{
	int x=0;
	public void paint(Graphics g){
		g.setColor(Color.DARK_GRAY);
		g.fillOval(x, 30, 50, 50);
	}
	public void movimiento(){
		for (int i = 0; i < 200; i++) {
			x=x+1;
			repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	

	public static void main(String argv[]){
		Circulo frame =new Circulo();
		frame.addWindowListener(new WindowListener(){

			@Override
			public void windowActivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosed(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);	
				
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowOpened(WindowEvent arg0) {
				// TODO Auto-generated method stub
				
			}
				
			
		});

		frame.setSize(400,300);
		frame.setVisible(true);
		frame.movimiento();
	}
}
