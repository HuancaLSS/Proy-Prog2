package OfertaAcademica;

public class Prefacultativo extends Modalidad {

    private String nivelClases;
    private int cargaHoraria;

    public Prefacultativo(String tipoModalidad, String nivelClases, int cargaHoraria) {
        super(tipoModalidad); 
        this.nivelClases = nivelClases;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void mostrar() {
        System.out.println("Modalidad: Prefacultativo - " + getTipoModalidad());
        System.out.println("Nivel: " + nivelClases);
        System.out.println("Carga Horaria: " + cargaHoraria + " horas/semana");
    }

    @Override
    public boolean validar() {// es marcar la asistencia 
        System.out.println("Validando Prefacultativo");
        return true;
    }
}