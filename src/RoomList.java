import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {
    private ArrayList<Room> rooms;
    private Scanner scanner;

    public RoomList(Scanner scanner) {
        this.rooms = new ArrayList<>();
        this. scanner = scanner;
    }

    public ArrayList<Room> getRoomList() {
        return this.rooms;
    }

    public void printRooms() {
        if (this.rooms.isEmpty()) {
            System.out.println("There are no rooms registered\n");
        } else {
            for (Room room: rooms) {
                System.out.println(room + "\n");
            }
        }
    }

    public void addRoom() {
        System.out.print("Room name: ");
        String roomName = this.scanner.nextLine();
        System.out.print("Type of room: ");
        String type = this.scanner.nextLine();
        System.out.print("Price per hour: ");
        int pricePerHour = Integer.parseInt(this.scanner.nextLine());
        int id = this.rooms.size();

        this.rooms.add(new Room(id, type, pricePerHour, roomName));

    }

    public void removeRoom() {
        System.out.print("Insert room ID: ");
        int id = Integer.parseInt(this.scanner.nextLine());

        this.rooms.remove(id);
    }


}
