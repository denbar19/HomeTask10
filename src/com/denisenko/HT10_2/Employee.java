package com.denisenko.HT10_2;

import java.util.ArrayList;
import java.util.List;

public class Employee extends AbstractEmployee implements Comparable<Employee> {

    protected String idEmployee;
    protected String nameEmployee;
    protected String surnameEmployee = "surname";
    protected String salaryEmployee = "20000";
    protected String currencyEmployee = "UAH";
    protected List<Employee> staff = new ArrayList<Employee>();

//    protected Employee(String id, String name, String surname) { // basic 2
//        this.idEmployee = id;
//        this.nameEmployee = name;
//        this.surnameEmployee = surname;
//        this.salaryEmployee = "20000";
//        this.currencyEmployee = "UAH";
//    }

    public Employee(String id, String name, String surname, String salary) { // Full
        this.idEmployee = id;
        this.nameEmployee = name;
        this.surnameEmployee = surname;
        this.salaryEmployee = salary;
        this.currencyEmployee = "UAH";
    }

    public Employee(String id, String name, String surname, String salary, String currency) {
        this.idEmployee = id;
        this.nameEmployee = name;
        this.surnameEmployee = surname;
        this.salaryEmployee = salary;
        this.currencyEmployee = currency;
    }


    public String employeeInfo(int id) {
        return this.idEmployee + "  " + this.nameEmployee + "  " +
                this.surnameEmployee + "  " + this.salaryEmployee + "  " + this.currencyEmployee;
    }

    public String employeeInfo() {
        return this.idEmployee + "  " + this.nameEmployee + "  " +
                this.surnameEmployee + "  " + this.salaryEmployee + "  " + this.currencyEmployee;
    }

    public String getIdEmployee() {
        return this.idEmployee;
    }

    public String getNameEmployee(){
        return this.nameEmployee;
    }

    @Override
    public String getCurrency() {
        return this.currencyEmployee;
    }

    public String getSalary() {
        return this.salaryEmployee;
    }

    public Employee changeTitleEmployee(int idEmployee, int[] subordinates) {
        return new Manager(Integer.toString(idEmployee), this.nameEmployee, this.surnameEmployee,
                this.salaryEmployee, this.currencyEmployee, subordinates);
    }

    @Override
    public int compareTo(Employee o) {
        int thisId = Integer.parseInt(this.idEmployee);
        int oId = Integer.parseInt(o.idEmployee);
        if (thisId < oId) {
            return -1;
        } else if (thisId == oId) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return employeeInfo();
    }
}

