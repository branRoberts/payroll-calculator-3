package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            String regex = "\\|";
            String filename = "employees.csv";

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));



            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(regex);
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                double hours = Double.parseDouble(fields[2].trim());
                double payrate = Double.parseDouble(fields[3].trim());

                Employee employee = new Employee(id,name,hours,payrate);
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);

                }

            }

        }catch (Exception e){
            System.out.println("Error Reading File");
        }

    }
}
