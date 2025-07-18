public class Main {
    public static void main(String[] args) {
       ReprodutorMusic reprodutorMusic=new Iphone();
       Aparelho aparelho= new Iphone();
       Navegador navegador= new Iphone();


       runMusic(reprodutorMusic);
       runAparelho(aparelho);
       runNavegador(navegador);
       ;
    }

    public static void runMusic(ReprodutorMusic reprodutorMusic) {
        reprodutorMusic.playMusic();
    }
    public static void runAparelho(Aparelho aparelho) {
        aparelho.atenderPhone();
    }
    public static void runNavegador(Navegador navegador) {
        navegador.addNewAba();
    }


}