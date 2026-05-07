package parte2;

import java.util.Scanner;
public class Convocatoria {

    private String nro, semestre, tipo, fechaIni, fechaFin, modalidad;
    private double costo;

    public Convocatoria() {
        this.nro = "";
        this.semestre = "";
        this.tipo = "";
        this.costo = 0.0;
        this.fechaIni = "";
        this.fechaFin = "";
        this.modalidad = "";
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Datos Convocatoria:");
        nro = sc.next();
        semestre = sc.next();
        tipo = sc.next();
        costo = sc.nextDouble();
        fechaIni = sc.next();
        fechaFin = sc.next();
        modalidad = sc.next();
    }

    public void mostrar() {
        System.out.println(nro + " " + semestre + " " + tipo + " " + costo + " " + fechaIni + " " + fechaFin + " " + modalidad);
    }

    public double getCosto() {
        return costo;
    }
    public void mostrarCosto() {
    System.out.println(costo);
}
}
