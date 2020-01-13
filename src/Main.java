public class Main {
    public static void main(String[] args){
        int number=10;
        String name="Employee";
        Employee James =new Employee(0001,"James","Rogers",10);
        System.out.println();
        James.getId();
        James.getFirstname();
        James.getLastname();
        James.getName();
        James.getSalary();
        James.getSalary();
        James.setSalary(170);
        James.getAnnualSalary();
        James.raiseSalary(10);
        James.toString();


    }
}
