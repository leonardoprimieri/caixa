package pagamento;

import consumidor.Conta;
import estoque.EstoqueMercado;

public interface Caixa {
	public void leitorCodigoDeBarrasECarrinho(EstoqueMercado estoque);
	public void pagar(Conta conta);
	public double trocoCliente();
	
	

}
