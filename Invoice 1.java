import java.util.Scanner;

public class Invoice {

    public static void main(String[] args) {
        final double DISCOUNT_RATE = 0.006368;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bill to Information");
        System.out.print("Enter Supermarket Name: ");
        String supermarketName = scanner.nextLine();

        System.out.print("Enter Address Line 1: ");
        String addressLine1 = scanner.nextLine();

        System.out.print("Enter Address Line 2: ");
        String addressLine2 = scanner.nextLine();

        System.out.print("Enter GSTIN: ");
        String gstin = scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("\nEnter Product Information");
        // Product 1
        System.out.print("Product 1 Name: ");
        String p1Name = scanner.nextLine();
        System.out.print("Product 1 Product Code: ");
        int p1Code = scanner.nextInt();
        System.out.print("Product 1 HSN code: ");
        long p1HSN = scanner.nextLong();
        System.out.print("Product 1 Quantity: ");
        int p1Qty = scanner.nextInt();
        System.out.print("Product 1 Rate: ");
        double p1Rate = scanner.nextDouble();
        System.out.print("Product 1 Tax %: ");
        double p1TaxRate = scanner.nextDouble() / 100.0;

        scanner.nextLine();

        // Product 2
        System.out.print("Product 2 Name : ");
        String p2Name = scanner.nextLine();
        System.out.print("Product 2 Product Code: ");
        int p2Code = scanner.nextInt();
        System.out.print("Product 2 HSN code: ");
        long p2HSN = scanner.nextLong();
        System.out.print("Product 2 Quantity: ");
        int p2Qty = scanner.nextInt();
        System.out.print("Product 2 Rate: ");
        double p2Rate = scanner.nextDouble();
        System.out.print("Product 2 Tax %: ");
        double p2TaxRate = scanner.nextDouble() / 100.0;

        scanner.nextLine();

        // Product 3
        System.out.print("Product 3 Name: ");
        String p3Name = scanner.nextLine();
        System.out.print("Product 3 Product Code: ");
        int p3Code = scanner.nextInt();
        System.out.print("Product 3 HSN code: ");
        long p3HSN = scanner.nextLong();
        System.out.print("Product 3 Quantity: ");
        int p3Qty = scanner.nextInt();
        System.out.print("Product 3 Rate: ");
        double p3Rate = scanner.nextDouble();
        System.out.print("Product 3 Tax %: ");
        double p3TaxRate = scanner.nextDouble() / 100.0;

        scanner.nextLine();

        // Product 4
        System.out.print("Product 4 Name: ");
        String p4Name = scanner.nextLine();
        System.out.print("Product 4 Product Code: ");
        int p4Code = scanner.nextInt();
        System.out.print("Product 4 HSN code: ");
        long p4HSN = scanner.nextLong();
        System.out.print("Product 4 Quantity: ");
        int p4Qty = scanner.nextInt();
        System.out.print("Product 4 Rate: ");
        double p4Rate = scanner.nextDouble();
        System.out.print("Product 4 Tax %: ");
        double p4TaxRate = scanner.nextDouble() / 100.0;

        scanner.nextLine();

        // Product 5
        System.out.print("Product 5 Name: ");
        String p5Name = scanner.nextLine();
        System.out.print("Product 5 Product Code: ");
        int p5Code = scanner.nextInt();
        System.out.print("Product 5 HSN code: ");
        long p5HSN = scanner.nextLong();
        System.out.print("Product 5 Quantity: ");
        int p5Qty = scanner.nextInt();
        System.out.print("Product 5 Rate: ");
        double p5Rate = scanner.nextDouble();
        System.out.print("Product 5 Tax %: ");
        double p5TaxRate = scanner.nextDouble() / 100.0;

        scanner.nextLine();

        // Product 6
        System.out.print("Product 6 Name: ");
        String p6Name = scanner.nextLine();
        System.out.print("Product 6 Product Code: ");
        int p6Code = scanner.nextInt();
        System.out.print("Product 6 HSN code: ");
        long p6HSN = scanner.nextLong();
        System.out.print("Product 6 Quantity: ");
        int p6Qty = scanner.nextInt();
        System.out.print("Product 6 Rate: ");
        double p6Rate = scanner.nextDouble();
        System.out.print("Product 6 Tax %: ");
        double p6TaxRate = scanner.nextDouble() / 100.0;

        scanner.nextLine();

        // Product 7
        System.out.print("Product 7 Name: ");
        String p7Name = scanner.nextLine();
        System.out.print("Product 7 Product Code: ");
        int p7Code = scanner.nextInt();
        System.out.print("Product 7 HSN code: ");
        long p7HSN = scanner.nextLong();
        System.out.print("Product 7 Quantity: ");
        int p7Qty = scanner.nextInt();
        System.out.print("Product 7 Rate: ");
        double p7Rate = scanner.nextDouble();
        System.out.print("Product 7 Tax %: ");
        double p7TaxRate = scanner.nextDouble() / 100.0;

        scanner.close();

        // Calculations
        double p1BaseAmount = p1Qty * p1Rate;
        double p1Tax = p1BaseAmount * p1TaxRate;
        double p1TotalAmount = p1BaseAmount + p1Tax;

        double p2BaseAmount = p2Qty * p2Rate;
        double p2Tax = p2BaseAmount * p2TaxRate;
        double p2TotalAmount = p2BaseAmount + p2Tax;

        double p3BaseAmount = p3Qty * p3Rate;
        double p3Tax = p3BaseAmount * p3TaxRate;
        double p3TotalAmount = p3BaseAmount + p3Tax;

        double p4BaseAmount = p4Qty * p4Rate;
        double p4Tax = p4BaseAmount * p4TaxRate;
        double p4TotalAmount = p4BaseAmount + p4Tax;

        double p5BaseAmount = p5Qty * p5Rate;
        double p5Tax = p5BaseAmount * p5TaxRate;
        double p5TotalAmount = p5BaseAmount + p5Tax;

        double p6BaseAmount = p6Qty * p6Rate;
        double p6Tax = p6BaseAmount * p6TaxRate;
        double p6TotalAmount = p6BaseAmount + p6Tax;

        double p7BaseAmount = p7Qty * p7Rate;
        double p7Tax = p7BaseAmount * p7TaxRate;
        double p7TotalAmount = p7BaseAmount + p7Tax;

        double totalAmount = p1TotalAmount + p2TotalAmount + p3TotalAmount + p4TotalAmount + p5TotalAmount + p6TotalAmount + p7TotalAmount;

        double discountValue = totalAmount * DISCOUNT_RATE;

        double grandTotal = totalAmount - discountValue;

        // Output Formatting
        String headerFormat = "| %-4s | %-12s | %-25s | %-10s | %-8s | %-4s | %-8s | %-5s | %-10s|%n";
        String rowFormat = "| %-4d | %-12d | %-25s | %-10d | %-8d | %-4s | %-8.2f | %-5d | %-10.2f |%n";

        System.out.println("\n\n" + "------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-56s   %-58s|%n", "Bill To", "Ship To");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-56s   %-58s|%n", supermarketName, supermarketName);
        System.out.printf("| %-56s   %-58s|%n", addressLine1, addressLine1);
        System.out.printf("| %-56s   %-58s|%n", addressLine2, addressLine2);
        System.out.printf("| %-56s   %-58s|%n", "GSTIN:" + gstin, "GSTIN:" + gstin);
        System.out.printf("| %-56s   %-58s|%n", "Contact: " + contact, "Contact: " + contact);
        System.out.printf("| %-56s   %-58s|%n", "Email: " + email, "Email: " + email);

        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("              %-58s   %-45s%n", "Payment Date: 7 days from date of delivery", "Payment Terms: 100% against invoice");

        System.out.println("+------+--------------+---------------------------+------------+----------+------+----------+-------+------------+");
        System.out.printf(headerFormat, "S.No", "Product Code", "Product Name", "HSN code", "Quantity", "Units", "Rate", "Tax", "Amount");
        System.out.println("+------+--------------+---------------------------+------------+----------+------+----------+-------+------------+");

        System.out.printf(rowFormat, 1, p1Code, p1Name, p1HSN, p1Qty, "nos", p1Rate, (int)(p1TaxRate * 100), p1TotalAmount);
        System.out.printf(rowFormat, 2, p2Code, p2Name, p2HSN, p2Qty, "nos", p2Rate, (int)(p2TaxRate * 100), p2TotalAmount);
        System.out.printf(rowFormat, 3, p3Code, p3Name, p3HSN, p3Qty, "nos", p3Rate, (int)(p3TaxRate * 100), p3TotalAmount);
        System.out.printf(rowFormat, 4, p4Code, p4Name, p4HSN, p4Qty, "nos", p4Rate, (int)(p4TaxRate * 100), p4TotalAmount);
        System.out.printf(rowFormat, 5, p5Code, p5Name, p5HSN, p5Qty, "nos", p5Rate, (int)(p5TaxRate * 100), p5TotalAmount);
        System.out.printf(rowFormat, 6, p6Code, p6Name, p6HSN, p6Qty, "nos", p6Rate, (int)(p6TaxRate * 100), p6TotalAmount);
        System.out.printf(rowFormat, 7, p7Code, p7Name, p7HSN, p7Qty, "nos", p7Rate, (int)(p7TaxRate * 100), p7TotalAmount);

        System.out.println("+------+--------------+---------------------------+------------+----------+------+----------+-------+------------+");

        String footerFormat = "%-86s %-12s | %10.2f%n";

        System.out.printf(footerFormat, "", "Total ", totalAmount);
        System.out.printf(footerFormat, "", "Discounts ", discountValue);
        System.out.printf(footerFormat, "", "Grand total", grandTotal);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }
}