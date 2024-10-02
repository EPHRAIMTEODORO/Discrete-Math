import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner to STDIN
        var s = new Scanner(System.in);

        s.next();  // Read and discard the next token
        double S1 = s.nextDouble();  // Read the first double value
        s.next();  // Read and discard the next token
        double S2 = s.nextDouble();  // Read the second double value
        s.next();  // Read and discard the next token
        double c1 = s.nextDouble();  // Read the third double value
        s.next();  // Read and discard the next token
        double c2 = s.nextDouble();  // Read the fourth double value

        // Solving roots using quadratic equation
        double r1 = (c1 + Math.sqrt(Math.pow(c1, 2) + 4 * c2)) / 2;
        double r2 = (c1 - Math.sqrt(Math.pow(c1, 2) + 4 * c2)) / 2;

        double p = 0, q = 0;  // Declare p and q outside the if-else block
        //Special Case where r1==r2
        if (r1 == r2) {
            p = S1;
            q = (S2 - p * r1) / r1;
        } else {
            p = (S2 - (S1 * r2)) / (r1 - r2);
            q = S1 - p;
        }



        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("S(n) = "+"("+p+")("+r1+")^(n-1)+("+q+")("+r2+")^(n-1)");
        System.out.println("S(1) = "+S1);
        System.out.println("S(2) = "+S2);
        for(int n=3;n<=10;n++){
            //Equation for solving the value of S(n)
            double Sn = (p*(Math.pow(r1,n-1)))+(q*(Math.pow(r2,n-1)));
            System.out.println("S("+n+")= "+Sn);

        }



        s.close();  // Close the Scanner

    }
}
