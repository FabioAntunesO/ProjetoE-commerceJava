
import java.util.Scanner;

public class Menu {
	
	private Estoque estoque;
	
	public Menu(Estoque estoque) {
		this.estoque = estoque;
	}
	
	public void mostraMenu() {
		
		Apresentacoes.inicio();
		
		estoque.mostraEstoque();
		
	}
	
	public void escolheItem() {
		System.out.print("Digite o codigo do produto desejado: ");
		
		Scanner scanner = new Scanner(System.in);
		String codigo = scanner.nextLine().toUpperCase();
		
		Produto produto = estoque.consultaProduto(codigo);
		
		if (produto.getEstoque() != 0) {
			
			System.out.print("Qual a quantidade? ");
			
			int quantidade = scanner.nextInt();
			
			if (quantidade <= produto.getEstoque() && quantidade > 0) {
				
				estoque.retiraEstoque(produto, quantidade);
				
			} else {
				
				System.out.println("\nNosso estoque nao possui esta quantidade.\n");
				
			}
			
		} else {
			
			System.out.println("Produto indisponivel no estoque.\n");
			
		}
		
	}
	
	public boolean perguntaContinuarCompra() {
		
		System.out.print("\nDeseja continuar comprando? ");
		
		Scanner scanner = new Scanner(System.in);
		
		char resposta = scanner.nextLine().toLowerCase().charAt(0);
		
		if (resposta == 's') {
			return true;
		} else {
			return false;
		}
	}

}