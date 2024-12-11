import java.util.Scanner;

public class IT24103806Lab5Q2 {
    public static void main(String[] args) {
        Scanner Bank = new Scanner(System.in);

        
        System.out.println("Enter how many members:");
        int newMem = Bank.nextInt();

        if (newMem < 0) {
            System.out.println("Invalid number");
        } else {
            String prize;

            
            switch (newMem) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
            }

            
            System.out.println("You are entitled to: " + prize);
        }

        
        Bank.close();
    }
}
