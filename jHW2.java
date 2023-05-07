
public class jHW2 {
    public static void main(String[] args) {
        double num1 = 7.5;
        double num2 = 2.5;

        System.out.println("Результат при сложении: " + add(num1, num2));
        System.out.println("Результат при вычитании: " + subtract(num1, num2));
        System.out.println("Результат при умножении: " + multiply(num1, num2));
        System.out.println("Результат при делении: " + divide(num1, num2));
    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {return num1 - num2;}
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2)  {
        return num1 / num2;
    }
}
