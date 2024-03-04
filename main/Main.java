package main;
import employee.Employee;

//exceptions
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

//List methods
import java.util.ArrayList;
import java.util.List;

//to input method
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        List<Employee> relationEmployee = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);

            System.out.printf("Informe o numero de funcionarios que deseja registrar: %n");
            int number = sc.nextInt();
            sc.nextLine();

            while (number-- != 0) {
                System.out.printf("Informe respectivamente o nome e o salario %n");
                String name = sc.nextLine();
                double salary = sc.nextDouble();
                sc.nextLine();
                Employee employee = new Employee(name, salary);
                relationEmployee.add(employee);
            }

        } catch (UnsupportedEncodingException | NoSuchAlgorithmException event) {
            event.printStackTrace();
        }

        String[] hashEmployee = relationEmployee.stream().map(Employee::getId).toArray(String[]::new);

        for (String hash: hashEmployee) {
            System.out.println(hash);
        }
    }
}