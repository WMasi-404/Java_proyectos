package Algoritmos;

import Objetos.Punto;
public class Recursivos {

    public static int cocR(int a, int b){
        if(b == 0 ){
            System.out.println("No se pueede dividir por cero");
            return 0;
        }else{
            if(a >= b){
                return 1 + cocR(a-b, b);
            }else{
                return 0;
            }
        }
    }

    public static int resR(int a, int b){
        if(b == 0){
            System.out.println("ERROR: division por cero");
            return -1;
        }else{
            if(a >= b){
                return resR(a-b, b);
            }else{
                return a;
            }
        }
    }

    public static int mcdR(int a, int b){
        if(b == 0){
            return a;
        }else{
            return mcdR(b, a % b);
        }
    }

    public static Punto stR(int a, int b){
        if(b == 0){
            return new Punto(a/Math.abs(a), 0);
        }
        int c = a / b;
        int r = a % b;
        Punto aux = stR(b, r);
        int s = (int)aux.getY();
        int t = (int)aux.getX() - (int)aux.getY() * c;

        return new Punto(s, t);
    }

}

