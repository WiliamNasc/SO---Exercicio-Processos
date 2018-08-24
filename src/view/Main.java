package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main { 

	public static void main(String[] args) {
		
		RedesController rdc = new RedesController();
		String nomeSo = System.getProperty("os.name"); 
		
		System.out.println(rdc.ip(nomeSo));

	}

}
