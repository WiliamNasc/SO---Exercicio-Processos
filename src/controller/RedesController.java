package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class RedesController {

	public void lerIp (String comando, String Adaptador, String Ipv4){

		try{
			 
			
			Process proc = Runtime.getRuntime().exec(comando);
			InputStream fluxo = proc.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			String [] vetor = new String [2];
			
			
			
			while(linha != null){
			
				if (linha.contains(Adaptador)){
					
					vetor[0] = linha;
				
				}else if (linha.contains(Ipv4)){
					
					vetor[1] = linha;
					
					System.out.println("Adaptador: " + vetor[0]
							+ " | Ipv4: " + vetor[1]);
					
				}
				
				linha = buffer.readLine();

			}

		
		} 
			 catch (IOException e){
				
				String erro = e.getMessage();
				JOptionPane.showMessageDialog(null,erro,
						"ERRO" , JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}

		
	}

//--------------------------------------------------------------------------------
	
	
	public void ip (String nomeSo) throws IOException{ 
		
		if (nomeSo.contains("Linux")){
			
			lerIp("ifconfig", "ether", "inet");
			
			
		}else if (nomeSo.contains("Windows")){
			
			lerIp("ipconfig", "Adaptador", "IPv4");
		}
		

		
	}
	
//--------------------------------------------------------------------------------
	
	
	public void ping (String nomeSo) throws IOException{ 
		
		
		if (nomeSo.equals("Linux")){
			
			lerPing("ping www.google.com -c 10");
			
			
		}else if (nomeSo.equals("Windows 10")){
			
			lerPing("ping -n 10 www.google.com");

		}
		
	}
//-------------------------------------------------------------------------------- 
	
	public void menuProcessos(String nomeSo) throws IOException{
		
		int opcao = 0;
		
		do{
		
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog("MENU PROCESSOS \n\n"
							+ "1 - EXEC.: config. ip \n\n"
							+ "2 - EXEC.: config. ping \n\n"
							+ "9 - ENCERRAR \n\n"));
			
		avaliaOp(opcao, nomeSo);
			
			
		}while(opcao != 9);
		
		

	}
	
//-------------------------------------------------------------------------------
	
	public int avaliaOp(int opcao, String nomeSo) throws IOException{
		
		switch (opcao){
		
		case 1:
			
			ip(nomeSo);
			
			break;
			
		case 2:
			
			ping(nomeSo);
			
			break;
			
		case 9:
			
			break;
			
			default:
				
				System.out.println("Opcao invalida !");
		
		}
		
		return opcao;
	}
	
//-------------------------------------------------------------------------------

	public void lerPing (String comando){
		
		try{
			
			
			Process proc = Runtime.getRuntime().exec(comando);
			InputStream fluxo = proc.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			
			
			while(linha != null){
			
				System.out.println(linha);
				linha = buffer.readLine();

			}

		
		} 
			 catch (IOException e){
				
				String erro = e.getMessage();
				JOptionPane.showMessageDialog(null,erro,
						"ERRO" , JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}


	}
	
//-------------------------------------------------------------------------------
	
	
}


