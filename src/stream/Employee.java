package stream;

import java.util.List;

public class Employee {

    private String empId;
    private int salary;

    List<Address> address;

    public Employee(String ajay, int i, Address pune) {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
}

/*
000000000
011111110
010000010
010000010
010000010
010000010
011111110
000000000

x = 0, y = 0

Output:

111111111
111111111
110000011
110000011
110000011
110000011
111111111
111111111

*/