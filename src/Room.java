import java.util.Scanner;

public class Room {
    private int id;
    private String roomName;
    private int priceHour;
    private EquipmentList equipmentList;
    private String type;
    private Agenda agenda;

    public Room(int id, String type, int priceHour, String roomName, Scanner scanner) {
        this.id = id;
        this.roomName = roomName;
        this.type = type;
        this.priceHour = priceHour;
        this.equipmentList = new EquipmentList();
        this.agenda = new Agenda(scanner);
    }

    public String toString() {
        return "Room ID: " + this.id + "\nType: " + this.type + "\nPrice/hour: " + this.priceHour;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public Agenda getAgenda() {
        return this.agenda;
    }


}
