package OfertaAcademica;

import java.io.IOException;
import java.util.Scanner;

//git fetch origin
//git switch Papus
//git merge origin/yopo --allow-unrelated-histories
//git push
public class Main {

    /*metodos */
    public static void iniciar() {
        boolean sw = true;
        Scanner sc = new Scanner(System.in);
        while (sw) {
            System.out.println(" ");
            System.out.println("------------------------------------- ");
            System.out.println("   1  : salir");
            System.out.println("   2  : saludo");
            System.out.println("------------------------------------- ");
            System.out.println(" ");
            System.out.print("elige una opcion: ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    sw = false;
                    break;
                case 2:
                    System.out.println("holas ");
                    break;
                default:
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {//throws IOException
        Scanner sc = new Scanner(System.in);
        iniciar();
        /*
        //1. Crear e instanciar
        AdmisionFacultativa adm1 = new AdmisionFacultativa();
        adm1.mostrar();

        // 2. Leer datos por teclado
        System.out.println("--- Ingrese datos para Admision 2 ---");
        AdmisionFacultativa adm2 = new AdmisionFacultativa();
        adm2.leer();

        // 3. Mostrar resultados
        System.out.println("--- Reporte General ---");
        adm1.mostrar();
        adm2.mostrar();

        // 4. Ejemplo de una acción específica
        adm2.anunciar();

        Universidad U = new Universidad();
        U.mostrar();
         */
    }
}
