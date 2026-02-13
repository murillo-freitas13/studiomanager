import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<StudioSession> agenda;
    private ArrayList<Worker> workerList;
    private Scanner scanner;

    public Agenda(Scanner scanner) {
        this.scanner = scanner;
        this.agenda = new ArrayList<>();
    }

    public void addStudioSession() {
        // pegar inputs
        LocalDateTime start = getStartTime();
        LocalDateTime finish = getFinishTime();

        // checar se o horario esta disponivel
        if (validateSession(start, finish, this.agenda)) {
            this.agenda.add(new StudioSession(start, finish, this.workerList));
            System.out.println("Studio session registered successfully\n");
        } else {
            System.out.println("Not available\n");
        }
        // registrar sessao


    }

    public ArrayList<StudioSession> getAgenda() {
        return this.agenda;
    }

    public boolean validateSession(LocalDateTime start, LocalDateTime finish, ArrayList<StudioSession> agenda) {
        if (agenda.isEmpty()) {
            return true;
        }

        for (StudioSession session: agenda) {
            if (start.isAfter(session.getStart()) && start.isBefore(session.getFinish())) {
                return false;
            }

            if (finish.isAfter(session.getStart()) && finish.isBefore(session.getFinish())) {
                return false;
            }
        }

        return false;
    }

    public String getRoomName() {
        System.out.print("Room name:");
        String name = this.scanner.nextLine();
        return name;
    }

    public LocalDateTime getStartTime() {
        System.out.print("Start time (dd-MM-yyyy HH:mm): ");
        String startTime = this.scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return LocalDateTime.parse(startTime, formatter);
    }

    public LocalDateTime getFinishTime() {
        System.out.print("Finish time (dd-MM-yyyy HH:mm): ");
        String finishTime = this.scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return LocalDateTime.parse(finishTime, formatter);
    }

    public void getSessions() {
        for (StudioSession session: this.agenda) {
            System.out.println(session);
        }
    }


}
