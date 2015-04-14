package fcfs;

import java.util.List;

/**
 * Clase algoritmo FCFS
 * 
 * 
 * @author Cosijopii
 *
 */
public class FirstComeFirstServed {
	/**
	 * Variable temporal para verficar el tiempo de inicio del siguiente proceso
	 */
	private int temp;
	/**
	 * Suma los tiempos de espera
	 */
	private double avgWaitingTime;
	/**
	 * Suma los tiempos de espera total
	 */
	private double avgTotalTime;

	/**
	 * Constructor de la clase
	 */
	public FirstComeFirstServed() {

	}

	/**
	 * Metodo que incia e implementa el algoritmo FCFS
	 * 
	 * @param jobList
	 *            lista de procesos
	 */
	public void run(List<Job> jobList) {
		int count = 0;
		System.out.println("============================================ ");
		System.out.println("Proceso ID | Tiempo llegada | Tiempo de espera ");
		System.out.println("============================================ ");
		for (Job job : jobList) {

			if (count == 0) {
				job.processArrivalTime = job.getArrivalTime();
				job.ProcessCompletionTime = job.getArrivalTime()
						+ job.getCpuTime();
			} else {
				job.processArrivalTime = temp - job.getArrivalTime();
				job.ProcessCompletionTime = temp + job.getCpuTime();
			}
			temp = job.ProcessCompletionTime;
			job.starTime = temp - job.getArrivalTime();
			job.waitingTime = job.starTime - job.getCpuTime();
			count++;

			avgWaitingTime = avgWaitingTime + job.waitingTime;
			avgTotalTime = avgTotalTime + job.starTime;
			System.out.println("   " + job.getProcessId() + "  | " + "   "
					+ job.starTime + "  | " + "   " + job.waitingTime + " ");
			System.out.println("----------------------------------------");
		}
		System.out.println("===============================================");
		System.out.println("Promedio de espera:" + avgWaitingTime
				/ jobList.size());
		System.out.println("===============================================");
		System.out.println("Promedio total de espera:" + avgTotalTime
				/ jobList.size());
		System.out.println("===============================================");

	}
	/**
	 * 
	 * @param min int que establece el rango minimo del numero aleatorio
	 * @param max int aue establece el rango maximo del numero aleatorio
	 * @return  int que esta entre los rangos establecidos en @param min y @param max
	 */
	public static int GenRandom(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

}
