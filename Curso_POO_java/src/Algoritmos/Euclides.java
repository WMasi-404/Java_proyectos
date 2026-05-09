package Algoritmos;

import Objetos.Punto;

public class Euclides {

    public static Punto CxR(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b != 0 && a >= b){
            int c = 0;
            while(a != 0 && a >= b){
                a = a - b;
                c++;
            }
            return new Punto(c,a);
        }else{
            System.out.println("no se puede realizar la operacion");
            return new Punto();
        }
    }

    public static int coc(int a, int b){
        Punto nvo = CxR(a, b);
        return (int)nvo.getX();
    }

    public static int cocent(int a, int b){
        if(b == 0){
            System.out.println("ERROR, no se puede dividir por cero");
            return -1;
        }else{
            return a/b;
        }
    }
    public static int resent(int a, int b){
        Punto nvo = CxR(a, b);
        return (int)nvo.getY();
    }

    public static int mcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b == 0){
            return a;
        }else{
            if(a < b){
                int aux = b;
                b = a;
                a = aux;
            }
            int aux = 1;
            while(b != 0){
                aux = b;
                b = a % b;
                a = aux;
            }
            return aux;
        }
    }

    public static Punto st(int a, int b){
        int r0 = a, r1 = b;
        int s0 = 1, s1 = 0;
        int t0 = 0, t1= 1;
        Punto A;
        while(r1 != 0){
            int c = coc(r0, r1);
            int aux = r1;
            r1 = r0 -c * aux;
            r0 = aux;
            aux = s1;
            s1 = s0 - c * aux;
            s0 = aux;
            aux = t1;
            t1 = t0 - c * aux;
            t0 = aux;
        }
        A = new Punto(s0, t0);
        
        return A;
    }
    
}
