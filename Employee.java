import java.util.Objects;
public class Employee extends Person implements IEmployee{
    private int employeeID;
    private String department;
    public Employee(int employeeID, String department) {
        this.employeeID = employeeID;
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


