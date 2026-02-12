import java.util.ArrayList;
import java.util.Scanner;

public class WorkerList {
    private Scanner scanner;
    private ArrayList<Worker> workers;

    public WorkerList(Scanner scanner) {
        this.workers = new ArrayList<>();
        this.scanner = scanner;
    }

    public void addWorker(String name,
                          String job,
                          int salary,
                          int age,
                          String email,
                          String id,
                          String phone) {
        workers.add(new Worker(name,
                    job,
                    salary,
                    age,
                    email,
                    id,
                    phone));
    }

    public void removeWorker() {
        System.out.print("Name: ");
        String name = this.scanner.nextLine();
        boolean check = false;

        for (Worker worker: workers) {
            if (worker.getName().equals(name)) {
                workers.remove(workers.indexOf(worker));
                check = true;
                System.out.println("Worker " + name + " was removed successfully");
                break;
            }
        }

        if (!check) {
            System.out.println("Worker " + name + " does not exist");
        }
    }

    public void printWorkers() {
        if (this.workers.isEmpty()) {
            System.out.println("There are no workers registered\n");
        } else {
            for (Worker worker: workers) {
                System.out.println(worker);
            }
        }
    }

    public void registerWorker() {
        System.out.print("Enter worker's name: ");
        String name = this.scanner.nextLine();
        System.out.println("");

        System.out.print("Enter worker's job: ");
        String job = this.scanner.nextLine();
        System.out.println("");

        System.out.print("Enter worker's salary per month: ");
        int salary = Integer.parseInt(this.scanner.nextLine());
        System.out.println("");

        System.out.print("Enter worker's age: ");
        int age = Integer.parseInt(this.scanner.nextLine());
        System.out.println("");

        System.out.print("Enter worker's email: ");
        String email = this.scanner.nextLine();
        System.out.println("");

        System.out.print("Enter worker's ID: ");
        String id = this.scanner.nextLine();
        System.out.println("");

        System.out.print("Enter worker's phone number: ");
        String phone = this.scanner.nextLine();
        System.out.println("");

        addWorker(name, job, salary, age, email, id, phone);

        System.out.println("Worker " + name + " registered successfully!\n");

    }



}
