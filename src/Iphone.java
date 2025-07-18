public class Iphone implements ReprodutorMusic, Aparelho, Navegador{
    @Override
    public void ligarPhone() {
        System.out.println("Ligar Phone");
    }

    @Override
    public void atenderPhone() {
        System.out.println("Atender Phone");
    }

    @Override
    public void iniciarCaixaP() {
        System.out.println("Iniciar Caixa Postal");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Pagina: " + pagina);
    }

    @Override
    public void addNewAba() {
        System.out.println("Add Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausa music");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Select Music: " + music);
    }
}
