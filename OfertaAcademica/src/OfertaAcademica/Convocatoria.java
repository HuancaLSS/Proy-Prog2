package OfertaAcademica;

public class Convocatoria {

    private String nro;
    private String semestre;
    private String tipo;
    private double costo;
    private String fechaInicio;
    private String fechaFin;
    private String modalidad;
    private Carrera carrera;

    public Convocatoria(String nro, String semestre, String tipo,double costo, String fechaInicio,String fechaFin, String modalidad,Carrera carrera) {
        this.nro = nro;
        this.semestre = semestre;
        this.tipo = tipo;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.modalidad = modalidad;
        this.carrera = carrera;
    }

    public void leer() {
        System.out.println("Nro: " + nro);
        System.out.println("Semestre: " + semestre);
        System.out.println("Tipo: " + tipo);
    }

    public void mostrar() {
        System.out.println("CONVOCATORIA");
        System.out.println("Nro: " + nro);
        System.out.println("Semestre: " + semestre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: " + costo);
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);
        System.out.println("Modalidad: " + modalidad);

        if (carrera != null) {
            System.out.println("Carrera asociada:");
            carrera.mostrar();
        }
    }

    public void calcularDias() {
        System.out.println("calculo de días.");
    }

    public void mostrarCosto() {
        System.out.println("Costo de convocatoria: " + costo);
    }
}
