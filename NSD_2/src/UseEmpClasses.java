public class UseEmpClasses {

    //2. Copy and then modify solution to programming exercise 6 from last week's lab work so that it uses an array of three Personnel objects.
    //(i) Derive subclasses Manager and Worker from the Personnel class above, adding the data properties, constructors and methods shown below.
    //(ii) Create an executable class (i.e., one that contains the main method) and call it UseEmpClasses. This new class should create one Manager object and one Worker object. Having created these objects, main should then use the class methods to display name, department and salary for the manager and name, department and wage for the worker. Test the program before continuing.
    //(iii) Add a method setDept to class Manager that changes a manager object's department. After displaying the manager's department as in (ii) above, have UseEmpClasses call method setDept, supplying a different department name. It should then display an additional message that shows the new department name (via a second call to getDept).

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.Personnel("Josh", 6374, "Stock room");
        manager.setSalary(27000.00);

        Worker worker = new Worker();
        worker.Personnel("Kamil", 7625, "Stock room");
        worker.setHourlyRate(8.25);
        worker.setHoursPerWeek(40);

        //Print current staff
        System.out.println("Manager name: "+manager.getName());
        System.out.println("Manager department: "+manager.getDept());
        System.out.println("Salary: £"+manager.getSalary());

        System.out.println("Worker name: "+worker.getName());
        System.out.println("Worker department: "+worker.getDept());
        System.out.println("Wages p/w: £"+worker.getWage());

        //Update manager
        manager.setDept("Returns");
        System.out.println("\nThe Managers department has been updated too: "+manager.getDept());
    }
}
