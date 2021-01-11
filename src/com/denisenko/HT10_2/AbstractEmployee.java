package com.denisenko.HT10_2;

public abstract class AbstractEmployee implements Staff {

    protected String employeeInfo;
    protected Manager changeTitleEmployee;
    protected int[] getManagerInfo;


    public String employeeInfo(int id) {
        return employeeInfo;
    }

    public Employee changeTitleEmployee(int idEmployee, int[] subordinates) {
        return changeTitleEmployee;
    }

    public int[] getManagerInfo(int id) {
        return getManagerInfo;
    }



}

