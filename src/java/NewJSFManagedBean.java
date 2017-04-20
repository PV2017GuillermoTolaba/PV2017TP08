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
    public String esonoprimo(){
        String resultado;
        int count = 0;
        int i = 1;
        while(true)
        {
            if(primono < 0 || i > primono) break;
            if(primono %i == 0) count++;
            i++;
        }
        if(count > 2) resultado = "No primo";
        else resultado = "Primo";
        return resultado;
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
}
