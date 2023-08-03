package solid.live.srp;


public class Employee extends employeeFormatter{
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private String manager;
    private int yearsInOrg;
    private int[] leavesLeftPreviously;
    private int leavesPending;


    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
        this.leavesPending = TOTAL_LEAVES_ALLOWED+ leavesLeftPreviously[1]-leavesTaken;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public int getLeavesPending() {
        return leavesPending;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public String getManager() {
        return manager;
    }
    public int getYearsInOrg() {
        return yearsInOrg;
    }
    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }
    public String output() {
        return Output.toHtml(this);
    }        
    //other method related to customer
}
