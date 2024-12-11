import java.util.Scanner;

public class IT24103806Lab5Q3 {

    public static final int DISCOUNT_ONE = 10;  
    public static final int DISCOUNT_TWO = 20;  
    public static final double ROOM_PER_DAY = 48000.00;  

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in); 

        int startDate, endDate, reservedDays, discountRate;
        double total;

        
        System.out.println("Enter start date (1-31): ");
        startDate = inputDevice.nextInt();
        System.out.println("Enter end date (1-31): ");
        endDate = inputDevice.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31.");
            return;
        }

        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        
        reservedDays = endDate - startDate;

        
        if (reservedDays < 3) {
            discountRate = 0;  
        } else if (reservedDays >= 3 && reservedDays < 5) {
            discountRate = DISCOUNT_ONE; 
        } else {
            discountRate = DISCOUNT_TWO;  
        }

        
        total = (ROOM_PER_DAY * reservedDays) - ((ROOM_PER_DAY * reservedDays * discountRate) / 100);

        
        System.out.printf("Room charge per day: Rs %.2f%n", ROOM_PER_DAY);
        System.out.println("Number of days reserved: " + reservedDays);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.printf("Total amount to be paid: Rs %.2f%n", total);
    }
}

