package com.unistmo.Philosophers.mvc;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.Font;


@SuppressWarnings("serial")
public class FrmPh extends JFrame {


	private JPanel panel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblPh2;
	private JLabel lblPh3;
	private JLabel lblPh4;
	private JLabel lblPh5;
	private JLabel lblPh1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPh frame = new FrmPh();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPh() {
		
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		label = new JLabel("Thinking");
		
		label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setBackground(Color.RED);
		
		label_2 = new JLabel("Eating");
		
		label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBackground(Color.GREEN);
		
		lblPh2 = new JLabel("");
		lblPh2.setSize(new Dimension(30, 30));
		lblPh2.setOpaque(true);
		lblPh2.setBackground(Color.BLACK);
		
		lblPh3 = new JLabel("");
		lblPh3.setSize(new Dimension(30, 30));
		lblPh3.setOpaque(true);
		lblPh3.setBackground(Color.BLACK);
		
		lblPh4 = new JLabel("");
		lblPh4.setSize(new Dimension(30, 30));
		lblPh4.setOpaque(true);
		lblPh4.setBackground(Color.BLACK);
		
		lblPh5 = new JLabel("");
		lblPh5.setSize(new Dimension(30, 30));
		lblPh5.setOpaque(true);
		lblPh5.setBackground(Color.BLACK);
		
		lblPh1 = new JLabel("");
		lblPh1.setSize(new Dimension(30, 30));
		lblPh1.setOpaque(true);
		lblPh1.setBackground(Color.BLACK);
		
		lblNewLabel = new JLabel("Cena de  los filosofos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(309, Short.MAX_VALUE)
					.addComponent(lblPh1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(290))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addGap(82)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPh2, Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(60)
							.addComponent(lblPh3)
							.addGap(126)
							.addComponent(lblPh4)
							.addGap(12)))
					.addGap(7)
					.addComponent(lblPh5)
					.addContainerGap(164, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(158, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
					.addGap(134))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(328)
							.addComponent(label_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(327)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label)
							.addGap(8))
						.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(82, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(38)
					.addComponent(lblPh1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPh2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPh5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(89)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPh3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPh4, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(91))
		);
		gl_panel.linkSize(SwingConstants.VERTICAL, new Component[] {lblPh2, lblPh3, lblPh4, lblPh5, lblPh1});
		gl_panel.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblPh2, lblPh3, lblPh4, lblPh5, lblPh1});
		panel.setLayout(gl_panel);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 637, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 493, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 522);
		
		@SuppressWarnings("unused")
		ControlPh C=new ControlPh(this);
		
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public void setLabel_1(JLabel label_1) {
		this.label_1 = label_1;
	}

	public JLabel getLabel_2() {
		return label_2;
	}

	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}

	public JLabel getLabel_3() {
		return label_3;
	}

	public void setLabel_3(JLabel label_3) {
		this.label_3 = label_3;
	}

	public JLabel getLblPh2() {
		return lblPh2;
	}

	public void setLblPh2(JLabel lblPh2) {
		this.lblPh2 = lblPh2;
	}

	public JLabel getLblPh3() {
		return lblPh3;
	}

	public void setLblPh3(JLabel lblPh3) {
		this.lblPh3 = lblPh3;
	}

	public JLabel getLblPh4() {
		return lblPh4;
	}

	public void setLblPh4(JLabel lblPh4) {
		this.lblPh4 = lblPh4;
	}

	public JLabel getLblPh5() {
		return lblPh5;
	}

	public void setLblPh5(JLabel lblPh5) {
		this.lblPh5 = lblPh5;
	}

	public JLabel getLblPh1() {
		return lblPh1;
	}

	public void setLblPh1(JLabel lblPh1) {
		this.lblPh1 = lblPh1;
	}
}
