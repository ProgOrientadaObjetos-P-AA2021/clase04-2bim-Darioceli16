/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smart
 */
public class MenuCarta extends Menu {

    protected double valorInicialMen;
    protected double Guarnicion;
    protected double valorBe;
    protected double porcentajeA;

    public MenuCarta(String nomPla, double valIniMenu, double valGuar,
            double valBebida, double valAdic) {
        super(nomPla);
        valorInicialMen = valIniMenu;
        Guarnicion = valGuar;
        valorBe = valBebida;
        porcentajeA = valAdic;
    }

    @Override
    public void establecerValorMenu() {
        valorMenu = valorInicialMen + Guarnicion + valorBe
                + (valorInicialMen * porcentajeA / 100);
    }

    public void establecerValorInicialMen(double valIniMenu) {
        valorInicialMen = valIniMenu;
    }

    public void establecerGuarnicion(double valGuar) {
        Guarnicion = valGuar;
    }

    public void establecerValorBe(double valBebida) {
        valorBe = valBebida;
    }

    public void establecerPorcentajeA(double valAdic) {
        porcentajeA = valAdic;
    }

    public double obtenerValorInicialMen() {
        return valorInicialMen;
    }

    public double obtenerGuarnicion() {
        return Guarnicion;
    }

    public double obtenerValorBe() {
        return valorBe;
    }

    public double obtenerPorcentajeA() {
        return porcentajeA;
    }

    @Override
    public String toString() {
        String cadena = String.format("\n**MENÚ A LA CARTA**"
                + "\n-------------------\n"
                + "Nombre del plato: %s\n"
                + "Valor inicial: $ %.2f\n"
                + "Valor de bebida: $ %.2f\n"
                + "Valor de porcion de guarnición: $ %.2f\n"
                + "Porcentaje adicional: %.2f%s ($ %.2f)\n"
                + "Valor del menú: $ %.2f",
                obtenerPlato(), obtenerValorInicialMen(), obtenerValorBe(),
                obtenerGuarnicion(), obtenerPorcentajeA(), "%",
                (obtenerValorInicialMen() * obtenerPorcentajeA() / 100),
                obtenerValorMenu());
        return cadena;
    }
}
