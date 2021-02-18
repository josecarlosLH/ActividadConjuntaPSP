class HiloEjer6 extends Thread{
	 private String s;
	 public HiloEjer6(String name) {
	 	this.s = name;
	 }
	 public void run() {
	 	for(int x = 0; x <1000; x++){
	 		/*try{
	 			sleep(1000);
		 	}catch(InterruptedException EE){}*/
		 	//El sleep dormiria el hilo y el join lo saltaria, ya que considera que el hilo esta parado
		 	System.out.println(this.s);
 		}
 	}
}
public class Ejer6 {
	 public static void main(String[] args) throws InterruptedException{
		 HiloEjer6 h1 = new HiloEjer6("A");
		 HiloEjer6 h2 = new HiloEjer6("B");
		try{
			h2.start();
			h1.start();
		 	h2.join();
	 	}catch(InterruptedException EE){}
		 // Selecciona el hilo actual que se esta ejecutando y lo
		// encadena a h1
	 	System.out.println("MAIN, THE END");
	 }
}
