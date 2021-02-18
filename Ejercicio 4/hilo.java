/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread0;

public class hilo extends Thread {
    
    public hilo(String nombre) {
        super(nombre);
    }
    
    @Override
    public void run(){
        for (int i=1; i<5; i++) {
            System.out.println(getName()+": "+i);
            try {
                sleep(100);
            } catch(InterruptedException ex) {}
        } 
        System.out.println("La prioridad del " + getName() +"es: " + getPriority());

    }
        
    public static void main(String[] args) {
        int prioridad;
        
        hilo hilo1=new hilo("HOLA LUNA!!...");
        hilo hilo2=new hilo("HOLA SOL!!!...");
        
        hilo1.setPriority(hilo1.MAX_PRIORITY);
        hilo2.setPriority(hilo2.MIN_PRIORITY);
        
        hilo1.start();
        hilo2.start();
        

    }
}