package Dominio;

import java.io.Serializable;

public class Vendedor implements Serializable{
    private String nombre;
    private String direccion;
    private int cedula;
    private String año;
    private String celular;
    
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public void setDireccion(String unaDireccion){
        direccion=unaDireccion;
    }
    public void setCedula(int unCedula){
        cedula=unCedula;
    }
    public void setAño(String unAño){
        año=unAño;
    }
    public void setCelular(String unCelular){
        celular=unCelular;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public int getCedula(){
        return cedula;
    }
    public String getAño(){
        return año;
    }
    public String getCelular(){
        return celular;
    }
    
    public Vendedor(String unNombre, String unaDireccion, int unaCedula, String unAño, String unCelular){
        this.setNombre(unNombre);
        this.setDireccion(unaDireccion);
        this.setCedula(unaCedula);
        this.setAño(unAño);
        this.setCelular(unCelular);
    }
    @Override
    public String toString(){
        return this.getNombre() + " (" + this.getCedula() + ")";
    }
}
