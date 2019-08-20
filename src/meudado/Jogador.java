/*
 * To change this license header, choose License Headers in Project Properties.
 */
package meudado;

/**
 *
 * @author eric
 */
public class Jogador {
    private String nome;
    private int valorAposta;

    public Jogador (String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValorAposta() {
        return valorAposta;
    }

    public void setValorAposta(int valorAposta) {
        this.valorAposta = valorAposta;
    }
    
    
}
