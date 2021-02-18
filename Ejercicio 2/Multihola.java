package multihola;

import static java.lang.Thread.sleep;

//Se crea una clase que extiende de Thread, en la cual se indican los parámetros del hilo
class TestTh extends Thread {
    
    //Parámetros del hilo
    private String nombre;
    private int retardo;
    
    //Constructor del hilo
    public TestTh( String s,int d ) {
        nombre = s;
        retardo = d;
    }
    
    //Indicamos la actividad que va a realizar el hilo durante su ejecución
    public void run() {
        try {
            //Ponemos al hilo en espera el tiempo de ejecución que le pasemos como parámetro (variable retardo)
            sleep(retardo);
        } catch( InterruptedException e ) {}
        //Imprimimos por pantalla el número de hilo y el tiempo de retardo
        System.out.println( "Hola Mundo! "+nombre+" "+retardo );
    }
}

public class Multihola {

    public static void main( String args[] ) {
        //Declaramos tres clases de TestTh. Cada clase representa un hilo nuevo.
        TestTh t1,t2,t3;
        
        //Inicializamos las clases y en el constructor le pasamos el nombre y el tiempo de espera
        t1 = new TestTh( "Thread 1",(int)(Math.random()*2000) );
        t2 = new TestTh( "Thread 2",(int)(Math.random()*2000) );
        t3 = new TestTh( "Thread 3",(int)(Math.random()*2000) );
        
        //Ejecutamos los hilos
        t1.start();
        t2.start();
        t3.start();
    }
}