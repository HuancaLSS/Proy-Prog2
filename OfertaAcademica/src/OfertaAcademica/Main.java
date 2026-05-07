
package OfertaAcademica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Crear e instanciar
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
    }
}