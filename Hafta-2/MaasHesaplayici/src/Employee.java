public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;//field


    public Employee(String name, double salary, int workHours, int hireYear) {//constructor method
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }


    public double tax(double salary) { //method
        double tax111 = 0;

        if (salary >= 1000) {
            tax111 = salary * 0.03;
        }
        return tax111;
    }

    /*
    public double bonus(int workHours) {
        int calisma = 40; //int
        double mesai = 0;
        if (workHours > 40) {
            mesai = workHours - calisma;
            mesai *= 30;
        }
        return mesai;
    }
    /*
    public double bonus(Employee employee) {
        int calisma = 40; //int
        double mesai = 0;
        if (employee.workHours > 40) {
            mesai = employee.workHours - calisma;
            mesai *= 30;
        }
        return mesai;
     */


    public double bonus(int workHours) {
        int calisma = 40;
        double mesai = 0;
        return (workHours > 40) ? mesai = (workHours - calisma) * 30 : 0;
    }


    public double raiseSalary(Employee employee) {
        int neKadarCalisti = 2021 - employee.hireYear;
        double zam = 0;
        if (neKadarCalisti < 10) {
            zam = employee.salary * 0.05;
        } else if (neKadarCalisti >= 9 && neKadarCalisti < 20) {
            zam = employee.salary * 0.10;
        } else if (neKadarCalisti >= 19) {
            zam = employee.salary * 0.15;
        }
        return zam;
    }

    public String toString() {
        return "Employee: {name: " + name + "salary: " + salary + "workHours: " + workHours + "hireYear: " + hireYear + "}";
    }

}
