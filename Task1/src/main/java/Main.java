/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Employees a =new Managers() ;
        Employees b =new Programmers() ;
   b.setFullSalary(999);
   b.setHoursWorked(33);

        System.out.println((double)b.percentOfWorkedTime()/100*b.getFullSalary());
    }
}
