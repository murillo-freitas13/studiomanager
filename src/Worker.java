public class Worker {
    private String name;
    private String job;
    private int salary;
    private int age;
    private String email;
    private String id;
    private String phone;

    public Worker(String name,
                  String job,
                  int salary,
                  int age,
                  String email,
                  String id,
                  String phone
                  ) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.age = age;
        this.email = email;
        this.id = id;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getJob() {
        return this.job;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email;
    }

    public String getId() {
        return this.id;
    }

    public String getPhone() {
        return this.phone;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +  "Job: " + this.job + "\nSalary: " + this.salary + "\n";
    }



}
