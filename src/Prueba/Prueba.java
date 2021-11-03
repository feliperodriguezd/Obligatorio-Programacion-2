package Prueba;

import Dominio.*;
import Interfaz.*;

public class Prueba {
    public static void main(String[] args){
        Sistema s = new Sistema();
        VentanaMenu v = new VentanaMenu(s);
        v.setVisible(true);
    }
}
