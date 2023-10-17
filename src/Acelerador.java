import java.lang.reflect.Array;
import java.util.ArrayList;

public class Acelerador implements isujetoObservable{

    public ArrayList<iObservador> observadores; //enlazamos el acelerador con el motor

    public Acelerador() {
        observadores = new ArrayList<iObservador>();
    }

    @Override
    public void agregarObservador(iObservador observador) {
        observadores.add(observador);
    }


    public void pisarAcelerador() {
        notificarobservadores();
    }

    @Override
    public void notificarobservadores() {
        for (iObservador obser:observadores) {
            obser.update();

        }

    }


}
