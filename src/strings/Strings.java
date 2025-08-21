package strings;

public class Strings {

    //The String class has a set of built-in methods that you can use on strings.
    //A few examples were used here to illustrate.

    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseString(String text) {
        for(int i = text.length()-1; i>=0; i--){
            //CharAt returns the character at the specified index
            System.out.println(text.charAt(i));
        }
    }

    public static void reverseStringWithStringBuilder(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            stringBuilder.append(text.charAt(i));
            stringBuilder.reverse();
        }
        System.out.println(stringBuilder);
    }

    public static void toLowerCase(String text) {
        System.out.println("Lower case %d" + text.toLowerCase());
    }

    public static void hasSpecialChars(String text) {
        if (text.matches("[a-zA-Z0-9]*")) {
            System.out.println("Your text does not contain special characters");
        }

        System.out.println("Your text contains special characters");

    }

    public static void isLetterFound(String text) {
        boolean letterFound = false;

        //Search text for letter A. Break will break the loop if the letter is found
        for (int i=0; i<text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        System.out.println("Letter found: "+ letterFound);
    }


}
