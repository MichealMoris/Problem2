import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Problem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = input.next();
        int usernameLength = username.toLowerCase().trim().length();

        if (usernameLength <= 100 && !username.isEmpty()){

            determineEvenOrOdd(distinctCharactersCounter(username));

        }else {

            System.out.println("Out Of Range!!");

        }


    }

    public static int distinctCharactersCounter(String word){

        Set<Character> characters = new HashSet<>();

       for (char c: word.toLowerCase().toCharArray()){

           characters.add(c);

       }

       return characters.size();

    }

    public static void determineEvenOrOdd(int num){

        if (num % 2 == 0){

            System.out.println("CHAT WITH HER!");

        }else {

            System.out.println("IGNORE HIM!");

        }

    }

}
