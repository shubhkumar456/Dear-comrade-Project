package com.example.Dear.comrade.Project.models;

public class Employeee {

    String name;
    int id;
    double income;

    public Employeee(String name, int id, double income) {
        this.name = name;
        this.id = id;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
