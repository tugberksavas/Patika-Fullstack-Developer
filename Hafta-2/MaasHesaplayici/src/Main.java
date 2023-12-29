import java.text.DecimalFormat;

public class Main {


    public static void main(String[] args) {

        Employee employee = new Employee("tugberk", 2000, 45, 1985);
        double total =(employee.salary +employee.bonus(employee.workHours))-employee.tax(employee.salary);
        double totalMaas = total+employee.raiseSalary(employee);

        System.out.println("adi: " + employee.name);
        System.out.println("maas: " + employee.salary);
        System.out.println("calisma saati: " + employee.workHours);
        System.out.println("baslangic yili: " + employee.hireYear);
        System.out.println("vergi: " + employee.tax(employee.salary));
        System.out.println("bonus: " + employee.bonus(employee.workHours));
        System.out.println("maas artisi: " + employee.raiseSalary(employee));
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + total);
        System.out.println("toplam maas: "+ totalMaas );



    }
}