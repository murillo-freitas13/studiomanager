import java.util.ArrayList;

public class Agenda {
    private ArrayList<StudioSession> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }

    public void addStudioSession() {
        // pegar inputs

        // converter strings em LocalDateTime
        // checar se o horario esta disponivel
        // registrar sessao

    }

    public ArrayList<StudioSession> getAgenda() {
        return this.agenda;
    }
}
