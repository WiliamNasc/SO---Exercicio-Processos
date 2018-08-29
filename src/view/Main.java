package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main { 

	public static void main(String[] args) throws IOException { 
		
		RedesController rdc = new RedesController();
		String nomeSo = System.getProperty("os.name"); 
	
		rdc.ip(nomeSo);
		
	}
}
