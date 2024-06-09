package loja;

import dispositivos.discador.Discador;
import dispositivos.navegadorweb.IMac;
import dispositivos.navegadorweb.NavegadorWeb;
import dispositivos.repmusical.IPod;
import dispositivos.repmusical.RepMusical;

import dispositivos.iphone.IPhone;

public class Vendedor {
    public static void main(String[] args) {
        IPod ipod = new IPod();
        IMac imac = new IMac();
        IPhone iphone = new IPhone();

        Discador discador = iphone;
        NavegadorWeb navegadorWeb = iphone;
        NavegadorWeb navegadorWeb2 = imac;
        RepMusical repMusical = iphone;
        RepMusical repMusical2 = ipod;


        repMusical2.reproduzir();
        discador.discar();
        navegadorWeb.navegar();
        navegadorWeb2.navegar();
        repMusical.reproduzir();

    }
}
