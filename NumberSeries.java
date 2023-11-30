import java.util.Scanner;

public class NumberSeries{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);


    System.out.println("Please enter a value");
        int a=sc.nextInt();
        System.out.println("Please enter b value");
        int b=sc.nextInt();
        System.out.println("Please enter n value");
        int n=sc.nextInt();
         printSeries(a,b,n);
    }
    public static void printSeries(int a, int b, int n){
        int j=1;
        int results=a;
        for(int i=1; i<=n; i++){
results+=j*b;
j=j*2;
System.out.print(results+" ");

        }
    }
}



// Sample Input

// 2
// 0 2 10   so a=0 b=2 n=10
// 5 3 5
// Sample Output

// 2 6 14 30 62 126 254 510 1022 2046
// 8 14 26 50 98