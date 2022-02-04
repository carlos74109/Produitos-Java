import Entidades.Produtos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double preco;
        int qtde, adicionarProd, removerProd;
        System.out.println("nome do prduto: ");
        nome = sc.nextLine();

        System.out.println("Valor do produto: ");
        preco = sc.nextDouble();

        System.out.println("Quantidade do produto: ");
        qtde = sc.nextInt();

        Produtos produtos = new Produtos(nome, preco, qtde);
        System.out.println(produtos);

        System.out.println("Adicionar produtos: ");
        adicionarProd = sc.nextInt();
        produtos.addProduto(adicionarProd);
        System.out.println(produtos);

        System.out.println("Remover produtos: ");
        removerProd = sc.nextInt();
        produtos.RemoverProduto(removerProd);
        System.out.println(produtos);
        
        sc.close();
    }
}
