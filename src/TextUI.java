import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private WorkerUI workerUI;
    private RoomUI roomUI;
    private SessionManagerUI sessionManagerUI;
    private RoomList roomList;



    public TextUI(Scanner scanner) {
        this.scanner = scanner;
        this.workerUI = new WorkerUI(scanner);
        this.roomUI = new RoomUI(scanner);

    }

    public void start() {
        while (true) {
            printCommands();
            int input = Integer.parseInt(this.scanner.nextLine());
            System.out.println("");

            if (input == 0) {
                System.out.println("Exiting application...");
                break;
            }

            processCommand(input);
        }

    }

    private void processCommand(int command) {
        if (command == 1) {
            this.roomList = this.roomUI.start();
        } else if (command == 2) {
            this.workerUI.start();
        } else if (command == 3) {

        } else if (command == 4) {
            this.sessionManagerUI = new SessionManagerUI(this.scanner, this.roomList);
            this.sessionManagerUI.start();
        } else {
            System.out.println("Invalid command\n");
        }
    }

    public void printCommands() {
        System.out.println("---MAIN MENU---\n");
        System.out.println("1 - Rooms");
        System.out.println("2 - Workers");
        System.out.println("3 - Instruments");
        System.out.println("4 - Session Manager");
        System.out.println("0 - Quit\n");
        System.out.print("Insert a command: ");
    }




}
