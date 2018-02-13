import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        String userHex;
        Scanner scnr = new Scanner(System.in);
        String A;
        String B;
        String C;
        String D;
        String E;
        long decimal=0;
        double power;


        System.out.println("Enter a hexadecimal number: ");
        userHex = scnr.next();


        if (userHex.contains("0x"))
            userHex = userHex.substring(2, userHex.length());


            power = userHex.length() - 1;
            int counter = 0;
            while (counter < userHex.length())


        {
                if (userHex.charAt(counter) == 'A'|| userHex.charAt(counter) == 'a') { decimal += 10 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == 'B' || userHex.charAt(counter) == 'b' ) { decimal += 11 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == 'C'|| userHex.charAt(counter) == 'c') { decimal += 12 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == 'D'|| userHex.charAt(counter) == 'd') { decimal += 13 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == 'E'|| userHex.charAt(counter) == 'e') { decimal += 14 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == 'F'|| userHex.charAt(counter) == 'f') { decimal += 15 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '1') { decimal += 1 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '2') { decimal += 2 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '3') { decimal += 3 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '4') { decimal += 4 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '5') { decimal += 5 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '6') { decimal += 6 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '7') { decimal += 7 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '8') { decimal += 8 * Math.pow(16,power);}
                else if (userHex.charAt(counter) == '9') { decimal += 9 * Math.pow(16,power);}


                counter +=1;
                power= power-1;

                }






                System.out.println("Your number is " + decimal + " in decimal");

    }

}
