package meudado;

/**
 *
 * @author eric
 */
public class Dado {
    private int valorFace;

    public int getValorFace() {
        return valorFace;
    }

    public void setValorFace() {
        // Gera numeros aleatorios de 1 à 100.
        valorFace = (int) (1 + Math.random() * 6);
    }
    
   
}
