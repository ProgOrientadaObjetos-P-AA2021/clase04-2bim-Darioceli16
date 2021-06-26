/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smart
 */
public class MenuDia extends Menu {

    protected double valorInicialMe;
    protected double valorPo;
    protected double valorB;

    public MenuDia(String nomPla, double valIniMenu, double valPostre,
            double valBebida) {
        super(nomPla);
        valorInicialMe = valIniMenu;
        valorPo= valPostre;
        valorB = valBebida;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMe + valorPo + valorB;
    }

    public void establecerValorInicialMe(double valIniMenu) {
        valorInicialMe = valIniMenu;
    }

    public void establecerValorPo(double valPostre) {
        valorPo = valPostre;
    }

    public void establecerValorB(double valBebida) {
        valorB = valBebida;
    }

    public double obtenerValorInicialMe() {
        return valorInicialMe;
    }

    public double obtenerValorPo() {
        return valorPo;
    }

    public double obtenerValorB() {
        return valorB;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ DEL DIA**\n----------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Valor del postre: $ %.2f\n"
                + "Valor de bebida: $ %.2f\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicialMe(), obtenerValorPo(),
                obtenerValorB(), obtenerValorMenu());

        return cadena;
    }
}

