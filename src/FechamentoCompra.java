import java.util.InputMismatchException;
import java.util.Scanner;

public class FechamentoCompra {
	
	private Estoque estoque;

	private double taxa = 0;
	private double juros = 0;
	private double valorFinal = 0;
	private double valorTotal = 0;
	private double desconto = 0;
	
	private String nomeUsuario = "Roberto";
	private String cpfUsuario = "xxx.xxx.xxx-xx";

	public FechamentoCompra(Estoque estoque) {
		this.estoque = estoque;
	}

	public void mostraCarrinho() {
		estoque.mostraCarrinho();
	}

	public int tipoDePagamento() {
		this.valorTotal = estoque.ValorTotal();
		
		System.out.println("Escolha uma opcao de pagamento:\n");
		System.out.println("1 - A vista - Promocao de 10% de Desconto!");
		System.out.printf("    Sai por: R$ %.2f", valorTotal * 0.9);
		System.out.println("\n\n2 - No cartao - Acréscimo de 10% de Taxa!");
		System.out.printf("    Sai por: R$ %.2f", valorTotal * 1.1);
		System.out.println("\n\n3 - Em 2x - Acrescimo de 15% de Juros e Taxa!");
		System.out.printf("    Sai por 2x de: R$ %.2f", valorTotal * 0.575);
		System.out.printf(" Total: R$ %.2f", valorTotal * 1.15);


		int tipoPagamento;
		
		do {			
			System.out.print("\n\nQual a forma de pagamento desejado? ");
			
			try {
				Scanner scanner = new Scanner(System.in);
				
				tipoPagamento = scanner.nextInt();
				
			} catch (InputMismatchException e) {
				tipoPagamento = 0;
			}
			
			if (tipoPagamento != 1 && tipoPagamento != 2 && tipoPagamento != 3) {
				System.out.println("Tipo de pagamento indisponivel.");
			}
			
		} while (tipoPagamento != 1 && tipoPagamento != 2 && tipoPagamento != 3);

		return tipoPagamento;
	}

	public void pagamento(int tipoPagamento) {
		System.out.println("\n\n");
		
		if (tipoPagamento == 1) { // EDITAR A VARIAVEL TIPOPAGAMENTO
			desconto = valorTotal * 0.1;
			valorFinal = valorTotal * 0.9;
			
			System.out.printf("\nDesconto:\t\t\t\t\t\t\t R$ %.2f\n", desconto);
			System.out.printf("\nValor final:                                                     " 
					+ "R$ %.2f\n", valorFinal);
		}

		if (tipoPagamento == 2) { // EDITAR A VARIAVEL TIPOPAGAMENTO
			taxa = valorTotal * 0.1;
			valorFinal = valorTotal * 1.1;
			
			System.out.printf("Taxa:                                                            " 
					+ "R$ %.2f\n", taxa);
			
			System.out.printf("\nValor final:                                                     " 
					+ "R$ %.2f\n", valorFinal);
		}

		if (tipoPagamento == 3) { // EDITAR A VARIAVEL TIPOPAGAMENTO
			taxa = valorTotal * 0.1;
			valorFinal = valorTotal * 1.15;
			juros = valorTotal * 0.05;
			
			System.out.printf("Taxa:                                                            " 
					+ "R$ %.2f\n", taxa);
			System.out.printf("Juros:                                                           "
					+ "R$ %.2f\n", juros);
			System.out.printf("\nValor final:                                                     " 
					+ "R$ %.2f\n", valorFinal);
		}
	}
	
	public void imprimeNota() {
        
        System.out.print("\n\t\t\t    N O T A    F I S C A L\n");
        estoque.linha();
        System.out.print("Itens    \t\t\t  QtUnit \t VlUnit \t TotalUnit\n");
        estoque.mostraNota();
        estoque.linha();
        System.out.printf("Total                                                            R$ %.2f%n", valorFinal);
        System.out.print("\n--------------------------------------------------------------------------------\n");
        System.out.printf("Desconto                                                         R$ %.2f%n", desconto);
        System.out.printf("Taxa                                                             R$ %.2f%n", taxa);
        System.out.printf("Juros                                                            R$ %.2f%n", juros);
        System.out.printf("Imposto                                                          R$ %.2f%n", (valorTotal * 0.09));
        System.out.printf("%nCliente - %s%n", nomeUsuario);
        System.out.printf("CPF - %s%n", cpfUsuario);
	        
	    
	}
	
	public void cadastrarUsuario() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n");
		System.out.println("Primeiro gostariamos de te conhecer melhor\n");
		System.out.print("Insira o seu nome: ");
		nomeUsuario = scanner.nextLine();
		System.out.print("Insira o seu CPF: ");
		cpfUsuario = scanner.nextLine();
		
		//scanner.close();
	}
}
