package academy.learnprogramming;

public class Main {
        // Table for 25
    public static void main(String[] args) {
	    int firstNumber = 25;
	    for (int Multiplier=1;Multiplier<=10;Multiplier++)
        { System.out.println( firstNumber + "*" + Multiplier + "=" + firstNumber*Multiplier);
    }
	    // Table for 30
        int secondNumber = 30;
        for (int Multiplier=1;Multiplier<=10;Multiplier++)
        { System.out.println( secondNumber + "*" + Multiplier + "=" + secondNumber*Multiplier);
        }

        // Division

        int denomNumber = 20;
        int numerNumber = 4;
        System.out.println(denomNumber + " value divided by" +" " + numerNumber + " and the remainder is" +" "+ "=" +" "+ denomNumber/numerNumber);

        // Vaccine Message

        int yourAge = 18;
        if (yourAge <= 18)
        {
            System.out.println("You should use Pfizer-BioNTech vaccine");
        }

         else {
            System.out.println("You should use Sinopharm-BBIBP vaccine");
        }


    }

}
