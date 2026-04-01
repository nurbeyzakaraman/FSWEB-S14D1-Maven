package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);

        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        setSalary(getSalary() + 7500);
        System.out.println(getName() + " (HR Manager) is managing the team.");
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
                System.out.println("Junior " + developer.getName() + " added to index " + index);
            } else {
                System.out.println("Warning: Index " + index + " is already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds!");
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
                System.out.println("Mid " + developer.getName() + " added to index " + index);
            } else {
                System.out.println("Warning: Index " + index + " is already occupied!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds!");
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
                System.out.println("Senior " + developer.getName() + " added to index " + index);
            }  else {
                System.out.println("Warning: Index " + index + " is already occupied!");
            }
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds!");
        }
    }
}
