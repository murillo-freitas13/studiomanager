import java.util.Scanner;

public class WorkerUI {
    private Scanner scanner;
    WorkerList workers;

    public WorkerUI(Scanner scanner) {
        this.scanner = scanner;
        this.workers = new WorkerList(this.scanner);
    }


    public void start() {
        while (true) {
            printCommands();
            int input = Integer.parseInt(this.scanner.nextLine());
            System.out.println("");

            if (input == 0) {
                System.out.println("Quitting to main menu...\n");
                break;
            }

            processCommand(input);
        }
    }

    public void printCommands() {
        System.out.println("---WORKER'S MENU---\n");
        System.out.println("1 - List workers");
        System.out.println("2 - Register worker");
        System.out.println("3 - Remove worker");
        System.out.println("0 - Quit\n");
        System.out.print("Insert a command: ");
    }

    private void processCommand(int command) {
        if (command == 1) {
            this.workers.printWorkers();
        } else if (command == 2) {
            this.workers.registerWorker();
        } else if (command == 3) {
            this.workers.removeWorker();
        } else {
            System.out.println("Invalid command\n");
        }
    }


}


