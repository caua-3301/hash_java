package employee;

import hashAndCripto.Cripto;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee(String name, double salary) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        try {
            this.name = name;
            this.id = Cripto.setHashCode(name);
            this.salary = salary;
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException event) {
            event.printStackTrace();
        }
    }

    public void increaseSalary(double XPercent) {
        salary += salary*XPercent;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
