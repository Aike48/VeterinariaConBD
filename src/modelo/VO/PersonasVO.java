package modelo.VO;
import java.util.Date;

public class PersonassVO {
    private int id;
    private String nombre;
    private int documento;
    private int telefono;

    public PersonassVO (int id, String nombre, int documento, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getDocuemnto(){
        return documento;
    }
    public void setDocumento(int documento){
        this.documento = documento;
    }

    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}
