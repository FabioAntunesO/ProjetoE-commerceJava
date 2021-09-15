import java.util.Scanner;

public class Apresentacoes {
	private Scanner leia = new Scanner(System.in);

	public static void inicio() {
		System.out.print("\n-----------------------Bem vindo a Devs de int[e]=riores!-----------------------");
		System.out.print("\n----------------------------Programando o seu conforto!-------------------------\n"); 
	}
	
	public void fim() {
		
		System.out.print("\nA Devs de int[e]=riores agradece a sua visita!");
	}
	
	public void desenho(){
		System.out.print("\n\n         /@@@@@@@@@@@@@@@@@@@@@@@%                  |||   &@@@@@@@@@@@@@@@@@@  \n");
		System.out.print("	 /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.            |||   &@@@@@@@@@@@@@@@@@@  \n");
		System.out.print("	 /@@@@@@@@&*@@@@@@@@@@@@*  @@@@@@@,         |||   &@@@@@@@@/%@@@@@@@@  \n");    
		System.out.print("	 /@@@@@@@@&*@@@@@@@@@@@@@@@@@..@@@@@*       |||   &@@@@@@@@/%@@@@@@@@  \n"); 
		System.out.print("	      @@@@&*@@@@         &@@@@@@ @@@@@      |||        @@@@/%@@@@      \n");   
		System.out.print("	      @@@@&*@@@@            @@@@@ &@@@@     |||        @@@@/%@@@@      \n");   
		System.out.print("	      @@@@&*@@@@             .@@@@ @@@@%    |||        @@@@/%@@@@      \n");  
		System.out.print("	      @@@@&*@@@@              @@@@#(@@@@    |||        @@@@/%@@@@      \n");    
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");     
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");    
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");    
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n"); 
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");  
		System.out.print("	      @@@@&*@@@@             @@@@@ @@@@     |||        @@@@/%@@@@      \n");  
		System.out.print("	      @@@@&*@@@@           @@@@@# @@@@*     |||        @@@@/%@@@@      \n");  
		System.out.print("         *&&&&@@@@&*@@@@&&&&&@@@@@@@@@% @@@@@       |||   %&&&&@@@@/%@@@@&&&& \n"); 
		System.out.print("	 /@@@@@@@@&*@@@@@@@@@@@@@@@. @@@@@@*        |||   &@@@@@@@@/%@@@@@@@@  \n");      
		System.out.print("	 /@@@@,,,,,,,,,,,,,,,,/&@@@@@@@@@           |||   &@@@@,,,,,,,,,,@@@@  \n");       
		System.out.print("	 /@@@@@@@@@@@@@@@@@@@@@@@@@@@               |||   &@@@@@@@@@@@@@@@@@@  \n\n");    
		
	}
		
	public boolean pergunta() {
		
		System.out.print("\nDeseja comprar algo? S/N ");
		
		char respostaUsuario;
		boolean respostaBoolean = false;
		
		do {
			respostaUsuario = leia.nextLine().toLowerCase().charAt(0);
			
			if (respostaUsuario == 's' || respostaUsuario == 'S') {
			
				System.out.print("\nIremos te apresentar nossos produtos!\n");
				respostaBoolean = true;
			}		
			else if (respostaUsuario == 'n' || respostaUsuario == 'N') {
				System.out.print("\nAte logo!\n");
				respostaBoolean = false;
			}
			else {
				System.out.println("Caracter invalido!! ");
				System.out.print("\nDigite um novo caracter: ");
			}
			
		} while (respostaUsuario != 's' && respostaUsuario != 'n');
		
		return respostaBoolean;
	}		
	
}	
