public class Main {
    public static void main(String[] args) {

            EmployeeBook EB = new EmployeeBook();
            EB.employeeList();
            EB.totalSalary();
            EB.minSalaryEmployee();
            EB.maxSalaryEmployee();
            EB.averageSalary();
            EB.fullName();
            EB.removeByName("Коротков Эдуард Николаевич");
            EB.removeById(4);
            EB.addEmployee("Денисов Сергей Витальевич");
            EB.modifyEmployee("Денисов Сергей Витальевич",54700,5);
            EB.printEmployeesByDepartment();

    }
}