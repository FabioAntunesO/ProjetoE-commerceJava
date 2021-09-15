import java.util.ArrayList;
import java.util.List;

public class Estoque {

	public Estoque() {
		inicializaEstoque();
	}

	List<Produto> produtos = new ArrayList<>();

	public void inicializaEstoque() {

		produtos.add(new Produto("G5-1", "Luminaria de mesa", 119.99));
		produtos.add(new Produto("G5-2", "Poltrona", 799.99));
		produtos.add(new Produto("G5-3", "Abajur", 109.99));
		produtos.add(new Produto("G5-4", "Estante", 380.99));
		produtos.add(new Produto("G5-5", "Escrivaninha", 539.99));
		produtos.add(new Produto("G5-6", "Cadeira de escritorio", 649.99));
		produtos.add(new Produto("G5-7", "Cama Box", 850.99));
		produtos.add(new Produto("G5-8", "Cadeira Gamer", 999.99));
		produtos.add(new Produto("G5-9", "Mesa de centro", 220.99));
		produtos.add(new Produto("G5-10", "Sofa", 950.99));
	}

	public void mostraEstoque() {
		cimaMenu();
		linha();
		for (Produto produto : produtos) {

			produto.retornaEstoqueMenu();

		}
		System.out.println("");

	}

	public void mostraCarrinho() {
		cimaMenu();
		linha();
		for (Produto produto : produtos) {
			if (produto.getCarrinho() != 0) {
				produto.retornaCarrinhoMenu();
			}

		}
		System.out.println("");

	}
	

	public void mostraNota() {
		linha();
		for (Produto produto : produtos) {
			if (produto.getCarrinho() != 0) {
				produto.retornaCarrinhoNota();
			}

		}
		System.out.println("");

	}
	
	public void cimaMenu() {
		linha();
		System.out.print("Codigo");
		Produto.espacoNome("Codigo", 18);
		System.out.print("Produto");
		Produto.espacoNome("Produto", 30);
		System.out.print("         " + "Preco" + "           " + "Estoque\n");
		linha();
	}

	public Produto consultaProduto(String codigo) {
		for (Produto produto : produtos) {
			if (produto.getCodigo().equals(codigo)) {
				return produto;
			}
		}
		return new Produto("G5-11", "codigo errado", 0, 0);

	}

	public void retiraEstoque(Produto produto, int quantidade) {
		produto.tiraEstoque(quantidade);
		produto.acrescentaCarrinho(quantidade);
	}

	public boolean carrinhoVazio() {

		for (Produto produto : produtos) {
			if (produto.getCarrinho() != 0) {
				return false;
			}
		}

		return true;
	}

	public void linha() {
		System.out.println("--------------------------------------------------------------------------------");
	}

	public double ValorTotal() {
		double valorTotal = 0;
		for (Produto produto : produtos) {
			valorTotal += produto.getPreco() * produto.getCarrinho();
		}
		
		return valorTotal;
	}
	
    public void resetaCarrinho() {
        for (Produto produto : produtos) {
            produto.zeraCarrinho();

        }
    }
	
}
