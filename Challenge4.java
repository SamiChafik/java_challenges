import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
//        char[] c = new char[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 5 characters");
//        for (int i = 0; i < 5; i++){
//            System.out.print("→ ");
//            c[i] = sc.next().charAt(0);
//        }
//        System.out.print("Enter the character you want to search for : ");
//        char ch = sc.next().charAt(0);
//        boolean found = false;
//        for (int i = 0; i < 5; i++){
//            if (c[i] == ch){
//                found = true;
//                System.out.println("Character found and its position is "+i);
//            }
//        }
//        if (!found){
//            System.out.println("Character not found");
//        }
        String[] word = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 words");
        for (int i = 0; i < 5; i++){
            System.out.print("Word "+(i+1)+" : ");
            word[i] = sc.nextLine();
        }
        System.out.print("Enter the word you want to search for : ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < 5; i++){
            if(search.equalsIgnoreCase(word[i])){
                System.out.println("Word found and its position is "+i);
            }
        }
        if (!found){
            System.out.println("Word not found !");
        }
    }
}
