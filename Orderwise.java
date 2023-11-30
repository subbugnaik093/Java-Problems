import java.util.Scanner;

class Orderwise{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext() && i<5){
            System.out.println(i+" "+sc.nextLine());
            i++;
        }

    }
}