package controller;

public class RedesController {
	
	public String ip (String nomeSo){
		
		String Linux = "Linux";
		String Windows = "Windows";
		
		if (nomeSo.equals(Linux)){
		
			return nomeSo; 
		
		} else if (nomeSo.equals(Windows)){
			
			return nomeSo;
		
		}else {return "Algo deu errado !";}
		
		

}
	
}
