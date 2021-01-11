package com.denisenko.HT10_3;

import com.denisenko.HT10_2.Employee;

public class EmployeeByNameComparator {
    public int compare(Employee o1, Employee o2) {
        String o1Name = o1.getNameEmployee();
        String o2Name = o2.getNameEmployee();
        return o1Name.compareTo(o2Name);
    }
}
