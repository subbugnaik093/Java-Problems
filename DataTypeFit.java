import java.util.Scanner;

class DataTypeFit{
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        try{
            System.out.println("Enter the Value");
            double b= sc.nextDouble();
                    System.out.println(b+" can be fitted in");
            if(b>=Short.MIN_VALUE && b<=Short.MAX_VALUE)System.out.println("short");
            if(b>=Byte.MIN_VALUE && b<=Byte.MAX_VALUE)System.out.println("byte");
            if(b>=Integer.MIN_VALUE && b<=Integer.MAX_VALUE)System.out.println("int");
            if(b>=Long.MIN_VALUE && b<=Long.MAX_VALUE)System.out.println("long");
            
}
catch(Exception e){
            System.out.println(sc.next()+"cant be fitted anywhere");
}
    }
}



// Sample Input

// 5
// -150
// 150000
// 1500000000
// 213333333333333333333333333333333333
// -100000000000000
// Sample Output

// -150 can be fitted in:
// * short
// * int
// * long
// 150000 can be fitted in:
// * int
// * long
// 1500000000 can be fitted in:
// * int
// * long
// 213333333333333333333333333333333333 can't be fitted anywhere.
// -100000000000000 can be fitted in:
// * long