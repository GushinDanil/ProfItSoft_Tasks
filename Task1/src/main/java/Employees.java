public abstract class Employees {
    private  int fullSalary;
    private int hoursWorked;

    public double getFullSalary() {
        return fullSalary;
    }

    public void setFullSalary(int fullSalary) {
        this.fullSalary = fullSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
/**
* Функция для просчёта процента работы которая выполнена за месяц
 */
public abstract int percentOfWorkedTime();
    /**
     * Функция  для просчёта заработной платы за месяц на основе часов работы за месяц
     */
    public abstract  double salaryForMonth();

}
