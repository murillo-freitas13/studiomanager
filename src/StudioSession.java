import java.time.LocalDateTime;
import java.util.ArrayList;

public class StudioSession {
    private LocalDateTime start;
    private LocalDateTime finish;
    private ArrayList<Worker> responsibleWorkers;

    public StudioSession(LocalDateTime start, LocalDateTime finish, ArrayList<Worker> responsibleWorkers) {
        this.start = start;
        this.finish = finish;
        this.responsibleWorkers = responsibleWorkers;
    }

    public LocalDateTime getStart() {
        return this.start;
    }

    public LocalDateTime getFinish() {
        return this.finish;
    }

    public ArrayList<Worker> getResponsibleWorkers() {
        return this.responsibleWorkers;
    }

    public String toString() {
        return "Start time: " + this.start + "\nFinish time: " + this.finish + "Responsible workers: " + this.responsibleWorkers.toString();
    }
}
