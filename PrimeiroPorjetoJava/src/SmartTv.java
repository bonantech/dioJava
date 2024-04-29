/**
 * <h1>SmartTV<h1>
 * Simula possíveis estados de uma televisão com interação do usuário
 * <p>
 * <b>Note:<b> Documentação realizada via JavaDoc Tool
 * 
 * @author Lucas Bonan
 * @version 1.0
 * @since 29/04/2024
 */

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    /**
     * Este método seta a TV como ligada
     */
    public void ligar(){
        ligada = true;
    }

    /**
     * Este método seta a TV como desligada
     */
    public void desligar(){
        ligada = false;
    }

    /**
     * Este método aumenta o volume da TV de 1 em 1
     */
    public void aumentarVolume(){
        if (volume < 100) {
            ++volume;
        }
    }

    /**
     * Este método diminui o volume da TV de 1 em 1
     */
    public void diminuirVolume(){
        if (volume > 0) {
            --volume;
        }
    }

    /**
     * Este método altera o canal da TV conforme parâmetro recebido
     * @param novoCanal primeiro parâmetro informa o canal escolhido
     * @return retorna o canal selecionado
     */
    public int selecionarCanal(int novoCanal){
        return canal = novoCanal;
    }

    /**
     * Este método aumenta o volume da TV de 1 em 1
     */
    public void aumentarCanal(){
        if (canal <50) {
            ++canal;
        }
    }

    /**
     * Este método aumenta o volume da TV de 1 em 1
     */
    public void diminuirCanal(){
        if (canal > 1) {
            --canal;
        }
    }
}
