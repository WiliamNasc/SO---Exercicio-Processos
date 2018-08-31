package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main { 

	public static void main(String[] args) throws IOException { 
		
		RedesController rdc = new RedesController();
		String nomeSo = System.getProperty("os.name"); 
	
		
		
		
		int opcao = 0;
		
		do{
		
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog("Menu Processos \n "
							+ "1- Executar configurações de ip \n"
							+ "2- Executar configurações de ping \n"
							+ "9- Fim"));
			
			switch (opcao){
			
			case 1:
				
				rdc.ip(nomeSo);
				
				break;
				
			case 2:
				
				rdc.ping(nomeSo);
				
				break;
				
			case 9:
				
				break;
				
				default:
					
					System.out.println("Opcao invalida !");
			
			}
			
			
		}while(opcao != 9);
		
		
		
	}
}
