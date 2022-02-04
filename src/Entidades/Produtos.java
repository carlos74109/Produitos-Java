package Entidades;

public class Produtos {

    public String nome;
    public double preco;
    public int qtde;

    public Produtos(String nome, double preco, int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public double totalValor(){
        return preco * qtde;
    }

    public void addProduto(int quantidade){
        qtde += quantidade;
    }

    public void RemoverProduto(int quantidade){
        qtde -= quantidade;
    }

    @Override
    public String toString() {
        return "nome do produto: " + nome
                + " Valor do produto: " + preco
                + " quantidades compradas: " + qtde
                + " valor total da compra: " + totalValor();
    }
}
