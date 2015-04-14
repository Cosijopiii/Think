package fcfs;




import java.util.ArrayList;
import java.util.Scanner;


public class TestFcfs{
	
	private static Scanner sc;

	public static void main(String[] args) {
	sc = new Scanner(System.in);
	ArrayList<Job> jobs =new ArrayList<Job>();
	System.out.println("Cuantos Procesos se crearan: ");
	int np = sc.nextInt();
	Job j;
	for (int i = 0; i < np; i++) {
		j=new Job(i,FirstComeFirstServed.GenRandom(0,10),FirstComeFirstServed.GenRandom(1,10));
		jobs.add(j);
		System.out.println(j.toString());
	}
	FirstComeFirstServed fcfs =new FirstComeFirstServed();
	fcfs.run(jobs);
	}
}
