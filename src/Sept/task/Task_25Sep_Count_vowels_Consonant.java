package Sept.task;
import java.util.Scanner;
public class Task_25Sep_Count_vowels_Consonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String Name = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        Name=Name.toLowerCase();

        for (int i = 0; i < Name.length(); i++) {
            char ch = Name.charAt(i);

            if (ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                vowels++;

            } else {if( ch>='a' && ch<='z')
                consonants++;

            }

        }
        System.out.println("Count of Vowel in a string is " + vowels);
        System.out.println("Count of Consonants in a string is " + consonants );

    }
}