import java.util.ArrayList;

public class Accountant {
    /**
     *
     * @param employees массив сотрудников
     * @return возвращает сумму зарплат всех сотрудников в массиве
     */
    public int sumSalaryOfMonth(ArrayList<Employees> employees)
    {
int sum=0;
        for (Employees e:employees
             ) {
            sum+=e.salaryForMonth();

        }

return sum;
    }

}
