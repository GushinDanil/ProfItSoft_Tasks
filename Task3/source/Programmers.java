public class Programmers extends Employees {
    private final static int needHours=200;

    @Override
    public int percentOfWorkedTime() {

            return  (100 * getHoursWorked()/ needHours);
        }


    @Override
    public double salaryForMonth() {

        return (double)((double)percentOfWorkedTime()/(double) 100)*  getFullSalary();
    }
}
