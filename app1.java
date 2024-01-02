import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {

    private Timer timer;
    private long millisUntilFinished;

    public CountDownTimer(long millisUntilFinished) {
        this.millisUntilFinished = millisUntilFinished;
        timer = new Timer();
    }

    public void start() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                millisUntilFinished -= 1000;
                if (millisUntilFinished <= 0) {
                    onFinish();
                    timer.cancel();
                }
            }
        }, 0, 1000);
    }

    public void onFinish() {
        System.out.println("Time's up!");
    }

    public static void main(String[] args) {
        CountDownTimer timer = new CountDownTimer(10000);
        timer.start();
    }
}
