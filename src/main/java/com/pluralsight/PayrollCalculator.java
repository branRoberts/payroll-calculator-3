package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            String regex = "\\|";

            FileReader file = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(file);



            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(regex);
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                double hours = Double.parseDouble(fields[2].trim());
                double salary = Double.parseDouble(fields[3].trim());

                Employee employee = new Employee(id,name,hours,salary);
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);

                }

            }

        }catch (Exception e){
            System.out.println("Invalid input");
        }

    }
}
