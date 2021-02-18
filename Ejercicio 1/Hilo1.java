public class Hilo1 extends Thread{
 private String nombre;
 public Hilo1(String nombre)
 {
 this.nombre=nombre;
 }
 public void run(){
 try{
 int x=(int)(Math.random()*5000);
 Thread.sleep(x);
 System.out.println("Soy "+nombre+ " ("+x+")");
 }
 catch (Exception ex){ }
 }
 public static void main(String[] args) {
 Hilo1 t1 = new Hilo1("Vicente");
 Hilo1 t2 = new Hilo1("Isabel");
 Hilo1 t3 = new Hilo1("Iván");
 t1.start();
 t2.start();
 t3.start();
 }}