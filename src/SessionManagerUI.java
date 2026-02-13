import java.util.ArrayList;
import java.util.Scanner;

public class SessionManagerUI {
    private Scanner scanner;
    private RoomList rooms;

    public SessionManagerUI(Scanner scanner, RoomList rooms) {
        this.scanner = scanner;
        this.rooms = rooms;
    }

    public void start() {
        while (true) {
            printCommands();
            String inputString = this.scanner.nextLine();
            System.out.println("");
            int input = Integer.parseInt(inputString);

            if (input == 0) {
                System.out.println("Returning to main menu...\n");
                break;
            }

            processCommand(input);
        }
    }

    public void processCommand(int command) {
        if (command == 1) {
            int id = getRoomIdByName();

            if (id >= 0) {
                Room room = this.rooms.getRoom(id);
                for (StudioSession session: this.rooms.getRoom(id).getAgenda().getAgenda()) {
                    System.out.println(session);
                }

            } else {
                System.out.println("Room does not exist\n");
            }


        }

        if (command == 2) {
            int id = getRoomIdByName();

            if (id >= 0) {
                Room room = this.rooms.getRoom(id);
                Agenda agenda = room.getAgenda();

                agenda.addStudioSession();
            } else {
                System.out.println("Room does not exist\n");
            }
        }

        if (command == 3) {

        }
    }

    public int getRoomIdByName() {
        System.out.print("Room name: ");
        String roomName = this.scanner.nextLine();
        int index = 0;

        if (this.rooms.getRoomList().isEmpty()) {
            return -1;
        }

        for (Room room: this.rooms.getRoomList()) {
            if (room.getRoomName().equals(roomName)) {
                return index;
            }
            index ++;
        }
        return -1;
    }



    public void printCommands() {
        System.out.println("---SESSION MANAGER MENU---\n");
        System.out.println("1 - List Sessions");
        System.out.println("2 - Add Session");
        System.out.println("3 - Remove Session");
        System.out.println("0 - Return\n");
        System.out.print("Insert a command: ");
    }
}
