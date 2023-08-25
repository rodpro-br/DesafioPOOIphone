public class ReprodutorMusical implements IReprodutorMusical {
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }
}
