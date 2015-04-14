package fcfs;
/**
 * Clase que Encapsula un proceso
 * @author Cosijopii
 *
 */
public class Job {
    /**
     * Identificador de proceso
     */
	private int id;
    /**
     * Tiempo que tarda en completarce el proceso
     */
    public int ProcessCompletionTime;
    /**
     * Tiempo que tarda en iniciarce el proceso
     */
    public int processArrivalTime;
    /**
     * Tiempo de espera
     */
    public int waitingTime;
    /**
     *  Tiempo en el cual se inicia el proceso
     */
    public int starTime;
  /**
   * Instante de llegada
   */
    private int arrivalTime;
    /**
     * Tiempo de rafaga
     */
    private int cpuTime;
    /**
     * identificador del proceso
     */
    private int processId;
    /**
     * Constructor del proceso o trabajo
     * 
     * @param processId id del proceso
     * @param arrivalTime instante de llegada
     * @param cpuTime  tiempo de rafaga
     */
    public Job(int processId, int arrivalTime, int cpuTime) {
        
        this.processId = processId;
        this.arrivalTime = arrivalTime;
        this.cpuTime = cpuTime;
        
    }
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the processCompletionTime
	 */
	public int getProcessCompletionTime() {
		return ProcessCompletionTime;
	}

	/**
	 * @return the processArrivalTime
	 */
	public int getProcessArrivalTime() {
		return processArrivalTime;
	}

	/**
	 * @return the waitingTime
	 */
	public int getWaitingTime() {
		return waitingTime;
	}

	/**
	 * @return the starTime
	 */
	public int getTurnAroundTime() {
		return starTime;
	}

	/**
	 * @return the arrivalTime
	 */
	public int getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @return the cpuTime
	 */
	public int getCpuTime() {
		return cpuTime;
	}

	/**
	 * @return the processId
	 */
	public int getProcessId() {
		return processId;
	}
	/**
	 * Return a String of Job
	 */
	public String toString(){
		return "\n id: "+String.valueOf(processId)+"\n Arrival Time: "+String.valueOf(arrivalTime)+"\n Cpu Time/Burst Time: "+String.valueOf(cpuTime);
		
	}
 
    
    
}
