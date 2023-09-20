public class Main {

    // метод, позволяющий получить список всех сотрудников с их данными
    public static void employeeList(Employee[] employees) {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees)
            if (employee != null) {
                System.out.println(employee);
                System.out.println();
            }
    }
    // метод, считающий затраты на зп в месяц
    public static double totalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("\nСумма затрат на зарплаты в месяц - " + totalSalary);
        return totalSalary;
    }
    // метод, который ищет сотрудника с минимальной зп
    public static void minSalaryEmployee(Employee[] employees) {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }
        System.out.println("\nСотрудник с минимальной зарплатой - " + minSalaryEmployee);
    }
    // метод, который ищет сотрудника с максимальной зп
    public static void maxSalaryEmployee(Employee[] employees) {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой - " + maxSalaryEmployee);
    }

    //среднее значение зарплат
    public static void averageSalary (Employee[] employees) {
        double totalSalary = totalSalary(employees);
        double averageSalary = totalSalary / employees.length;
        System.out.println("\nСреднее значение зарплат - " + averageSalary);
    }

    // Ф.И.О. всех сотрудников
    public static void fullName (Employee[] employees) {
        System.out.println("\nФ.И.О. всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        // заполняю массив сотрудниками
        employees[0] = new Employee("Иванов Денис Семёнович", 1, 54000);
        employees[1] = new Employee("Петров Алексей Петрович", 2, 60000);
        employees[2] = new Employee("Попова Татьяна Андреевна", 3, 55000);
        employees[3] = new Employee("Александров Алексей Алексеевич", 2, 71000);
        employees[4] = new Employee("Коротков Эдуард Николаевич", 1, 48000);
        employees[5] = new Employee("Смирнова Светлана Сергеевна", 4, 62000);
        employees[6] = new Employee("Белов Борис Михайлович", 3, 58000);
        employees[7] = new Employee("Морозова Анастасия Георгиевна", 5, 75000);
        employees[8] = new Employee("Зайцев Виктор Захарович", 2, 72000);
        employees[9] = new Employee("Гусев Григорий Всеволодович", 4, 67000);

        // заношу методы в main и вызываю их по очереди
        employeeList(employees);
        totalSalary(employees);
        minSalaryEmployee(employees);
        maxSalaryEmployee(employees);
        averageSalary(employees);
        fullName(employees);
    }
}
