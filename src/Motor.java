public class Motor  implements iObservador{
    private boolean cambio;
    public Motor() {
    }

    @Override
    public void update() {
        cambio=true;
    }

    public boolean Cambio() {
        return cambio;
    }
}
