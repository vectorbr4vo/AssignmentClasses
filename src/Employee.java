public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        System.out.println(id);
        return id;
    }

    public String getFirstname() {
        System.out.println(firstname);
        return firstname;
    }

    public String getLastname() {
        System.out.println(lastname);
        return lastname;
    }

    public String getName() {
        System.out.println(firstname+""+lastname);
        return firstname + "" + lastname;
    }

    public int getSalary() {
        System.out.println(salary);
        return salary;
    }

    public void setSalary(int salary) {
        System.out.println(salary);
    }

    public void getAnnualSalary() {
        System.out.println(salary*12);
    }

    public void raiseSalary(int percent) {
        System.out.println(salary*percent);
    }

    public String toString() {
        System.out.println("Employee[id=0001,name=firstname lastname, salary=10]");
        return "Employee[id=0001,name=firstname lastname, salary=10]";
    }
}
