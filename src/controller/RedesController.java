package controller;

public class RedesController {
	
	public String ip (String nomeSo){
		
		String Linux = "Linux";
		String Windows = "Windows 10";
		
		if (nomeSo.equals(Linux)){ 
			
			/* O comando para linux de configuração
			 ip é if config; */
			
		
			return nomeSo; 
		
		} else if (nomeSo.equals(Windows)){
			
			return nomeSo;
		
		}else {return "Algo deu errado !";}
		
		

} 
	
}
