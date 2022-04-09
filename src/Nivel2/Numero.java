package Nivel2;

import java.util.PriorityQueue;

public class Numero {

    public static void main(String[] args) {

        //Generamos numeros random entre el 0 y  el 100

        int numero = numeroRandom();
        int numero2 = numeroRandom();
        int numero3 = numeroRandom();
        int numero4 = numeroRandom();
        int numero5 = numeroRandom();
        int numero6 = numeroRandom();
        int numero7 = numeroRandom();

        //Construimos una cola PriorityQueue con los números que hemos generado

        PriorityQueue<Integer> cola = new PriorityQueue<>();
        cola.add(numero);
        cola.add(numero2);
        cola.add(numero3);
        cola.add(numero4);
        cola.add(numero5);
        cola.add(numero6);
        cola.add(numero7);

        System.out.println("La cola PriorityQueue generada es: : " + cola);
        System.out.println("El primer elemento de la cola es:" + cola.poll());
        System.out.println("El resultado aplicando 'pull' de la cola es: " + cola);



    }

    // Método que saca un número aleatorio del 0 al 100
    public static int numeroRandom(){
        int numeroRandom = (int)(Math.random()*100+1);
        return numeroRandom;
    }

}
