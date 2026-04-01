package com.workintech.developers;

public class SeniorDeveloper extends  Employee {
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 60000);
        System.out.println(getName() + " works with salary of: " + getSalary());
    }
}
