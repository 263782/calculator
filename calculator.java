import java.util.Scanner;
public class intitled7 {

    public static void main(String[] args) {

        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Het eerste getal?");
        num1 = input.nextInt();

        System.out.println("Het tweede getal?");
        num2 = input.nextInt();

        Scanner op = new Scanner (System.in);

        System.out.println("+ - * of :?");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("Your Answer is "+(num1 + num2));
        }
        else if (operation.equals("-"))
        {
            System.out.println("Je Antwoord is "+(num1 - num2));
        }
        else if (operation.equals("*"))
        {
            System.out.println("Je Antwoord is "+(num1 * num2));
        }
        else if (operation.equals("/"))
        {
            System.out.println("Je Antwoord is "+(num1 / num2));
        }
    }
}
