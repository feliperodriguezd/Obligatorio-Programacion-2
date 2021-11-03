package Dominio;

import java.io.Serializable;

public class Cliente implements Serializable{
    private String nombre;
    private String direccion;
    private String codigoPostal;
    private String departamento;
    private int cedula;
    private int monto;
    
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public void setDireccion(String unaDireccion){
        direccion=unaDireccion;
    }
    public void setCodigoPostal(String unCodigoPostal){
        codigoPostal=unCodigoPostal;
    }
    public void setDepartamento(String unDepartamento){
        departamento=unDepartamento;
    }
    public void setCedula(int unCedula){
        cedula=unCedula;
    }
    public void setMonto(int unMonto){
        monto = this.getMonto()+unMonto;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getCodigoPostal(){
        return codigoPostal;
    }
    public String getDepartamento(){
        return departamento;
    }
    public int getCedula(){
        return cedula;
    }
    public int getMonto(){
        return monto;
    }
    public Cliente(String unNombre, String unaDireccion, String unCodigoPostal, String unDepartamento, int unaCedula){
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setCodigoPostal(unCodigoPostal);
        this.setDepartamento(unDepartamento);
        this.setCedula(unaCedula);
        this.setMonto(0);
    }
    @Override
    public String toString(){
        return this.getNombre() + " (" + this.getCedula() + ")";
    }
    public int compareTo(Cliente unCliente){
        return unCliente.getMonto() - this.getMonto();
    }
}
