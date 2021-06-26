/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smart
 */
public abstract class Menu {

    protected String nombreP;
    protected double valorMenu;

    public Menu(String nomPla) {
        nombreP = nomPla;
    }

    public void establecerP(String plat) {
        nombreP = plat;
    }

    public abstract void establecerValorMenu();

    public String obtenerPlato() {
        return nombreP;
    }

    public double obtenerValorMenu() {
        return valorMenu;
    }
}

