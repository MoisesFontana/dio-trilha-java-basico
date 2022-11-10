public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? : " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo canal: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentou o volume para: " + smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuiu o volume para: " + smartTv.volume);
    }

}
