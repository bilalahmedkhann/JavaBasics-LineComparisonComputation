import java.util.Scanner;

public class LineComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        int x1;
        int x2;
        int y1;
        int y2;
        double length_of_line;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point :");
        x1 = sc.nextInt();
        System.out.println("Enter x2 point :");
        x2 = sc.nextInt();
        System.out.println("Enter y1 point :");
        y1 = sc.nextInt();
        System.out.println("Enter y2 point :");
        y2 = sc.nextInt();
        length_of_line = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length between points "+"("+x1+","+y1+")&"+"("+x2+","+y2+")===>"+length_of_line);
    }
}
