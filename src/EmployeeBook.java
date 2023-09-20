
public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public EmployeeBook() {

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
    }
    public void employeeList() {
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees)
            if (employee != null) {
                System.out.println(employee);
                System.out.println();
            }
    }
    public double totalSalary() {
        double totalSalary = 0;
        for (Employee employee : this.employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("\nСумма затрат на зарплаты в месяц - " + totalSalary);
        return totalSalary;
    }

    public void minSalaryEmployee() {
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

    public void maxSalaryEmployee() {
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
    public void averageSalary() {
        double totalSalary = totalSalary();
        double averageSalary = totalSalary / employees.length;
        System.out.println("\nСреднее значение зарплат - " + averageSalary);
    }

    // Ф.И.О. всех сотрудников
    public void fullName() {
        System.out.println("\nФ.И.О. всех сотрудников:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
    // метод добавления нового сотрудника
    public void addEmployee(String fullName) {
        int department = 0;
        double salary = 0;
        Employee employee = new Employee(fullName, department, salary);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
        System.out.println("\nНовый сотрудник -" + fullName);
    }
    // изменение зп и отдела
    public void modifyEmployee(String fullName, double newSalary, int newDepartment) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(newSalary);
                employee.setDepartment(newDepartment);
                break;
            }
        }
    }
    // удаление сотрудника по id
    public void removeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }
    // удаление сотрудника по имени
    public void removeByName(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                break;
            }
        }
        System.out.println("\nУдалённый сотрудник -"+ fullName);
    }
    // список всех сотрудников по отделам
    public void printEmployeesByDepartment() {
        int maxDepartment = getMaxDepartmentNumber();
        for (int department = 1; department <= maxDepartment; department++) {
            boolean departmentExists = false;
            System.out.println("\nОтдел " + department + ":");
            for (Employee employee : employees) {
                if (employee.getDepartment() == department) {
                    departmentExists = true;
                    System.out.println(employee.getFullName());
                }
            }
            if (!departmentExists) {
                System.out.println("Нет сотрудников");
            }
            System.out.println();
        }
    }
    // находим максимальный номер отдела с помощью вспомогательного метода
    //затем проходим по отделам от 1 до максимального номера и выводим сотрудников для каждого отдела
    private int getMaxDepartmentNumber() {
        int maxDepartment = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() > maxDepartment) {
                maxDepartment = employee.getDepartment();
            }
        }
        return maxDepartment;
    }
}

