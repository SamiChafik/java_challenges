import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args){
        int[] num = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 numbers");

        for (int i = 0; i < 8; i++){
            System.out.print("→ ");
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search for : ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 8; i++){
            if (search == num[i]) {
                System.out.println("Number found and its position is : "+i);
                found = true;
            }
        }

        if (!found){
            System.out.println("number not found");
        }
    }
}
