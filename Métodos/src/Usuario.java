public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
       System.out.println("A Tv está ligada? "+smartTv.ligada);
       System.out.println("canal atual: "+smartTv.canal);
       System.out.println("volume atual:"+smartTv.volume);


       smartTv.ligar();
       System.out.println("A Tv está ligada? "+smartTv.ligada);

       smartTv.desligar();
       System.out.println("Tv ligada?"+ smartTv.ligada);

       smartTv.aumentarVolume();
       System.out.println("volume atual:"+smartTv.volume);

       smartTv.abaixarVolume();
       smartTv.abaixarVolume();
       smartTv.abaixarVolume();
       smartTv.aumentarVolume();
       System.out.println("volume atual:"+ smartTv.volume);

       System.out.println("canal atual: "+smartTv.canal);
       smartTv.mudarCanal(13);
       System.out.println("canal atual: "+smartTv.canal);

    }
}
