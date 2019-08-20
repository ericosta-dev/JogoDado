/*
 * To change this license header, choose License Headers in Project Properties
 */
package meudado;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class Jogo {
    private final Scanner entrada = new Scanner(System.in);
    private final Dado dado1 = new Dado();
    private final Dado dado2 = new Dado();
    private Jogador jogador1, jogador2;
    private int resultado;
    
    //Receber nome dos jogadores.
    public void inserirJogadores(){
        System.out.println("Informe o nome do jogador 1: ");
        jogador1 = new Jogador(entrada.next());

        System.out.println("Informe o nome do jogador 2: ");
        jogador2 = new Jogador(entrada.next());
    }
    
    //Recebe o valor das apostas 
    public void inserirApostas(){
        int aposta;
        do{
            System.out.println(jogador1.getNome() + " informe sua aposta: ");
            aposta = entrada.nextInt();
        } while (aposta < 2 || aposta > 12 || aposta == jogador1.getValorAposta()); //Recebe um valor de 2 a 12 e atribui a jogador1
        jogador1.setValorAposta(aposta);
     
        do{
            System.out.println(jogador2.getNome() + " informe sua aposta: ");
            aposta = entrada.nextInt();
            if (aposta == jogador1.getValorAposta()){ //Se a aposta do jogador2 for igual ao do jogador1, recebe a entrada novamente
                System.out.println("Valor ja escolhido");
            }
        } while (aposta < 2 || aposta > 12 || aposta == jogador2.getValorAposta()); //Recebe um valor de 2 a 12 e atribui a jogador2
        jogador2.setValorAposta(aposta);
    }
    
    public void jogarDados(){
        dado1.setValorFace();
        dado2.setValorFace();
    }
    
    public void mostrarResultado(){
        resultado = dado1.getValorFace() + dado2.getValorFace();
        System.out.println("Resultado: " + resultado);
    }
    
    //retornar vencedor
    public void mostrarVencedor(){
        if (resultado == jogador1.getValorAposta()) {
            System.out.println("JOGADOR 1 VENCEDOR");
        } else if (resultado == jogador2.getValorAposta()){
            System.out.println("JOGADOR 2 VENCEDOR");
        } else {
            System.out.println("COMPUTADOR VENCEDOR");
        }
    }
}
