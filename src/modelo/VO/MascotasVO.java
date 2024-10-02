package modelo.VO;

import java.util.Date;

public class MascotasVO {
    private int id;
    private int idPersonass;
    private String nombre;
    private String sexo;
    private String raza;
    private Date nacimiento;

    public MascotasVO (int id, int idPersonass, String nombre, String sexo, String raza, Date nacimiento){
        this.id = id;
        this.idPersonass = idPersonass;
        this.nombre = nombre;
        this.sexo = sexo;
        this.raza = raza;
        this.nacimiento = nacimiento;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getIdPersonass(){
        return idPersonass;
    }
    public void setIdPersonass(int idPersonass){
        this.idPersonass = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public Date getNacimiento(){
        return nacimiento;
    }
    public void setNacimiento(Date nacimiento){
        this.nacimiento = nacimiento;
    }
}
