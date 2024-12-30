import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args){
        int[] num = new int[7];

        System.out.println("enter 7 numbers");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++){
            System.out.print("→ ");
            num[i] = sc.nextInt();
        }

        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++){
            if (num[i] < min){
                min = num[i];
            }
            if (num[i] > max){
                max = num[i];
            }
        }

        System.out.println("the biggest number is : "+max);
        System.out.println("the smallest number is : "+min);
    }
}
