
// THIS IS JAVA CODE TO GENERATE RANDOM PASSWORD 

import java.util.Random;

public class RANDOMPASSGENERATOR{
    // private static Random random = new Random();
    static String PasswordGen() {
        Random random = new Random();

        char[] charArray = new char[15];
        for (int i = 0; i < 15; i++) {
            int rand = random.nextInt(58) + 65;
            charArray[i] = (char) rand;
            // continue;

        }

        // return CharArray;
        String str = new String(charArray);
        return str;
    }

    public static void main(String[] args) {

        String password = PasswordGen();
        System.out.println(password);
        // THIS FUNCTION WILL CREATE 15 DIGIT RANDOM PASSWORD

    }

}
