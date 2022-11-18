import java.util.Scanner;
class LineComparisonComputation {
    public static void main(String[] arg) {
        // Declaration Part
        int x1;
        int x2;
        int y1;
        int y2;
        int a1;
        int a2;
        int b1;
        int b2;
        double lengthOfLine1;
        double lengthOfLine2;
        // Get the input x1,y1,x2,y2,a1,a2,b1,b2 from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 point :");
        x1 = sc.nextInt();
        System.out.println("Enter y1 point :");
        y1 = sc.nextInt();
        System.out.println("Enter x2 point :");
        x2 = sc.nextInt();
        System.out.println("Enter y2 point :");
        y2 = sc.nextInt();
        System.out.println("Enter a1 point :");
        a1 = sc.nextInt();
        System.out.println("Enter b1 point :");
        b1 = sc.nextInt();
        System.out.println("Enter a2 point :");
        a2 = sc.nextInt();
        System.out.println("Enter b2 point :");
        b2 = sc.nextInt();

        lengthOfLine2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Length between " + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ")===>" + lengthOfLine2);
        lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length between " + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + lengthOfLine1);

        if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("Line1 is greater than Line2");
        } else if (lengthOfLine1 < lengthOfLine2) {
            System.out.println("Line2 is greater than Line1 ");
        } else
            System.out.println("Both Lines are Equals");
    }
}