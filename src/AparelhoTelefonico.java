public class AparelhoTelefonico implements IAparelhoTelefonico{
    @Override
    public void ligar() {
        System.out.println("Fazendo ligação.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
