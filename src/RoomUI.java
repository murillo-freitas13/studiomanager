import java.util.Scanner;

public class RoomUI {
    private Scanner scanner;
    private RoomList rooms;

    public RoomUI(Scanner scanner) {
        this.scanner = scanner;
        this.rooms = new RoomList(this.scanner);
    }

    public RoomList start() {
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
        return this.rooms;
    }

    public RoomList getRooms() {
        return this.rooms;
    }

    public void processCommand(int command) {
        if (command == 1) {
            this.rooms.printRooms();
        }

        if (command == 2) {
            this.rooms.addRoom();
        }

        if (command == 3) {
            this.rooms.removeRoom();
        }
    }



    public void printCommands() {
        System.out.println("---ROOM MENU---\n");
        System.out.println("1 - List Rooms");
        System.out.println("2 - Add Room");
        System.out.println("3 - Remove Room");
        System.out.println("0 - Return\n");
        System.out.print("Insert a command: ");
    }
}
