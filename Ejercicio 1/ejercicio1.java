public class Hilo1 extends Thread{
	//Define una variable string que guardara el nombre del hilo
 	private String nombre;
	 public Hilo1(String nombre)
	 {	
	 	//Asigna la variable que se pasa como parametro al string
	 	this.nombre=nombre;
	 }

	 public void run(){
		 try{
		 	//Crea una variable numerica con un valor aleatorio entre 0 y 5000
			 int x=(int)(Math.random()*5000);
			 //Duerme el hilo el numero de milisegundos que hemos guardado en la variable anterior
			 Thread.sleep(x);
			 //Muestra el nombre del hilo por pantalla y el tiempo que le ha dado de espera
			 System.out.println("Soy "+nombre+ " ("+x+")");
		 }
		 catch (Exception ex){ }
	 }

	 public static void main(String[] args) {
	 	//Crea 3 hilos con 3 nombres diferentes y los ejecuta
		 Hilo1 t1 = new Hilo1("Vicente");
		 Hilo1 t2 = new Hilo1("Isabel");
		 Hilo1 t3 = new Hilo1("Iván");
		 t1.start();
		 t2.start();
		 t3.start();
	}
}