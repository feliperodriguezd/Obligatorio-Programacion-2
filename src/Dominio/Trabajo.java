package Dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Formatter;

public class Trabajo implements Serializable{
    private Cliente cliente;
    private Vendedor vendedor;
    private String descripcion;
    private int costo;
    private int numero;
    private String fecha;
    private ArrayList<String> maquinas;
    
    public void setCliente(Cliente unCliente){
        cliente = unCliente;
    }
    public void setVendedor(Vendedor unUendedor){
        vendedor = unUendedor;
    }
    public void setDescripcion(String unaDescripcion){
        descripcion = unaDescripcion;
    }
    public void setCosto(int uncosto){
        costo = uncosto;
    }
    public void setNumero(int unNumero){
        numero = unNumero;
    }
    public void setFecha(String unaFecha){
        fecha = unaFecha;
    }
    public void setMaquina(String unaMaquina){
        this.getMaquinas().add(unaMaquina);
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Vendedor getVendedor(){
        return vendedor;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getCosto(){
        return costo;
    }
    public int getNumero(){
        return numero;
    }
    public String getDia(){
        return fecha;
    }
    public ArrayList<String> getMaquinas(){
        return maquinas;
    }
    
    public Trabajo(Cliente unCliente, Vendedor unVendedor, String unaDescripcion, int unCosto, int unNumero){
        this.setCliente(unCliente);
        this.setVendedor(unVendedor);
        this.setDescripcion(unaDescripcion);
        this.setCosto(unCosto);
        this.setNumero(unNumero);
        maquinas = new ArrayList<String>();
    }
    public void guardarEnTxt(){
        try{
            ArrayList <String> lineas = new ArrayList<String>();
            ArchivoLectura recuperar = new ArchivoLectura("Desasignados.txt");
            while (recuperar.hayMasLineas()){
                lineas.add(recuperar.linea());
            }
            ArchivoGrabacion guardar = new ArchivoGrabacion ("Desasignados.txt");
            for (int i = 0; i<lineas.size();i++){
                guardar.grabarLinea(lineas.get(i));
            }
            guardar.grabarLinea(this.getNumero() + " " + this.getDia());
            guardar.cerrar();
        } catch (Exception e){
            System.out.println("Error en el archivo");
        }
    }
    @Override
    public String toString(){
        return this.getNumero() + " " + this.getCliente().getNombre();
    }
}
