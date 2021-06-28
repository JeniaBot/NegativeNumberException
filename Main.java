import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double value;

        try {
            value=scanner.nextDouble();


            if (value<0)
                throw new NegativeNumberException(value);
        }
        catch (NegativeNumberException e) {

            System.out.println(e);
        }
    }
}
