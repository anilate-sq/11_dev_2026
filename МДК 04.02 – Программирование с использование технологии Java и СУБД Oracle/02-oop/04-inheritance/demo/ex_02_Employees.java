// protected - выдает доступ всем дочерним класса
class Employee{
    protected String name;
    Employee(String name){
        this.name = name;
    }

    void printInfo(){
        System.out.println("Сотрудник: " + this.name);
    }
}

class Manager extends Employee{
    private String department;
    Manager(String name, String department){
        super(name);
        this.department = department;
    }
    @Override void printInfo(){
        System.out.println("Сотрудник: " + name + "\nОтдел: " + department);
 
    }
}

public class ex_02_Employees {
    public static void main(String[] args) {
        Employee employee = new Employee("Виктор Иванов");
        employee.printInfo();
        Manager manager = new Manager("Григорий Степанов", "IT-development");
        manager.printInfo();
    }
}
