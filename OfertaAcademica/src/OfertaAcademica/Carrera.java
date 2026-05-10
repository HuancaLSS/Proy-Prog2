
package OfertaAcademica;


public class Carrera {
    private String nombre,direccion,pagWeb,telefono;
    private int nro,nroSem;
    
    public Carrera(int n,String nom,String dir,String pag,String tel,int nroS){
        nro =n;
        nombre = nom;
        direccion = dir;
        pagWeb = pag;
        telefono = tel;
        nroSem = nroS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPagWeb() {
        return pagWeb;
    }

    public void setPagWeb(String pagWeb) {
        this.pagWeb = pagWeb;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getNroSem() {
        return nroSem;
    }

    public void setNroSem(int nroSem) {
        this.nroSem = nroSem;
    }
    
    public void mostrar(){
        System.out.println(nro+" "+nombre+" "+direccion+" "+pagWeb+" "+telefono+" "+nroSem);
    }
}
