package ru.geekbrains.ntr_0105;

public class Employee {
    private String fullName;
    private String position;
    private String eMail;
    private String phoneNumber;
    private float salary;
    private int age;

    public Employee(String fullName, String position, String eMail, String phoneNumber, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ФИО: " + fullName).append("\n");
        sb.append("Должность: " + position).append("\n");
        sb.append("Email: " + eMail).append("\n");
        sb.append("Номер телефона: " + phoneNumber).append("\n");
        sb.append("Зарплата: " + salary).append("\n");
        sb.append("Возраст: " + age).append("\n");
        return sb.toString();
    }

    public void print() {
        System.out.println(this);
    }
}
