/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WallHero
 */
public class Rectangulo {
    public Puntos A = new Puntos(),B = new Puntos(),C = new Puntos(),D = new Puntos();
    public Rectangulo() {
    }

    public long obtenerPX(){
       return B.getX();
    }
    public long obtenerPY(){
       return B.getY();
    }
    public long obtenerPXC(){
       return C.getX();
    }
    public long obtenerPYC(){
       return C.getY();
    }
    public long obtenerPXD(){
       return D.getX();
    }
    public long obtenerPYD(){
       return D.getY();
    }
    public void crearPuntos(long a, long b, long base, long altura){
        A.crearPunto(a, b);
        B.crearPunto(a+base, b);
        C.crearPunto(a+base, b+altura);
        D.crearPunto(a, b+altura);
    }
}
