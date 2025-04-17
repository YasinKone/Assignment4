import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        String word;
        int wordLength;
        
        
        System.out.print("Say something: ");
        
        word = scanner.nextLine();

        wordLength = word.length();

        for(int i = wordLength - 1; i >= 0; i--){

            System.out.print(word.charAt(i));
        }

        


        scanner.close();
    }
}
