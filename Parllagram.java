import java.util.Scanner;
class Parllagram{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Breadth");
        int Breadth=sc.nextInt();
        System.out.println("Enter the height");
        int Height=sc.nextInt();
        try{
            if(Breadth<=0 || Height <=0){
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }
            int result=Breadth*Height;
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }

    }
}