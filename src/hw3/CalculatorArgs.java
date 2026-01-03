package hw3;

public class CalculatorArgs {
    public static void main(String[] args) {

        if (args.length != 3) {
//            System.out.println("Invalid number of arguments");
            throw new IllegalArgumentException("Invalid number of arguments");

        }

        String operator = args[1];
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        switch (operator) {
            case "+":
                System.out.println(sum(a, b));
                break;
            case "-":
                System.out.println(sub(a, b));
                break;
            case "x":
                System.out.println(mult(a, b));
                break;
            case "/":
                System.out.println(div(a, b));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

}
