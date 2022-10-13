import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main10{
    public static void main (String[] args) {
                      // Your code here
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int add=(a+b);
    int dob=(2*add);
    int eve=(b+dob);
    int hlf=(eve/2);
    int addd2=(hlf-b);
    System.out.println(addd2);

    }
}