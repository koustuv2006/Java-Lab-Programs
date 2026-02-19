import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("\nChoose Operation:");
        System.out.println("1. Change Case");
        System.out.println("2. Reverse String");
        System.out.println("3. Compare Two Strings");
        System.out.println("4. Insert One String into Another");
        System.out.println("5. Convert to Uppercase & Lowercase");
        System.out.println("6. Check Character Position");
        System.out.println("7. Check Palindrome");
        System.out.println("8. Count Words, Vowels, Consonants");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch(choice) {

            case 1:
                String changed = "";
                for(char ch : str.toCharArray()) {
                    if(Character.isUpperCase(ch))
                        changed += Character.toLowerCase(ch);
                    else
                        changed += Character.toUpperCase(ch);
                }
                System.out.println("After changing case: " + changed);
                break;

            case 2:
                String reversed = new StringBuilder(str).reverse().toString();
                System.out.println("Reversed String: " + reversed);
                break;

            case 3:
                System.out.print("Enter second string: ");
                String str2 = sc.nextLine();
                int min = Math.min(str.length(), str2.length());
                int diff = 0;
                for(int i = 0; i < min; i++) {
                    if(str.charAt(i) != str2.charAt(i)) {
                        diff = Math.abs(str.charAt(i) - str2.charAt(i));
                        break;
                    }
                }
                System.out.println("Difference between ASCII values: " + diff);
                break;

            case 4:
                System.out.print("Enter string to insert: ");
                String insert = sc.nextLine();
                System.out.print("Enter position: ");
                int pos = sc.nextInt();
                String result = str.substring(0, pos) + insert + str.substring(pos);
                System.out.println("After insertion: " + result);
                break;

            case 5:
                System.out.println("Uppercase: " + str.toUpperCase());
                System.out.println("Lowercase: " + str.toLowerCase());
                break;

            case 6:
                System.out.print("Enter character: ");
                char ch = sc.next().charAt(0);
                int index = str.indexOf(ch);
                if(index != -1)
                    System.out.println("Position of character: " + (index + 1));
                else
                    System.out.println("Character not present");
                break;

            case 7:
                String rev = new StringBuilder(str).reverse().toString();
                if(str.equalsIgnoreCase(rev))
                    System.out.println("String is palindrome");
                else
                    System.out.println("String is not palindrome");
                break;

            case 8:
                int words = str.trim().split("\\s+").length;
                int vowels = 0, consonants = 0;

                for(char c : str.toLowerCase().toCharArray()) {
                    if(Character.isLetter(c)) {
                        if("aeiou".indexOf(c) != -1)
                            vowels++;
                        else
                            consonants++;
                    }
                }

                System.out.println("No. of words: " + words);
                System.out.println("No. of vowels: " + vowels);
                System.out.println("No. of consonants: " + consonants);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

