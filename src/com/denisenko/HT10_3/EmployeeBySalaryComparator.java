package com.denisenko.HT10_3;

import com.denisenko.HT10_2.Employee;

import java.util.Collections;
import java.util.Comparator;

public class EmployeeBySalaryComparator implements Comparator<Employee> {

    private static final double CURRENCY = 28.5;

    @Override
    public int compare(Employee o1, Employee o2) {
        String o1Currency = o1.getCurrency();
        String o2Currency = o2.getCurrency();
        int o1Salary = Integer.parseInt(o1.getSalary());
        int o2Salary = Integer.parseInt(o2.getSalary());
        if (o1Currency.equals("USD")) {
            o1Salary *= CURRENCY;
        }
        if (o2Currency.equals("USD")) {
            o2Salary *= CURRENCY;
        }
        if (o1Salary < o2Salary) {
            return -1;
        } else if (o1Salary == o2Salary) {
            EmployeeByNameComparator nameCompare = new EmployeeByNameComparator();
            return nameCompare.compare(o1, o2);
        }
        return 1;
    }


}
