/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author WallHero
 */
@ManagedBean
@SessionScoped
public class NewJSFManagedBean {
    private long x = 0, y = 0, b = 0, h = 0;
    private Puntos E = new Puntos(), F = new Puntos();
    private double xe, ye, xf, yf, primono;
    private int n1, n2;
    private int primos = 0, pares = 0, impares = 0;
    Rectangulo rect = new Rectangulo();
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }

    public NewJSFManagedBean(long x, long y, long b, long h) {
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h;
    }
    public double obtenerDistanciaPuntos(){
        return (Math.sqrt(((xf - xe)*(xf - xe)) +(yf - ye)*(yf - ye)));
    }
    public void revisarpinp(){
        int i = n1;
        setPrimos(0);
        setImpares(0);
        setPares(0);
        while(true)
        {
            if(n1 <= 0 || i > n2) break;
            int pibote = 1;
            int count = 0;
            while(true) // Comprueba primos
            {
                if(i < 0 || pibote > i || count > 2) break;
                if(i % pibote == 0) count++;
                pibote++;
            }
            if(count <= 2 && count != 1) setPrimos(getPrimos() + 1);
            if(i % 2 != 0) setImpares(getImpares() + 1);
            else setPares(getPares() + 1);
            i++;
        }  
    }
    public void mainScript()
    {
        crearRectangulo(x, y, b, h);
    }
    public void crearRectangulo(long a, long b, long base, long altura){
        rect.crearPuntos(a, b, base, altura);
    }
    public long obtenerPuntoX(int opcion){
        switch(opcion){
            case 0: return rect.obtenerPX();
            case 1: return rect.obtenerPXC();
            case 2: return rect.obtenerPXD();
        }        
        return 0;
    }   
    public long obtenerPuntoY(int opcion){
        switch(opcion){
            case 0: return rect.obtenerPY();
            case 1: return rect.obtenerPYC();
            case 2: return rect.obtenerPYD();
        }        
        return 0;       
    }
    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getB() {
        return b;
    }
    public void setB(long b) {
        this.b = b;
    }
    public long getH() {
        return h;
    }

    public void setH(long h) {
        this.h = h;
    }


    public double getXe() {
        return xe;
    }

    public void setXe(double xe) {
        this.xe = xe;
    }

    public double getYe() {
        return ye;
    }

    public void setYe(double ye) {
        this.ye = ye;
    }


    public double getXf() {
        return xf;
    }

    public void setXf(double xf) {
        this.xf = xf;
    }

    public double getYf() {
        return yf;
    }

    public void setYf(double yf) {
        this.yf = yf;
    }


    public double getPrimono() {
        return primono;
    }

    public void setPrimono(double primono) {
        this.primono = primono;
    }

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /**
     * @return the primos
     */
    public int getPrimos() {
        return primos;
    }

    /**
     * @param primos the primos to set
     */
    public void setPrimos(int primos) {
        this.primos = primos;
    }

    /**
     * @return the pares
     */
    public int getPares() {
        return pares;
    }

    /**
     * @param pares the pares to set
     */
    public void setPares(int pares) {
        this.pares = pares;
    }

    /**
     * @return the impares
     */
    public int getImpares() {
        return impares;
    }

    /**
     * @param impares the impares to set
     */
    public void setImpares(int impares) {
        this.impares = impares;
    }
}
