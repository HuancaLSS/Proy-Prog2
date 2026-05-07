package parte2;

import java.util.Scanner;

public class AdmisionFacultativa {
    private String telefono, direccion, correo;
    private Convocatoria C; // Relación 1 a 1

    public AdmisionFacultativa() {
        this.telefono = "70000000";
        this.direccion = "Av. Villazon";
        this.correo = "admision@umsa.bo";
        this.C = new Convocatoria();
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Datos Admision (tel, dir, mail):");
        telefono = sc.next();
        direccion = sc.next();
        correo = sc.next();
        C.leer(); // pa leer la convocatoria
    }

    public void mostrar() {
        System.out.println(telefono + " " + direccion + " " + correo);
        C.mostrar();
    }
    
    public void anunciar() {
        System.out.print("Nueva Convocatoria en: " + direccion + " costo: ");
        C.mostrarCosto(); // Aquí ya no debería darte error
}
}