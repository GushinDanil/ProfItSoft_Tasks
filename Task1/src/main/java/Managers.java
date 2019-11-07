public class Managers extends Employees {
    private final static int needHours=100;

    @Override
    public int percentOfWorkedTime() {
        if (getHoursWorked()>100)
            return 100;
         return (int)(100 * getHoursWorked() / needHours);
    }

    @Override
    public double salaryForMonth() {
        return ((double) percentOfWorkedTime()/(double) 100)* getFullSalary();
    }
}
