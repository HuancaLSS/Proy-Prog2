package OfertaAcademica;

public class Psa extends Modalidad {

    private int nroPreguntas;

    public Psa(String tipoModalidad, int nroPreguntas) {
        super(tipoModalidad); 
        this.nroPreguntas = nroPreguntas;
    }

    @Override
    public void mostrar() {
        System.out.println("Modalidad: PSA (Examen) - " + getTipoModalidad());
        System.out.println("Numero de preguntas: " + nroPreguntas);
    }

    @Override
    public boolean validar() {
        System.out.println("Validando PSA");
        return true;
    }
}