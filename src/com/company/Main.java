package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner triangulo = new Scanner(System.in);

        double altura, base,area,f;
        int contador,x;

        contador=0;

        System.out.println("Cantidad de triangulos : ");
        x= triangulo.nextInt();

        for(f=1;f<=x;f++){
            System.out.println("Base del triangulo: ");
            base= triangulo.nextDouble();
            System.out.println("Altura del triangulo: ");
            altura=triangulo.nextDouble();
            area= (base*altura)/2;
            System.out.println("Area del triangulo: "+area);

            if(area<=12){

                contador=contador+1;

            }

        }
        System.out.println("cantidad de triangulos mayores con un are de 12: "+ contador);






    }
}
