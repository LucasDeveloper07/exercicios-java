package Listas.Ex07.Application;

import java.util.Scanner;
import Listas.Ex07.Entities.Produto;
import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>(); // Lista dos produtos para controle de estoque

        int opcao;

        // Menu de interação com o usuario
        do {
            System.out.println("\n=====ESTOQUE=====");
            System.out.println("1-Cadastrar produto");
            System.out.println("2-Listar produtos");
            System.out.println("3-Atualizar quantidade");
            System.out.println("4-Calcular valor total do estoque");
            System.out.println("5-Sair");
            System.out.print("Digite a opcao desejada: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha pendente do buffer

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    
                    System.out.print("Informe a quantidade em estoque: ");
                    int quantProduto = sc.nextInt();

                    // Tratamento de erro caso a quantidade do produto seja menor que 0
                    if (quantProduto < 0) {
                        System.out.print("Valor invalido! Insira um valor valido: ");
                        quantProduto = sc.nextInt();
                    }
                    
                    System.out.print("Informe o valor do produto: ");
                    double precoProduto = sc.nextDouble();
                    
                    // Tratamento de erro caso o preço do produto seja menor que 1
                    if (precoProduto < 1) {
                        System.out.print("Valor invalido! Insira um valor valido: ");
                        precoProduto = sc.nextDouble();
                    }

                    // Intanciação do objeto produto com os atribudos iniciados e adição dele na lista
                    produtos.add(new Produto(nomeProduto, quantProduto, precoProduto));
                    break;
                case 2:
                    // Condição para verificar se a lista esta vazia
                    if (!produtos.isEmpty()) {
                        // Impressão de todos os produtos contidos na lista
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("\nProduto " + (i + 1));
                            System.out.println(produtos.get(i));
                        }
                    } else {
                        System.out.println("A lista esta vazia! Primeiro, cadastre um produto.");
                    }
                    break;
                case 3: 
                    // Condição para verificar se a lista esta vazia
                    if (!produtos.isEmpty()) {
                        System.out.println("\nDigite o nome do produto que deseja atualizar a quantidade: ");
                        String buscaProduto = sc.nextLine();
                        boolean encontrado = false;
    
                        // Laço para realizar a busca do produto na lista a partir do nome
                        for (Produto produto : produtos) {
                            if (produto.getNome().equals(buscaProduto)) {
                                encontrado = true;
                                System.out.println();
                                System.out.println(produto);
    
                                System.out.println("\n1-Remover produto do estoque");
                                System.out.println("2-Adicionar produto ao estoque");
                                System.out.print("Informe a opcao desejada: ");
                                int opcaoAtt = sc.nextInt();
    
                                if (opcaoAtt == 1) {
                                    System.out.print("Informe a quantidade que deseja remover: ");
                                    int removeProduto = sc.nextInt();
    
                                    // Tratamento de erro caso a quantidade a ser removida seja menor que 0
                                    if (removeProduto < 0) {
                                        System.out.print("Valor invalido! Informe um valor valido: ");
                                        removeProduto = sc.nextInt();
                                        
                                        // Chamada do método de remoção da quantidade em estoque do produto
                                        produto.removeQuant(removeProduto);
                                        System.out.println();
                                        System.out.println(produto); // Impressao do produto com quantidade atualizada
                                    } else {
                                        // Chamada do método de remoção da quantidade em estoque do produto
                                        produto.removeQuant(removeProduto);
                                        System.out.println();
                                        System.out.println(produto); // Impressao do produto com quantidade atualizada
                                    }
                                } else if (opcaoAtt == 2) {
                                    System.out.print("Informe a quantidade que deseja adicionar: ");
                                    int addProduto = sc.nextInt();
                                    
                                    // Tratamento de erro caso a quantidade a ser adicionada seja menor que 0
                                    if (addProduto < 0) {
                                        System.out.print("Valor invalido! Insira um valor valido: ");
                                        addProduto = sc.nextInt();
                                        
                                        // Chamada do método de remoção da quantidade em estoque do produto
                                        produto.addQuant(addProduto);
                                        System.out.println();
                                        System.out.println(produto); // Impressao do produto com quantidade atualizada
                                    } else {
                                        // Chamada do método de remoção da quantidade em estoque do produto
                                        produto.addQuant(addProduto);
                                        System.out.println();
                                        System.out.println(produto); // Impressao do produto com quantidade atualizada
                                    }
                                } else {
                                    System.out.println("Opcao invalida!");
                                }
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Produto nao encontrado!");
                        }
                    } else {
                        System.out.println("A lista esta vazia! Primeiro, cadastre um produto.");
                    }
                    break;
                case 4:
                    // Condição para verificar se a lista esta vazia
                    if (!produtos.isEmpty()) {
                        double valorEstoque = 0;
    
                        for (Produto produto : produtos) {
                            for (int i = 0; i < produto.getQuant(); i++) {
                                valorEstoque += produto.getPreco(); // Incremento do valor de cada produto na variavel valorEstoque
                            }
                        }
                        
                        System.out.printf("\nValor total do estoque: R$%.2f\n",valorEstoque);
                    } else {
                        System.out.println("A lista esta vazia! Primeiro, cadastre um produto.");
                    }
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!"); // Tratamento de erro
                    break;
            }
        } while (opcao !=5);

        sc.close();
    }
}