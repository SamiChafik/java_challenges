import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args){
        Float[] num = new Float[10];
        float total = 0f;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 10 numbers");
        for (int i = 0; i < 10; i++){
            System.out.print("→ ");
            num[i] = sc.nextFloat();
            total = total + num[i];
        }
        float av = total/10;
        System.out.println("Total is : "+total);
        System.out.println("Average is : "+av);
    }
}