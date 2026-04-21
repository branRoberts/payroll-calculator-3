package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filename = "employees.csv";
        try {
            String regex = "\\|";


            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));



            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] fields = line.split(regex);
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                double hours = Double.parseDouble(fields[2].trim());
                double payrate = Double.parseDouble(fields[3]);

                Employee employee = new Employee(id,name,hours,payrate);

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f",id,name,hours,payrate);
                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);

                }

            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("Error Reading File" + filename);
        }

    }
}
