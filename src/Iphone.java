public class Iphone{
    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();

        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorreioVoz();

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();

        NavegadorInternet navegadorInternet = new NavegadorInternet();

        navegadorInternet.adicionarNovaAba();
        navegadorInternet.exibirPagina();
        navegadorInternet.atualizarPagina();;
    }
}
