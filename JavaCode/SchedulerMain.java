import java.util.Scanner;
import java.util.Timer;

public class SchedulerMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Timer time = new Timer(); // Instantiate Timer Object
		Task tsk = new Task(); // Instantiate SheduledTask class
		System.out.println("Enter currency pair:");
		tsk.symbol=sc.nextLine();
		System.out.println("Enter target rate for notification for above currency:");
		tsk.trgRate=sc.nextDouble();
		time.schedule(tsk, 0, 1000); // Create Repetitively task for every 1 secs
	}

}
