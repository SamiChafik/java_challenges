import java.util.Scanner;
class Challenge1 {

    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.print("→ ");
            num[i] = sc.nextInt();
        }

        for (int i = 4; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}