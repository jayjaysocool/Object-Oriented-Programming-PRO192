package utils;

import java.util.Scanner;

public class MyToys {

    private static Scanner sc = new Scanner(System.in);

    public static int getInteger(String msg, String errorMsg) {
        int input;
        while (true) {
            try {
                System.out.print(msg);
                input = Integer.parseInt(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.err.println(errorMsg);
            }
        }
    }

    public static int getInteger(String msg, String errorMsg, int lowerBound, int upperBound) {
        int input;
        if (lowerBound > upperBound) {
            int tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(msg);
                input = Integer.parseInt(sc.nextLine());
                if (input < lowerBound || input > upperBound) {
                    throw new Exception();
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.err.println(errorMsg);
            }
        }

    }

    public static double getDouble(String msg, String errorMsg) {
        double input;
        while (true) {
            try {
                System.out.print(msg);
                input = Double.parseDouble(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.err.println(errorMsg);
            }
        }
    }

    public static double getDouble(String msg, String errorMsg, double lowerBound, double upperBound) {
        double input;
        if (lowerBound > upperBound) {
            double tmp = lowerBound;
            lowerBound = upperBound;
            upperBound = tmp;
        }
        while (true) {
            try {
                System.out.print(msg);
                input = Double.parseDouble(sc.nextLine());
                if (input < lowerBound || input > upperBound) {
                    throw new Exception();
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.err.println(errorMsg);
            }
        }
    }

    public static String getString(String msg, String errorMsg) {
        String input;
        while (true) {
            System.out.print(msg);
            input = sc.nextLine().trim();
            if (input.isEmpty() || input.length() == 0) {
                System.err.println(errorMsg);
            } else {
                return input;
            }

        }
    }

    public static String getString(String msg, String errorMsg, String format) {
        String input;
        boolean match;
        while (true) {
            System.out.print(msg);
            input = sc.nextLine().trim();
            match = input.matches(format);
            if (input.isEmpty() || input.length() == 0 || match == false) {
                System.err.println(errorMsg);
            } else {
                return input;
            }

        }
    }
}
