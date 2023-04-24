import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        Employee employee1 = new Employee(" Kotolupenko Vladislav Romanovich ", 1, 65000);
        Employee employee2 = new Employee("  Bryzgailov Alexander Viktorovich ", 2, 59000);
        Employee employee3 = new Employee(" Snitserenko Pavel Igovovich ", 3, 54000);
        Employee employee4 = new Employee(" Simenovich Elizaveta Pavlovna", 4, 68000);
        Employee employee5 = new Employee(" Dobrinova Olga Vladimirovna ", 5, 62000);


        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;


        System.out.println(" Получить список всех сотрудников со всеми имеющимися по ним данными  ");
        listOfEmployees(employees);


        listOfEmployees(employees);
        System.out.println(" сумма затрат на зарплаты в месяц ");
        printSum(employees);

        System.out.println(" Найти сотрудника с минимальной зарплатой ");
        employeeMiniSalary(employees);

        System.out.println(" Найти сотрудника с максимальной  зарплатой ");
        employeeMaxSalary(employees);

        System.out.println( " Подсчитать среднее значение зарплат ");
        printAverageSalary(employees);

        System.out.println(" Получить Ф. И. О. всех сотрудников  ");
        printFullNanes(employees);



    }

    private static void listOfEmployees(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    private static void printSum(Employee[] employees) {
        long sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        System.out.println("  Сумарная зарплата " + sum);
    }

    private static void employeeMiniSalary(Employee[] employees) {
        Employee employeeMiniSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeMiniSalary.getSalary()) {
                employeeMiniSalary = e;

            }
        }
        System.out.println(" Сотрудник с минимальной зарплатой " + employeeMiniSalary);
    }

    private static void employeeMaxSalary(Employee[] employees) {
        Employee employeeMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = e;

            }
        }
        System.out.println(" Сотрудник с максимальной  зарплатой " + employeeMaxSalary);
    }
    private static void printAverageSalary(Employee[] employees) {
        long sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();


        }
        double avgSum=(double) sum / employees.length;

        System.out.println( " Средняя зарплата: " +  avgSum   );
    }
    private static void  printFullNanes(Employee[] employees){
        for (Employee e: employees){
            System.out.println(e.getFullName());
        }

    }

}
