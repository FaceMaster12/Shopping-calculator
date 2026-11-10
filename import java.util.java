import java.util.Scanner;

class Main{
    public static void main(String[] args){
       Scanner input= new Scanner(System.in);

       String customer;
       int quantity;
       double subTotal=0,discount=0,finalTotal;

       System.out.print("Enter your name :");
       customer=input.nextLine();

       System.out.print("How many different products do you want to purchase? :");
       quantity=input.nextInt();

       String [] productName = new String[quantity];
       int[] productQuantity= new int [quantity];
       double[] productPrice= new double [quantity];
       double[] totalEach= new double [quantity];

       for (int x=0; x < quantity; x++){
           System.out.print("\nEnter a product name: ");
           productName[x]=input.next();

            System.out.print("Enter a product quantity: ");
            productQuantity[x]=input.nextInt();

            System.out.print("Enter a product price: R");
           productPrice[x]=input.nextDouble();
           System.out.print("\n");

           totalEach[x] += productPrice[x]*productQuantity[x];

        subTotal+=totalEach[x];
       }



        if ( subTotal >= 1000)
        {
            discount= subTotal*0.10;
        }

        finalTotal=subTotal - discount;


        System.out.print("\n========== SHOPPING RECEIPT ==========\n");
        System.out.printf("Customer: %s%n%n", customer);
        System.out.printf("%-15s %8s %12s %12s%n",
                "Product", "Quantity", "Price", "Total");
        System.out.println("-----------------------------------------------");

       for(int x=0; x < quantity;x++){
        System.out.printf("%-15s %8d R%10.2f R%10.2f%n",productName[x],
        productQuantity[x],
        productPrice[x],
        totalEach[x]);

       }
        System.out.println("--------------------------------------");
        System.out.printf("Subtotal: R%5.2f  %n",subTotal);
        System.out.printf("Discount (10%%): R%5.2f %n",discount);
        System.out.printf("Final total:t R%5.2f %n", finalTotal);
        System.out.print("======================================");
    }
}
