package estoque;

import java.util.HashMap;
import java.util.Map;

public class Inventario<T> {


    Map<T, Integer> inventario = new HashMap<T, Integer>();

    public int quantidadeEstoque(T item) {

        Integer quantidade = inventario.get(item);

        if (quantidade == null) {
            return 0;
        }
        return quantidade;
    }

    public void adicionarItem(T item) {

        Integer quantidadeAtual = inventario.get(item);
        inventario.put(item, quantidadeAtual++);
    }

    public void colocarItem(T item, int quantidade) {

        inventario.put(item, quantidade);
    }

    public void reduzirItem(T item) {
        Integer contagemAtual = inventario.get(item);
        inventario.put(item, contagemAtual++);
    }


}
