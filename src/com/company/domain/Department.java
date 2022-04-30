package com.company.domain;

import java.util.Objects;

public class Department {
    private final String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Department))
            return false;
        Department that = (Department) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "Department{" + "name='" + name + '\'' + '}';
    }
}
