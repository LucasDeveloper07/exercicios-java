package Listas.Ex07.Entities;

public class Produto {
    
    private String nome;
    private Integer quant;
    private Double preco;

    // Construtor sobrecarregado para iniciar os atributos
    public Produto(String nome, Integer quant, Double preco) {
        this.nome = nome;
        this.quant = quant;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuant() {
        return quant;
    }

    public void setQuant(Integer quant) {
        this.quant = quant;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Método para adicionar a quantidade do produto
    public void addQuant(Integer quant) {
        this.quant += quant;
    }
    
    // Método para remover a quantidade do produto
    public void removeQuant(Integer quant) {
        if ((this.quant - quant) < 0) {
            System.out.println("Voce nao pode remover mais do que ja existe no estoque!");
        } else {
            this.quant -= quant;
        }
    }

    // Método para retornar todos os dados do produto
    @Override
    public String toString() {
        return "Nome: "
            + nome
            + "\nQuantidade em estoque: "
            + quant
            + String.format("\nPreco: R$%.2f", preco);
    }
}
