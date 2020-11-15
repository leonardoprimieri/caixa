import consumidor.Conta;
import estoque.EstoqueMercado;
import estoque.Inventario;
import exceptions.NaoAutorizadoException;
import login.Login;
import pagamento.Caixa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaCaixa implements Caixa {

    private EstoqueMercado estoque;
    private Conta conta;
    Map<String, Double> carrinho = new HashMap<String, Double>();
    private Inventario<EstoqueMercado> inventarioEstoque = new Inventario<EstoqueMercado>();

    public static void main(String[] args) {
        System.out.println("Insira as credenciais para acessar o sistema.");

        Login login = new Login();
        Scanner scannerNome = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scannerNome.next();

        Scanner scannerSenha = new Scanner(System.in);
        System.out.println("Senha: ");
        String senha = scannerSenha.next();


        if (login.eUmUsuario(nome, senha)) {
            Inventario<EstoqueMercado> estoqueMercado = new Inventario<EstoqueMercado>();

            System.out.println("-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Logado com sucesso!");
            System.out.println("-=-=-=-=-=-=-=-=-=-=");

            Scanner scannerCodigo = new Scanner(System.in);
            String codigoDeBarras = scannerCodigo.nextLine();


//            System.out.println(EstoqueMercado._1347182.getNome());
            // Aqui vai o funcionamento do sistema em si.
        } else {
            throw new NaoAutorizadoException("Usuário ou senha errados!");
        }

    }

    public SistemaCaixa(){
        for(EstoqueMercado e : EstoqueMercado.values()){
            inventarioEstoque.colocarItem(e, 150);
        }
    }

    @Override
    public void leitorCodigoDeBarrasECarrinho(EstoqueMercado estoque) {
        String nome = estoque.getNome();
        Double preco = estoque.getPreco();

        carrinho.put(nome, preco);
    }

    @Override
    public void pagar(Conta conta) {

        Double valor = 0d;
        for(Double preco : carrinho.values()){
            valor += preco;
        }



    }

    @Override
    public double trocoCliente() {
        return 0;
    }
}
