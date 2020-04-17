package se.lexicon.mark;

import java.util.Scanner;

// Practices:
                public class App { // Create two Strings with your first and last name

                public static void main(String[] args) {


                    String name = "Mark";
                    String lastname = "Andersson";
                    System.out.println(name + " " + lastname);

// Two variables with decimal values, third decimal variable called result, sum of the two first variables to result
                    double num1 = 10.5, num2 = 5.5, result;

                    result = num1 + num2;

                    System.out.println(result);

                    excercise4();
                    excercise5();
                    excercise6();
                    excercise7();

                }


                public static void excercise4() {
                    class Car {  // class called Car with Car brand, registration number, max speed and owner name

                        String CarBrand;
                        String Registration;
                        int MaxSpeed;
                        String OwnerFirstName;
                        String OwnerLastName;

                        public String getInformation() {
                            return OwnerFirstName + " " + OwnerLastName + " " + "Max speed " + MaxSpeed + " " + Registration + " " + CarBrand;

                        }
                    }

                    Car volvo = new Car();

                    volvo.CarBrand = "Volvo";
                    volvo.Registration = "AYM595";
                    volvo.MaxSpeed = 220;
                    volvo.OwnerFirstName = "Mark";
                    volvo.OwnerLastName = "Andersson,";

                    System.out.println(volvo.getInformation());

                }

                public static void excercise5() {

                    System.out.println("hej");


                }

                public static void excercise6() {


                    Scanner input = new Scanner(System.in);

// An integer called score with assigned value to it (Integer Input From the User)

                    System.out.print("Enter an integer: ");
                    int score = input.nextInt();
                    System.out.println("You entered " + score);

                }

                public static void excercise7() {

// Exercises week 1

                    // Print Hello and your name on a separate line
                    System.out.println("Hello");
                    System.out.print("Ali");

                }
            }




    class input { // Calendar program that takes a year as input from user and print if it’s leap year or not

        public static void main(String[] args) {

            excercise8();

        }

        public static void excercise8() {
            Scanner in = new Scanner(System.in);

            System.out.print("Input the year: ");
            int year = in.nextInt();
            // Modulus(%) the remainer operator
            boolean x = (year % 4) == 0;        // Is year divisible by 4?
            boolean y = (year % 100) != 0;      // Is year divisible by 100?
            boolean z = ((year % 100 == 0) && (year % 400 == 0));  // is year divisible by 400?

            if (x && (y || z)) {  // sant if x är sann och y eller z är sann
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }
    /*
    3. Write a Java program to print the sum/multiplication/division and subtraction of two numbers
    Expected result: 45 + 11 = 56 12 * 4 = 48 24 / 6 = 4 55 –12 = 43
     */

    class input2 {  //public class Calculate sum/multiplication/division and subtraction of two numbers.

            public static void main(String[] args) {

                excercise9();

              }

        public static void excercise9() {
            int m, n, opt, add, sub, mul; // Enter any two integers as input m, n.
            double div;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter first number:");
            m = s.nextInt();
            System.out.print("Enter second number:");
            n = s.nextInt();
            while (true) {
                System.out.println("Enter 1 for addition");
                System.out.println("Enter 2 for subtraction");
                System.out.println("Enter 3 for multiplication");
                System.out.println("Enter 4 for division");
                System.out.println("Enter 5 to Exit");
                opt = s.nextInt();
                switch (opt) {
                    case 1:
                        add = m + n;
                        System.out.println("Result:" + add);
                        break;

                    case 2:
                        sub = m - n;
                        System.out.println("Result:" + sub);
                        break;

                    case 3:
                        mul = m * n;
                        System.out.println("Result:" + mul);
                        break;

                    case 4:
                        div = (double) m / n;
                        System.out.println("Result:" + div);
                        break;

                    case 5:
                        System.exit(0);
                }
                break;

            }
        }
    }
// 4. Write a Java program that prints the average of three numbers

        class input3 {  // public class average of three numbers

            public static void main(String[] args) {

                excercise10();


            }

            public static void excercise10() {
                Scanner in = new Scanner(System.in);
                System.out.print("Input the first number: ");
                double x = in.nextDouble();
                System.out.print("Input the second number: ");
                double y = in.nextDouble();
                System.out.print("Input the third number: ");
                double z = in.nextDouble();
                System.out.print("The average value is " + average(x, y, z)+"\n" );

            } // End of main

            public static double average(double x, double y, double z)
            {
                return (x + y + z) / 3;
            }
        } // End of class

// "Uppgift 5"

class input4 {  // Program that asks you to input your name and store it in a variable instead of having fixed name

    public static void main(String[] args) {

        excercise11();



    }

    public static void excercise11() {
        Scanner user_input = new Scanner( System.in ); // Get input name from user
        String first_name;
        System.out.print("Enter your first name: ");
        first_name = user_input.next( );

        String last_name;
        System.out.print("Enter your last name: "); // Get input second name from user
        last_name = user_input.next( );

        String full_name;
        full_name = first_name + " " + last_name;

        System.out.println("Hello " + full_name);
    }
}


// uppgift 6 Create a program that asks user to input two numbers and print the sum/multiplication/division and subtraction of given numbers

class input5 {

    public static void main(String[] args) {

        excercise12();



            } //End main

    public static void excercise12() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double num1 = in.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = in.nextDouble();



        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
} // End class


/* Uppgift 7 Create a program that converts seconds to hours, minutes and seconds
Input seconds: 86399
Expected output: 23:59:59
 */

        class input6 {
                   public static void main(String[] args) {

                       excercise13();



                           } //End main



                           public static void excercise13() {
// program that converts seconds to hours, minutes and seconds.


                               Scanner in = new Scanner(System.in);

                               System.out.print("Input seconds: ");

                               int seconds = in.nextInt();

                               int t1 = seconds % 60;

                               int t2 = seconds / 60;

                               int t3 = t2 % 60; // Resten vid division av t3 med t2. t3 och t2 är heltal.

                               t2 = t2 / 60;

                               System.out.print( t2 + ":" + t3 + ":" + t1);

                               // System.out.print("/n"); // a newline in the text at this point.
                       }
                   } //End class

//8.
class input7 {
    public static void main(String[] args) {

        test8();



       } //End main



    public static void test8() {
        Scanner scan = new Scanner(System.in);

        int guess = 0; // variabel guess får ett värde 0.

        int random;

        int count = 0;

        random = (int) (Math.random() * 500); // kasta om den till heltal då random är double, datorn slumpar ett värde.

        System.out.println("Try to guesse the number between 1 and 500 ");

        while(guess != random) {

            guess = scan.nextInt(); // hämta upp ett värde från användare

            if(guess < 1 || guess > 500) { // När vi hat tagit in ett värde vill vi säga till användare att om värdet är mindre än 1 eller större än 500.

                System.out.println("Number must be between 1 and 500");

            }

            else if(guess < random) {

                System.out.println("The number you guessed is too low");

                count += 1;

            }

            else if (guess > random) {

                System.out.println("The number you guessed is too high");

                count += 1;

            }

        }

        count += 1;

        System.out.println("Correct! You guessed " + count + " times!");
    }
} //End class


// Interating through a two dimensional array
class dimensionalArray {

    public static void main(String[] args) {

        test3();

    }
    public static void test3() {
        int[][] numbers = new int[5][5];
        numbers[0][0] = 1;
        for (int[] array : numbers) {
            int index = 0;
            for (int number : array) {
                System.out.print(number);
                if (index == array.length -1) {
                    System.out.println();
                }
                index++;
            }
        }
    }
}

/*class inputSimon {

    public static void main(String[] args) {
        int letters = 1;

        for (int i = 0; i < letters.lenght; i++) {
            sentnceOfCharArray = sentenceOfCarArray + letters[i];


        }
    }
}



        }

 */

class For_Loop_test {
    public static void main(String[] args) {

    String name = "Marek Kowalski";
    for (int i=0; i<name.length(); i++){
        System.out.print(name.charAt(i));
    }
}
}