class Hilo1 extends Thread {
	private String nombre;
	private int retardo;
	public Hilo1( String s,int d ) {
		nombre = s;
		retardo = d;
	}
	public void run() {
		/*try {
			sleep(retardo);
		}catch( InterruptedException e ) {}*/
		for(int i = 0; i<1000; i++){
			System.out.println( "Hola Mundo! "+nombre+" "+i );
		}
	}
}

public class EjemploJoin {
	public static void main( String args[] ) {
		Hilo1 t1,t2;
		t1 = new Hilo1( "Thread 1",(int)(Math.random()*2000) );
		t2 = new Hilo1( "Thread 2",(int)(Math.random()*2000) );
		t1.start();
		t2.start();
		try{
			t2.join();
		}catch(InterruptedException we){}
 	}
}