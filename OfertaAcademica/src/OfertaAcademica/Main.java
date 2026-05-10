package OfertaAcademica;

import java.io.IOException;
import java.util.Scanner;

//git fetch origin
//git switch Papus
//git merge origin/yopo --allow-unrelated-histories
//git push
public class Main {

    public static void gestionarFacultad(Universidad U) {
        boolean sw = true;
        Scanner sc = new Scanner(System.in);
        while (sw) {
            System.out.println(" ");
            System.out.println("////////ESTAS EN FACULTADES///////// ");

            System.out.println("   1  : Listar Facultades");
            System.out.println("   2  : Agregar Facultad");
            System.out.println("   3  : Quitar  Facultad");
            System.out.println("   0  : volver");

            System.out.println("//////////////////////////////////// ");
            System.out.println(" ");
            System.out.print("elige una opcion: ");
            int x = sc.nextInt();
            switch (x) {
                case 0:
                    sw = false;
                    break;
                case 1:
                    U.mostrar();
                    break;
                case 2:
                    U.agregarFacultad();
                    break;
                case 3:
                    U.quitarFacultad();
                    break;
                default:
                    break;
            }
        }
    }

    /*metodos */
    public static void iniciar(Universidad U) {
        boolean sw = true;
        Scanner sc = new Scanner(System.in);
        while (sw) {
            System.out.println(" ");
            System.out.println("------------------------------------- ");

            System.out.println("   1  : Gestionar Facultades");
            System.out.println("   2  : Gestionar Carreras");
            System.out.println("   0  : salir");
            System.out.println("------------------------------------- ");
            System.out.println(" ");
            System.out.print("elige una opcion: ");
            int x = sc.nextInt();
            switch (x) {
                case 0:
                    sw = false;
                    break;
                case 1:
                    gestionarFacultad(U);
                    break;
                case 2:
                    U.mostrar();
                    U.gestionarCarrera();
                    
                    break;
                default:
                    break;
            }
        }
    }
    
    /*boolean sw = true;
            while (sw) {
                System.out.println(" ");

                System.out.println("   1  : Listar Carreras");
                System.out.println("   2  : Agregar Carrera");
                System.out.println("   3  : Quitar Carrera");
                System.out.println("   0  : salir");

                System.out.println(" ");
                System.out.print("elige una opcion: ");
                int n = sc.nextInt();
                switch (n) {
                    case 0:
                        sw = false;
                        break;
                    case 1:
                        break;
                    case 2:

                        break;
                    default:
                        break;
                }
            }*/

    public static void main(String[] args) throws IOException {//throws IOException
        Scanner sc = new Scanner(System.in);
        Universidad U = new Universidad();
        iniciar(U);
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
