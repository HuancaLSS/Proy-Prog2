package OfertaAcademica;

public class AdmisionFacultativa {

    private String telefono;
    private String direccion;
    private String correo;
    private Convocatoria[] convocatorias;
    private int nroConvocatorias;

    public AdmisionFacultativa(String telefono, String direccion, String correo) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        convocatorias = new Convocatoria[50];
        nroConvocatorias = 0;
    }

    public void agregarConvocatoria(Convocatoria c) {
        if (nroConvocatorias < convocatorias.length) {
            convocatorias[nroConvocatorias] = c;
            nroConvocatorias++;
        } else {
            System.out.println("no entra mas convocatorias ");
        }
    }

    public void leer() {
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
        System.out.println("Correo: " + correo);
    }

    public void mostrar() {
        System.out.println("ADMISION FACULTATIVA");
        System.out.println("Telefono: " + telefono);
        System.out.println("Direccion: " + direccion);
        System.out.println("Correo: " + correo);

        System.out.println("Convocatorias registradas:");
        for (int i = 0; i < nroConvocatorias; i++) {
            convocatorias[i].mostrar();
        }
    }

    public void anunciar() {
        System.out.println("Se publicaron nuevas convocatorias.");
    }
}
