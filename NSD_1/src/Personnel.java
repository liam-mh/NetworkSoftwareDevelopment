public class Personnel {

    private String name;
    private int payrollNum;
    private double dept;

    public void Personnel(String name, int payrollNum, double dept) {

        this.name = name;
        this.payrollNum = payrollNum;
        this.dept = dept;

    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getPayrollNum () {
        return payrollNum;
    }

    public double getDept() {
        return dept;
     }

}
