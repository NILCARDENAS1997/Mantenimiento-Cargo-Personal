package entidades;
// Generated 14/07/2019 08:13:39 PM by Hibernate Tools 4.3.1



/**
 * Cargopersonal generated by hbm2java
 */
public class Cargopersonal  implements java.io.Serializable {


     private int idcargo;
     private Personal personal;
     private String estado;
     private String descripcion;

    public Cargopersonal() {
    }

    public Cargopersonal(int idcargo, Personal personal, String estado, String descripcion) {
       this.idcargo = idcargo;
       this.personal = personal;
       this.estado = estado;
       this.descripcion = descripcion;
    }
   
    public int getIdcargo() {
        return this.idcargo;
    }
    
    public void setIdcargo(int idcargo) {
        this.idcargo = idcargo;
    }
    public Personal getPersonal() {
        return this.personal;
    }
    
    public void setPersonal(Personal personal) {
        this.personal = personal;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


