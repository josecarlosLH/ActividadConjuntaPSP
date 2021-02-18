public class Hilo2 implements Runnable{
	 private String nombre;
	 public Hilo2(String nombre)
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
		 Thread t1 = new Thread(new Hilo2("Vicente"));
		 Thread t2 = new Thread(new Hilo2("Isabel"));
		 Thread t3 = new Thread(new Hilo2("Iván"));
		 t1.start();
		 t2.start();
		 t3.start();
	 }
}
