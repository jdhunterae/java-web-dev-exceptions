package org.launchcode.exercises;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            String fileName = studentFiles.get(student);
            
            System.out.printf("%s : %s\n\t%d points\n",
                    student, fileName, CheckFileExtension(fileName));
        }
    }

    public static double Divide(int x, int y) {
        double result = 0.0;

        try {
            result = 1.0 * x / y;
        } catch (Exception e) {
            System.out.println("Error: Cannot divide by zero");
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return result;
    }

    public static int CheckFileExtension(String fileName) {
        try {
            if (fileName == null || fileName.length() == 0) {
                throw new NullPointerException("Filename required.");
            }

            String[] parts = fileName.split("\\.");
            String extension = parts[parts.length - 1].toLowerCase();

            if (extension.equals("java")) {
                return 1;
            } else {
                return 0;
            }
        } catch (NullPointerException e) {
            System.out.println("Error: cannot grade file when no file name is provided.");
            return -1;
        }
    }
}
