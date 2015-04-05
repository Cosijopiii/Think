package so;

public class HelloThread extends Thread{
	public String nombre;
	
	public HelloThread(String nombre){
		this.nombre=nombre;
	}
	public void run(){
		
     	System.out.println("Hello thread "+nombre);
	}

	public static void main(String argv[]){
//		HelloThread hilo = new HelloThread("1");
//		hilo.start();
//		HelloThread hilo2 = new HelloThread("2");
//		hilo2.start();
		
		Foobar f1=new Foobar("romeo");
		Thread t1 =new Thread(f1);
		t1.start();
		
		Foobar f2=new Foobar("julieta");
		Thread t2 =new Thread(f2);
		t2.start();
	}
	
	}
	
	
	
	
class Foobar implements Runnable{
	String name;
	public Foobar(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
				System.out.println(name+": hello World");
		}
	}
}
	


