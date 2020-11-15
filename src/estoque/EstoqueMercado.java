package estoque;

public enum EstoqueMercado {

    _3647182("Arroz 5kg", 40d),
    _3947182("Rosca", 450d),
    _1347182("Banana 1Kg", 3.3d),
    _9956326("Arroz 1kg", 22d);

    private final String nome;
    private final Double preco;


    EstoqueMercado(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }


}
