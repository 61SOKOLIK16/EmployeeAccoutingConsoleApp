package com.company.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final Position position;
    private final Department department;

    public Employee(String firstName, String lastName, LocalDate birthDate, Position position, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.position = position;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return getFirstName().equals(employee.getFirstName()) && getLastName().equals(employee.getLastName())
                && getBirthDate().equals(employee.getBirthDate()) && getPosition() == employee.getPosition()
                && getDepartment().equals(employee.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getBirthDate(), getPosition(), getDepartment());
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", birthDate="
                + birthDate + ", position=" + position + ", department=" + department + '}';
    }

}
