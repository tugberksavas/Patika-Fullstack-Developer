public class Main {



    public static void main(String[] args) {

    Employee employee = new Employee("tugberk",1000,50,2020);
        System.out.println(employee.toString());
        System.out.println(employee.raiseSalary(employee));
        System.out.println(employee.bonus(employee.workHours));
        System.out.println(employee.tax(employee.salary));






    }
}