package utils;

import java.util.Scanner;

public class MyToys {

    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger(String msg, String errorMsg) {
        int input;
        while (true) {
            try {
                System.out.print(msg);
                input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException ex) {
                System.out.println(errorMsg);
            }
        }
    }

    public static int getAnInteger(String msg, String errorMsg,
            int lowerBound, int upperBound) {
        int input, tmp;
        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(msg);
                input = Integer.parseInt(sc.nextLine());
                if (input > upperBound || input < lowerBound) {
                    throw new Exception();
                }
                return input;
            } catch (Exception ex) {
                System.out.println(errorMsg);
            }
        }
    }

    public static double getAnDouble(String msg, String errorMsg) {
        double input;
        while (true) {
            try {
                System.out.print(msg);
                input = Double.parseDouble(sc.nextLine());
                return input;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static double getAnDouble(String msg, String errorMsg,
            double lowerBound, double upperBound) {
        Double input, tmp;
        if (lowerBound > upperBound) {
            tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(msg);
                input = Double.parseDouble(sc.nextLine());
                if (input < lowerBound || input > upperBound) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static String getAString(String msg, String errorMsg) {
        String input;
        while (true) {
            System.out.print(msg);
            input = sc.nextLine().trim();
            if (input.length() == 0 || input.isEmpty()) {
                System.out.println(errorMsg);
            } else {
                return input;
            }
        }
    }

    public static String getID(String msg, String errorMsg, String format) {

        String input;
        boolean match;

        while (true) {
            System.out.print(msg);
            input = sc.nextLine().trim().toUpperCase();
            match = input.matches(format);
            if (input.length() == 0 || input.isEmpty() || match == false) {
                System.out.println(errorMsg);
            } else {
                return input;
            }
        }
    }
}
