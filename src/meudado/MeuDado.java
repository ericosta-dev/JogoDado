/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meudado;

/**
 *
 * @author eric
 */
public class MeuDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Jogo j = new Jogo();
       j.inserirJogadores();
       j.inserirApostas();
       j.jogarDados();
       j.mostrarResultado();
       j.mostrarVencedor();
    }
    
}
