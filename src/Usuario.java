public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada: "   + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("TV Ligada :"   + smartTv.volume);

        smartTv.ligar ();
        System.out.println("TV Ligada ? "   + smartTv.ligada);
        
        smartTv.desligar ();
        System.out.println("TV Ligada ? "  + smartTv.ligada);

        smartTv.pularCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
