/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smart
 */
public class MenuEconomico extends Menu {

    protected double valorInicialM;
    protected double porcentajeD;

    public MenuEconomico(String nomPla, double valIniMenu, double valDesc) {
        super(nomPla);
        valorInicialM = valIniMenu;
        porcentajeD = valDesc;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialM
                - (valorInicialM * porcentajeD / 100);
    }

    public void establecerValorInicialM(double valIniMenu) {
        valorInicialM = valIniMenu;
    }

    public void establecerPorcentajeD(double valDesc) {
        porcentajeD = valDesc;
    }

    public double obtenerValorInicialM() {
        return valorInicialM;
    }

    public double obtenerPorcentajeD() {
        return porcentajeD;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ ECONÓMICO**\n"
                + "------------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Porcentaje del descuento: %.2f%s ($ %.2f)\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicialM(),
                obtenerPorcentajeD(), "%",
                (obtenerValorInicialM() * obtenerPorcentajeD() / 100),
                obtenerValorMenu());

        return cadena;
    }
}