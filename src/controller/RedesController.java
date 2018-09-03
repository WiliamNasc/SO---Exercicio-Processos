package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class RedesController {

	
	public void ip (String nomeSo) throws IOException{ 
		
		
		if (nomeSo.contains("Linux")){
			
			try{
				
				
				Process proc = Runtime.getRuntime().exec("ifconfig eth0");
				InputStream fluxo = proc.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				
				String [] vetor = new String [linha.length()];
				int i = 0;
				
				while(linha != null){
				
					i++;
					System.out.println(linha);
					linha = buffer.readLine();
					
					vetor[i] = linha;

					}
				/*
				for (i = 0; i < vetor.length; i++){
					
					if (vetor[i] ==  null){
					
					vetor[i] = "";
					
					} else {System.out.println(vetor[i]);}
				}*/
			
			} 
				 catch (IOException e){
					
					String erro = e.getMessage();
					JOptionPane.showMessageDialog(null, erro, "ERRO" , JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
			

			
		} else if (nomeSo.contains("Windows")){
			
			try{
				
				Process proc = Runtime.getRuntime().exec("ipconfig");
				InputStream fluxo = proc.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				String vetor[] = new String[2];
				
				while(linha != null){
					
					if(linha.contains("Adaptador")){
						vetor[0] = linha;
						
					}
					else if(linha.contains("IPv4")){
						vetor[1] = linha;
						System.out.println(vetor[0] + "\n" + vetor[1]);
					}
					
					linha = buffer.readLine();
					
				}
				
				} catch (IOException e){
					
					String erro = e.getMessage();
					JOptionPane.showMessageDialog(null, erro, "ERRO" , JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
			}

		}
	
	
	public void ping (String nomeSo) throws IOException{ 
		
		
		if (nomeSo.equals("Linux")){
			
			try{
				
				
				Process proc = Runtime.getRuntime().exec("ping www.google.com");
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
					JOptionPane.showMessageDialog(null, erro, "ERRO" , JOptionPane.ERROR_MESSAGE);
					e.printStackTrace();
				}
			

			
		} else if (nomeSo.equals("Windows 10")){
			
			try{
				
				Process proc = Runtime.getRuntime().exec("ping www.google.com");
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
