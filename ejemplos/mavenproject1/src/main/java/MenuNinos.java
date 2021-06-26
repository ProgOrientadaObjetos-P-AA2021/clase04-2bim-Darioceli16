/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smart
 */
public class MenuNinos extends Menu {

    protected double valorInicial;
    protected double valorH;
    protected double valorP;

    public MenuNinos(String nomPla, double valIniMenu, double valHelado,
            double valPastel) {
        super(nomPla);
        valorInicial = valIniMenu;
        valorH = valHelado;
        valorP = valPastel;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicial + valorH + valorP;
    }

    public void establecerValorInicial(double valIniMenu) {
        valorInicial = valIniMenu;
    }

    public void establecerValorH(double valHelado) {
        valorH= valHelado;
    }

    public void establecerValorP(double valPastel) {
        valorP = valPastel;
    }

    public double obtenerValorInicial() {
        return valorInicial;
    }

    public double obtenerValorH() {
        return valorH;
    }

    public double obtenerValorP() {
        return valorP;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ DE NIÑOS**\n-----------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Valor del helado: $ %.2f\n"
                + "Valor del pastel: $ %.2f\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicial(), obtenerValorH(),
                obtenerValorP(), obtenerValorMenu());
        return cadena;
    }
}
