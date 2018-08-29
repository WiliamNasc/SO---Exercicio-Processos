package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class RedesController {

	
	public void ip (String nomeSo) throws IOException{ 
		
		if (nomeSo.equals("Linux")){
			
			try{
				
				Process proc = Runtime.getRuntime().exec("ifconfig wlan");
				InputStream fluxo = proc.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				
				
				while(linha != null){
					
					System.out.println(linha);
					linha = buffer.readLine();
					
					
				}
				
				
				
				} catch (IOException e){
					
					String erro = e.getMessage();
					JOptionPane.showMessageDialog(null, erro, "ERRO" , JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
			

			
		} else if (nomeSo.equals("Windows 10")){
			
			try{
				
				Process proc = Runtime.getRuntime().exec("ipconfig");
				InputStream fluxo = proc.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				
				while(linha != null){
					
					System.out.println(linha);
					linha = buffer.readLine();
					
				}
				
				} catch (IOException e){
					
					String erro = e.getMessage();
					JOptionPane.showMessageDialog(null, erro, "ERRO" , JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
			}

		}
		
	}
