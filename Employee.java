class Employee {
    double basic, overtimeHours, leaveDeductions;

    Employee(double basic, double overtimeHours, double leaveDeductions) {
        this.basic = basic;
        this.overtimeHours = overtimeHours;
        this.leaveDeductions = leaveDeductions;
    }

    double hra() {
        return 0.2 * basic;
    }

    double da() {
        return 0.1 * basic;
    }

    double bonus() {
        if (basic > 50000) return 0.1 * basic;
        else return 0.05 * basic;
    }

    double overtimePay() {
        return overtimeHours * 200;
    }

    double grossSalary() {
        return basic + hra() + da() + bonus() + overtimePay();
    }

    double tax() {
        if (grossSalary() > 80000) return 0.2 * grossSalary();
        else if (grossSalary() > 50000) return 0.1 * grossSalary();
        else return 0.05 * grossSalary();
    }

    double netSalary() {
        return grossSalary() - tax() - leaveDeductions;
    }

    void display() {
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra());
        System.out.println("DA: " + da());
        System.out.println("Bonus: " + bonus());
        System.out.println("Overtime Pay: " + overtimePay());
        System.out.println("Gross Salary: " + grossSalary());
        System.out.println("Tax: " + tax());
        System.out.println("Leave Deduction: " + leaveDeductions);
        System.out.println("Net Salary: " + netSalary());
    }

    public static void main(String[] args) {
        Employee e = new Employee(60000, 10, 2000);
        e.display();
    }
}