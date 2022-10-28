public class Worker extends Personnel {

    private int hoursPerWeek;
    private double hourlyRate;

    public Worker() {}
    public Worker(double hourlyRate, int hoursPerWeek) {
        this.hourlyRate = hourlyRate;
        this.hoursPerWeek = hoursPerWeek;
    }

    //Setters
    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    //Getters
    public double getWage () {
        double wage = hourlyRate*hoursPerWeek;
        return wage;
    }
}
