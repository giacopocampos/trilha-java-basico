public class Usuario {
    
    public static void main(String[] args) {
        
        SistemaSmartTV smartTV = new SistemaSmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV Ligada? " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTV.canal);

    }
}
