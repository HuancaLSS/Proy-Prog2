package OfertaAcademica;

import java.util.Scanner;

public abstract class Modalidad {

    private String tipoModalidad;

    public Modalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }
    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public abstract void mostrar();

    public abstract boolean validar();

    public static Modalidad crearModalidad(Scanner sc) {
        System.out.println("-- Tipo de Modalidad --s");
        System.out.println("1. Curso Prefacultativo");
        System.out.println("2. PSA (Prueba de Suficiencia Académica)");
        System.out.print("Seleccione una opcion: ");
        int opc = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Ingrese una descripcion corta para esta modalidad: ");
        String descripcion = sc.nextLine();

        if (opc == 1) {
            System.out.print("Nivel de clases (ej: A, B): ");
            String nivel = sc.nextLine();
            System.out.print("Carga horaria semanal: ");
            int cargaH = sc.nextInt();
            return new Prefacultativo(descripcion, nivel, cargaH);
        } else if (opc == 2) {
            System.out.print("Numero de preguntas del examen: ");
            int nroP = sc.nextInt();
            return new Psa(descripcion, nroP);
        } else {
            return null; 
        }
    }
}
