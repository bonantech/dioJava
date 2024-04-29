public class App {
    
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("SmartTv retirada da caixa e está " + ( smartTv.ligada ? "ligada" : "desligada"));
        System.out.println("TV está " + ( smartTv.ligada ? "ligada" : "desligada"));
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.selecionarCanal(20);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.selecionarCanal(20);
        System.out.println("Canal atual: " + smartTv.canal);

    }
}