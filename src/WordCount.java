import java.util.Scanner;
public class WordCount {

    public static void main(String[] args) {

        //Accept input from user as a string
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your Sentence/Paragraph");
        String userString = userInput.nextLine();
        int count = 0;
        int backEmpty =0;

        // checking to count the number of empty spaces in the user input

        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == ' ') {
                if (userString.charAt(i) == userString.charAt(i - 1)) {
                    continue;
                } else {
                    count++;
                }
            }
        }

        // After counting the number of empty spaces, add 1 to the number of empty spaces. This will account for the last word since the number of words is one more than the empty spaces
        count++;


        //Counting the number of empty spaces from the back. Break or stop the counting process once the character is not a "full stop" or a white space
       for (int j=(userString.length()-1); j<userString.length();j--){
            if (((userString.charAt(j)=='.')&&(userString.charAt(j-1)==' '))||(userString.charAt(j)==' ')){
                backEmpty++;
            }else {
                break;
            }
        }
       // If the number of empty spaces and full stops from the back is greater than 1, since the program will not count any subsequent empty spaces after a previous empty space, just subtract one from the count variable.
       if (backEmpty>0){
           count-=1;
       }


        System.out.println("There are " + count + " words.");
    }
}
