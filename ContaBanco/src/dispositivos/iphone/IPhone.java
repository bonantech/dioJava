package dispositivos.iphone;

import dispositivos.discador.Discador;
import dispositivos.navegadorweb.NavegadorWeb;
import dispositivos.repmusical.RepMusical;

public class IPhone implements Discador, NavegadorWeb, RepMusical{

    public void discar(){
        System.out.println("DISCADOR: discando no IPhone.");
    }

    public void navegar(){
        System.out.println("NAVEGADOR WEB: navegando no IPhone.");
    }

    public void reproduzir(){
        System.out.println("REPRODUTOR MUSICAL: reproduzindo no IPhone.");
    }
}
