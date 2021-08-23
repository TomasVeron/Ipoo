package tp4.eje10;


import java.util.Observable;
import java.util.concurrent.TimeUnit;


public class Tiempo extends Observable {
    private long behind;
    private long end;
    private boolean isRunning;

    public Tiempo() {
        setBehind(0);
        setEnd(0);
        setRunning(false);
    }

    public long getBehind() {
        return behind;
    }

    public void setBehind(long behind) {
        this.behind = behind;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void action() {
        if (isRunning) {
            stop();
            setRunning(false);
        } else {
            start();
            setRunning(true);
        }
        setChanged();
        notifyObservers();
    }

    public void start() {
        setBehind(System.currentTimeMillis());
    }

    public void stop() {
        setEnd(System.currentTimeMillis());
    }


    @Override
    public String toString() {
        long millis = getEnd() - getBehind();
        return convertSecondsToHMmSs(TimeUnit.MILLISECONDS.toSeconds(millis));
    }

    private static String convertSecondsToHMmSs(long seconds) {
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%d:%02d:%02d", h, m, s);
    }
}


