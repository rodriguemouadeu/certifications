package com.rodriguemouadeu.javacert.dzone;

public class Quizz22 {
    int x;
    int[] arrayInt = {4,3,0 };
    int methodA(int i, int i2){
        int i3 = i + i2 - 1;
        return(i3 - (2 * i) / x - x / 2);
    }
    int methodB(){
        for(int i:arrayInt) {
            switch(i) {
                case 3:
                    x ++ ;
                case 5:
                    x += 2;
                    break;
                default:
                    x += 3;
                case 0:
                    x += 4;
                case 1:
                    x += 5;
            }
        }
        return x / 2;
    }
    public static void main(String[] args){
        Quizz22 mc = new Quizz22();
        System.out.println("result: " + mc.methodA(mc.methodB(),2));
    }
}
