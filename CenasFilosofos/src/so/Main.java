package so;



public class Main {
public static void main(String argv[]){
	TortugaThread tortuga =new TortugaThread();
	Thread liebre = new Thread(new LiebreThread());
	tortuga.start();
	liebre.start();
	
	

}
}
