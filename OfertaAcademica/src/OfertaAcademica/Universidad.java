package OfertaAcademica;
//para leer archivos CSV
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Universidad {
    private String nombre;
    private int nroFacultades;
    private Facultad[] facultades;
    
    public Universidad() throws IOException{
        nombre = "Universidad mayor de San Andres";
        nroFacultades = 13;
        facultades = new Facultad[20];
        
        //aqui se lle lo del CSV
        BufferedReader br;
        String linea;
        int i = 0;
        boolean primera = true;

        br = new BufferedReader(new FileReader("FacultadesUmsa.csv"));
        while ((linea = br.readLine()) != null) {
            if (primera) { primera = false; continue; }
            
            //vector de datos para ir llenando
            String[] datos = linea.split(",");
            
            int nro = Integer.parseInt(datos[0].trim());
            String nombreFac = datos[1].trim();
            int nroCarreras = Integer.parseInt(datos[2].trim());
            String direccion = datos[3].replace("\"", "").trim();
            //String telefono = datos[4];

            facultades[i] = new Facultad(nro, nombreFac, direccion, nroCarreras);
            i++;
        }
        for (int j = nroFacultades; j < 20; j++) {
            facultades[j] = new Facultad(0,"","",0);
        }
    }
    
    public void mostrar(){
        System.out.println(nombre);
        if (nroFacultades!=0) {
            for (int i = 0; i < nroFacultades; i++) {
                facultades[i].mostrar();
            }
        }
    }
}
