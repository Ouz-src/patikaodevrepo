public class Employee {
    String nameSurname;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String nameSurname, int salary, int workHours, int hireYear) {
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    float tax(int salary) {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03f;
        }
    }

    int bonus(int totalWorkHours) {
        if (totalWorkHours > 40)
            return (totalWorkHours - 40) * 30;

        return 0;
    }

    float raiseSalary() {
        int gap = 2021 - this.hireYear;
        if (gap < 10) {
            return this.salary * 0.05f;
        } else if (gap > 9 && gap < 20) {
            return this.salary * 0.1f;
        } else {
            return this.salary * 0.15f;
        }
    }

    void to_String() {
        int bonus = bonus(this.workHours);
        float tax = tax(this.salary);

        System.out.println("Name - Surname: " + this.nameSurname);
        System.out.println("Salary:" + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary Increase: " + raiseSalary());
        System.out.println("Salary with taxes and bonuses: " + (this.salary + bonus - tax));
        System.out.println("Total Salary: " + (this.salary + bonus - tax + raiseSalary()));
        System.out.println("************************************");
    }
}
