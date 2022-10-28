public class ShowPersonnel {

    public static void main(String[] args) {

        Personnel p1 = new Personnel();
        Personnel p2 = new Personnel();
        Personnel p3 = new Personnel();

        p1.Personnel("Liam", 3436, 75);
        p2.Personnel("Jenny", 8362, 53);
        p3.Personnel("Neb", 7212, 85);

        //Display
        System.out.println("\n" +
                "+-------------------+ \n" +
                "| Personnel Payroll | \n" +
                "+-------------------+--------------------+ \n" +
                "|    | NAME         | PAYROLL NUM | DEPT | \n" +
                "+-------------------+--------------------+ \n" +
                "| 1  | " + p1.getName() + "         | " + p1.getPayrollNum() + "        | " + p1.getDept() + " | \n" +
                "| 2  | " + p2.getName() + "        | " + p2.getPayrollNum() + "        | " + p2.getDept() + " | \n" +
                "| 1  | " + p3.getName() + "          | " + p3.getPayrollNum() + "        | " + p3.getDept() + " | \n" +
                "+-------------------+--------------------+ \n"
        );



    }
}
