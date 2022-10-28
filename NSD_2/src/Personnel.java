public class Personnel {

    private String name;
    private int payrollNum;
    private String dept;

    public void Personnel(String name, int payrollNum, String dept) {

        this.name = name;
        this.payrollNum = payrollNum;
        this.dept = dept;

    }

    //Setters
    public void setName (String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getPayrollNum () {
        return payrollNum;
    }
    public String getDept() {
        return dept;
    }


}

