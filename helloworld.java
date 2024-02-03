[200~import java.util.Timer;
import java.util.TimerTask;

public class HelloWorldTimer {

	    public static void main(String[] args) {
		            Timer timer = new Timer();
			            TimerTask task = new TimerTask() {
					                @Override
							            public void run() {
									                    System.out.println("Hello World!");
											                }
							        };
				            timer.schedule(task, 0, 10000); // 10000 milliseconds = 10 seconds
									    //     }
									    //     }
