package examen1erparcial;

import java.util.Scanner;

public class EjecutarMusica {

    protected int opcion = 0, cancion = 0, opcion1 = 0, opcion3=0;

    Scanner s = new Scanner(System.in);
    Musica musica = new Canciones();

    public void Tipos() {

        while (opcion == 0) {
            System.out.println("\n\n__________MENU___________\n");

            System.out.println("Deeas Saber Sobre Musica?\n 1) si\n 2) no\n");
            opcion1 = s.nextInt();

            if (opcion1 == 1) {

                System.out.println("Que tipo de musica deseas?\n");
                System.out.println(" 1) Rock\n 2) Reggaeton\n 3) Rap\n  4) Salir\n");
                opcion3 = s.nextInt();

                switch (opcion3) {

                    case 1:
                        
                        musica.canciones(cancion);

                        break;

                    case 2:
                        musica.canciones(cancion);

                        break;

                    case 3:
                       
                        musica.canciones(cancion);

                        break;

                    case 4:
                        System.out.println("______Fin Del Programa______");
                        break;

                }
                opcion3++;
            } else if (opcion1 == 2) {
                System.out.println("Gracias Vuelva Pronto");
                break;
            }
        }
    }

    public static void main(String[] args) {
        EjecutarMusica m = new EjecutarMusica();
        m.Tipos();
    }
}
