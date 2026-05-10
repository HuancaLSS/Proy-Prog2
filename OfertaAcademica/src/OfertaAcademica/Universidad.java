
package OfertaAcademica;
//para leer archivos CSV

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Universidad {

    private String nombre;
    private int nroFacultades;
    private Facultad[] facultades;
    Scanner sc = new Scanner(System.in);

    public Universidad() {
        nombre = "Universidad mayor de San Andres";
        nroFacultades = 13;
        facultades = new Facultad[20];

        
        facultades[0] = new Facultad(1,"Facultad de Agronomia", "Av. Saavedra");
        facultades[1] = new Facultad(2, "Facultad de Arquitectura", "Calle Potosi ");
        facultades[2] = new Facultad(3, "Facultad de Ciencias Economicas y Financieras", "Av. 6 de Agosto");
        facultades[3] = new Facultad(4, "Facultad de Ciencias Farmaceuticas y Bioquimicas", "Calle Landaeta");
        facultades[4] = new Facultad(5, "Facultad de Ciencias Geologicas", "Calle 27 de Cota Cota");
        facultades[5] = new Facultad(6, "Facultad de Ciencias Puras y Naturales", "Calle 27 de Cota Cota");
        facultades[6] = new Facultad(7, "Facultad de Ciencias Sociales", "Av. 6 de Agosto");
        facultades[7] = new Facultad(8, "Facultad de Derecho y Ciencias Politicas", "Av. 6 de Agosto");
        facultades[8] = new Facultad(9, "Facultad de Humanidades y Ciencias de la Educacion", "Calle Potosi");
        facultades[9] = new Facultad(10, "Facultad de Ingenieria", "Calle 27 de Cota Cota");
        facultades[10] = new Facultad(11, "Facultad de Medicina, Enfermeria, Nutricion y Tecnologia Medica", "Av. Saavedra");
        facultades[11] = new Facultad(12, "Facultad de Odontologia", "Av. Saavedra");
        facultades[12] = new Facultad(13, "Facultad de Tecnologia", "Av. Villazon");
    
        
        
        for (int j = nroFacultades; j < 20; j++) {
            facultades[j] = new Facultad(0, "", "");
        }
    }

    public void mostrar() {
        System.out.println(nombre);
        if (nroFacultades != 0) {
            for (int i = 0; i < nroFacultades; i++) {
                facultades[i].mostrar();
            }
        }
    }

    public void agregarFacultad() {

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese la direccion: ");
        String dir = sc.next();
        facultades[nroFacultades] = new Facultad(nroFacultades + 1, nombre, dir);
        //facultades[nroFacultades] = new Facultad(nroFacultades + 1, nombre, dir, 3);
        nroFacultades++;
    }

    public void quitarFacultad() {
        System.out.print("Seleccione la Facultad (NRO): ");
        int n = sc.nextInt();
        if (n > 0 && n <= nroFacultades) {
            for (int i = 0; i < nroFacultades; i++) {
                if (facultades[i].getNro() == n) {
                    for (int j = i; j < nroFacultades; j++) {
                        facultades[j] = facultades[j + 1];
                    }
                    nroFacultades--;
                }
            }
        } else {
            System.out.println("El numero no es valido!");
        }

    }

    public void gestionarCarrera() {
        System.out.println(" ");
        System.out.print(" Seleccione la facultad: ");
        int x = sc.nextInt()-1;
        if (x <= nroFacultades && x >= 0) {
            System.out.println("");
            System.out.println(facultades[x].getNombre());
            
            boolean sw = true;
            while (sw) {
                System.out.println(" ");

                System.out.println("   1  : Listar Carreras");
                System.out.println("   2  : Agregar Carrera");
                System.out.println("   3  : Quitar Carrera");
                System.out.println("   0  : volver");

                System.out.println(" ");
                System.out.print("elige una opcion: ");
                int n = sc.nextInt();
                switch (n) {
                    case 0:
                        sw = false;
                        break;
                    case 1:
                        facultades[x].mostrarCarreras();
                        break;
                    case 2:
                        facultades[x].agregarCarrera();
                        break;
                    case 3:
                        facultades[x].mostrarCarreras();
                        facultades[x].quitarCarrera();
                        break;
                    default:
                        break;
                }
            }
        }
        else
            System.out.println("Numero incorrecto!");
    }
}
