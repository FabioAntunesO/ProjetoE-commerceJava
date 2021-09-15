public class Main {
	public static void main(String[] args) {

		Apresentacoes apresentacoes = new Apresentacoes();

		Estoque estoque = new Estoque();

		Menu menu = new Menu(estoque);

		FechamentoCompra fechamento = new FechamentoCompra(estoque);

		Boolean comprar = true;

		while (comprar) {

			Apresentacoes.inicio();
			apresentacoes.desenho();

			if (apresentacoes.pergunta()) {

				fechamento.cadastrarUsuario();

				do {

					menu.mostraMenu();

					menu.escolheItem();

					fechamento.mostraCarrinho();

				} while (menu.perguntaContinuarCompra());

				
				if (estoque.carrinhoVazio()) {
					apresentacoes.fim();
					comprar = false;
				} else {

					fechamento.mostraCarrinho();

					int tipoDePagamento = fechamento.tipoDePagamento();

					fechamento.pagamento(tipoDePagamento);

					fechamento.imprimeNota();

					comprar = menu.perguntaContinuarCompra();
					apresentacoes.fim();
					
					estoque.resetaCarrinho();
				}

			} else {
				apresentacoes.fim();
				comprar = false;

			}

		}

	}
}
