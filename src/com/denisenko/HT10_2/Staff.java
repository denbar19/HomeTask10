package com.denisenko.HT10_2;

public interface Staff {

    String employeeInfo(int id);

    Employee changeTitleEmployee(int idEmployee, int[] subordinates);

    int[] getManagerInfo(int id);

    String getIdEmployee();

    String getCurrency();

    String getSalary();

}
