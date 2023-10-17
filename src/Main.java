

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  A) Acelerador -----> B) Motor
        // Motor observador y el Acelerador es el sujeto(Observable)



        Motor v8=new Motor();
        Acelerador acelerador=new Acelerador();

        acelerador.agregarObservador(v8);
        acelerador.pisarAcelerador();


        if (v8.Cambio()){
            System.out.println("poner motor en marcha");
        }
    }

}