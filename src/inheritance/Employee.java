package inheritance;

public class Employee extends Person {

    //Notes:
    //Java does not support multiple inheritances.
    //All public and protected methods and fields from the super class (parent) are inherited from the subclass (child).
    //Private methods and fields from the super class are not inherited.
    //And all Final methods from the super class are inherited but cannot be overridden.

    private String employeeId;
    private String salary;
    private Title title;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public void setPhone(int phone) {
        super.setPhone(phone);
    }

    public String getEmployeeTitle() {
        return title.toString();

    }
}
