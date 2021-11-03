package Dominio;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sistema implements Serializable {

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Vendedor> listaVendedores;
    private ArrayList<Trabajo> listaTrabajos;
    private int numeroDeA;
    private int siguienteNumero;

    public void setListaClientes(Cliente unCliente) {
        this.getListaClientes().add(unCliente);
    }

    public void setListaVendedores(Vendedor unVendedor) {
        this.getListaVendedores().add(unVendedor);
    }

    public void setListaTrabajos(Trabajo unTrabajo) {
        this.getListaTrabajos().add(unTrabajo);
    }
    
    public void setNumeroDeA(int unNumero){
        numeroDeA = unNumero;
    }
    public void setSiguienteNumero(int unNumero){
        siguienteNumero = unNumero;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public ArrayList<Trabajo> getListaTrabajos() {
        return listaTrabajos;
    }
    
    public int getNumeroDeA(){
        return numeroDeA;
    }
    public int getSiguienteNumero(){
        return siguienteNumero;
    }

    public Sistema() {
        try{
            ObjectInputStream in3 = new ObjectInputStream(new FileInputStream("Sistema.ser"));
            Sistema unSistema = (Sistema) in3.readObject();
            if (!unSistema.getListaClientes().isEmpty()){    
                listaClientes = unSistema.getListaClientes();
            } else {
                listaClientes = new ArrayList<Cliente>();
            }
            if (!unSistema.getListaVendedores().isEmpty()){
                listaVendedores = unSistema.getListaVendedores();
            } else {
                listaVendedores = new ArrayList<Vendedor>();
            }
            if (!unSistema.getListaTrabajos().isEmpty()){
                listaTrabajos = unSistema.getListaTrabajos();
                this.setNumeroDeA(unSistema.getNumeroDeA());
                this.setSiguienteNumero(unSistema.getSiguienteNumero());
            } else {
                listaTrabajos = new ArrayList<Trabajo>();
                this.setNumeroDeA(1);
                this.setSiguienteNumero(1);
            }
            in3.close();
        } catch (IOException | ClassNotFoundException e){
            listaClientes = new ArrayList<Cliente>();
            listaVendedores = new ArrayList<Vendedor>();
            listaTrabajos = new ArrayList<Trabajo>();
            this.setNumeroDeA(1);
            this.setSiguienteNumero(1);
        }
    }

    public boolean cedulaRepetidaClientes(int cedula) {
        boolean si = false;
        for (int i = 0; i < this.getListaClientes().size(); i++) {
            if (cedula == this.getListaClientes().get(i).getCedula()) {
                si = true;
            }
        }
        return si;
    }

    public boolean cedulaRepetidaVendedores(int cedula) {
        boolean si = false;
        for (int i = 0; i < this.getListaVendedores().size(); i++) {
            if (cedula == this.getListaVendedores().get(i).getCedula()) {
                si = true;
            }
        }
        return si;
    }

    public Cliente[] obtenerClientes() {
        return (this.getListaClientes().toArray(new Cliente[this.getListaClientes().size()]));
    }

    public Vendedor[] obtenerVendedores() {
        return (this.getListaVendedores().toArray(new Vendedor[this.getListaVendedores().size()]));
    }

    public Trabajo[] obtenerTrabajosAsignados() {
        int cantidad = 0;
        for (int i = 0; i < this.getListaTrabajos().size(); i++) {
            if (!this.getListaTrabajos().get(i).getMaquinas().isEmpty()) {
                cantidad++;
            }
        }
        Trabajo[] t = new Trabajo[cantidad];
        int cuenta = 0;
        for (int i = 0; i < this.getListaTrabajos().size(); i++) {
            if (!this.getListaTrabajos().get(i).getMaquinas().isEmpty()) {
                t[cuenta] = this.getListaTrabajos().get(i);
                cuenta++;
            }
        }
        return t;
    }

    public Trabajo[] obtenerTrabajosSinAsignar() {
        int cantidad = 0;
        for (int i = 0; i < this.getListaTrabajos().size(); i++) {
            if (this.getListaTrabajos().get(i).getMaquinas().isEmpty()) {
                cantidad++;
            }
        }
        Trabajo[] t = new Trabajo[cantidad];
        int cuenta = 0;
        for (int i = 0; i < this.getListaTrabajos().size(); i++) {
            if (this.getListaTrabajos().get(i).getMaquinas().isEmpty()) {
                t[cuenta] = this.getListaTrabajos().get(i);
                cuenta++;
            }
        }
        return t;
    }

    public ArrayList<Cliente> ordenarPorNombreClientes() {
        Collections.sort(this.getListaClientes(), new Comparator<Cliente>() {
            public int compare(Cliente c1, Cliente c2) {
                return c1.getNombre().toLowerCase().compareTo(c2.getNombre().toLowerCase());
            }
        });
        return this.getListaClientes();
    }

    public ArrayList<Cliente> ordenarPorMontoClientes() {
        Collections.sort(this.getListaClientes(), new Comparator<Cliente>() {
            public int compare(Cliente c1, Cliente c2) {
                return c2.getMonto() - c1.getMonto();
            }
        });
        return this.getListaClientes();
    }

    public ArrayList<Vendedor> ordenarPorNombreVendedores() {
        Collections.sort(this.getListaVendedores(), new Comparator<Vendedor>() {
            public int compare(Vendedor v1, Vendedor v2) {
                return v1.getNombre().toLowerCase().compareTo(v2.getNombre().toLowerCase());
            }
        });
        return this.getListaVendedores();
    }

    public String[] leerArchivo(String unNombre) {
        String[] respuesta = new String[2];
        ArchivoLectura archivo = new ArchivoLectura(unNombre);
        int numeroLinea = 1;
        boolean primeraLinea = true;
        while (archivo.hayMasLineas()) {
            String linea = archivo.linea();
            boolean listo = false;
            int contador = 0;
            Cliente unCliente = null;
            Vendedor unVendedor = null;
            String descripcion = "";
            int costo = 0;
            boolean mal = false;
            while (!listo) {
                if (linea.contains("#")) {
                    switch (contador) {
                        case 0:
                            try {
                            int cedulaCliente = Integer.parseInt(linea.substring(0, linea.indexOf("#")));
                            unCliente = buscarClientePorCedua(cedulaCliente);
                            if (unCliente == null) {
                                mal = true;
                            }
                        } catch (NumberFormatException e) {
                            mal = true;
                        }
                        break;
                        case 1:
                            try {
                            int cedulaVendedor = Integer.parseInt(linea.substring(0, linea.indexOf("#")));
                            unVendedor = buscarVendedorPorCedua(cedulaVendedor);
                            if (unVendedor == null) {
                                mal = true;
                            }
                        } catch (NumberFormatException e) {
                            mal = true;
                        }
                        break;
                        case 2:
                            descripcion = linea.substring(0, linea.indexOf("#"));
                            break;
                        default:
                            break;
                    }
                    linea = linea.substring(linea.indexOf("#") + 1);
                    contador++;
                } else {
                    try {
                        costo = Integer.parseInt(linea.substring(0));
                    } catch (NumberFormatException e) {
                        mal = true;
                    }
                    listo = true;
                }
            }
            if (!mal) {
                Trabajo t = new Trabajo(unCliente, unVendedor, descripcion, costo, this.getSiguienteNumero());
                this.setSiguienteNumero(this.getSiguienteNumero()+this.getNumeroDeA());
                setListaTrabajos(t);
                unCliente.setMonto(costo);
                if (primeraLinea) {
                    respuesta[0] = "" + t.getNumero();
                    primeraLinea = false;
                }
                respuesta[1] = "" + t.getNumero();
            }
            numeroLinea++;
        }
        return respuesta;
    }

    public Cliente buscarClientePorCedua(int cedula) {
        Cliente c = null;
        for (int i = 0; i < this.getListaClientes().size(); i++) {
            if (this.getListaClientes().get(i).getCedula() == cedula) {
                c = this.getListaClientes().get(i);
            }
        }
        return c;
    }

    public Vendedor buscarVendedorPorCedua(int cedula) {
        Vendedor v = null;
        for (int i = 0; i < this.getListaVendedores().size(); i++) {
            if (this.getListaVendedores().get(i).getCedula() == cedula) {
                v = this.getListaVendedores().get(i);
            }
        }
        return v;
    }

    public void desasignar(Trabajo t) {
        t.getMaquinas().clear();
        t.setFecha("");
    }

    public void guardarDatos() {
        try {
            FileOutputStream ff = new FileOutputStream("Sistema.ser");
            BufferedOutputStream b = new BufferedOutputStream(ff);
            ObjectOutputStream so = new ObjectOutputStream(b);
            so.writeObject(this);
            so.close();
        } catch (IOException e) {
            System.out.println("Error de serializacion");
        }
    }
}
