import java.util.Scanner;
public class CandleShop {
    
    public static void main(String[] args){
        /************* 
         Project 3
         *************/
        //housekeeping*******************

        //candle 1 variables*****

        String name1;
        int candle1Type;
        double price1;
        int burnTime1;

        //candle 2 variables*****

        String name2;
        int candle2Type;
        double price2;
        int burnTime2;

        //candle 3 variables*****

        String name3;
        int candle3Type;
        double price3;
        int burnTime3;
        
        // Shop setup*************************

         Scanner scnr = new Scanner(System.in);

        //candle 1********************
        //asks user for all the info needed for candle object 1 and creates the candle object
         System.out.println("Please enter the name of candle 1.");
         name1 = scnr.nextLine();
         System.out.println("Please enter the candle type for candle 1.");
         System.out.println("Candle type can be entered as 1, 2 or 3 and there can only be one of each.");
         candle1Type = scnr.nextInt();
         scnr.nextLine();
         System.out.println("Please enter the price of candle 1 in dollars.");
         price1 = scnr.nextDouble();
         scnr.nextLine();
         System.out.println("Please enter the burn time in hours of candle 1.");
         burnTime1 = scnr.nextInt();
         scnr.nextLine();
         Candle candle1 = new Candle(name1, candle1Type, price1, burnTime1);

        //candle 2*******************
        //asks user for all the information needed for candle object 2 and creates the candle object
        System.out.println("Please enter the name of candle 2.");
        name2 = scnr.nextLine();
        System.out.println("Please enter the candle type for candle 2");
        System.out.println("Candle type can be entered as 1, 2 or 3 and there can only be one of each.");
        candle2Type = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Please enter the price of candle 2 in dollars.");
        price2 = scnr.nextDouble();
        scnr.nextLine();
        System.out.println("Please enter the burn time in hours of candle 2.");
        burnTime2 = scnr.nextInt();
        scnr.nextLine();
        Candle candle2 = new Candle(name2, candle2Type, price2, burnTime2);

        //candle 3******************
        //asks user for all the information needed for candle object 3 and creates the candle object
        System.out.println("Please enter the name of candle 3.");
        name3 = scnr.nextLine();
        System.out.println("Please enter the candle type for candle 3.");
        System.out.println("Candle type can be entered as 1, 2 or 3 and there can only be one of each.");
        candle3Type = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Please enter the price of candle 3 in dollars.");
        price3 = scnr.nextDouble();
        scnr.nextLine();
        System.out.println("Please enter the burn time in hours of candle 3.");
        burnTime3 = scnr.nextInt();
        scnr.nextLine();
        Candle candle3 = new Candle(name3, candle3Type, price3, burnTime3);
        System.out.println("Shop setup complete.");

        //end of setup***********

        //price**********************************************

        //how many to buy********
        //asks user how many candles of each type they want to purchase
        System.out.println("Please enter the number of " + candle1.getName() + " candles you would like to purchase.");
        int numOfCandle1 = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Please enter the number of " + candle2.getName() + " candles you would like to buy.");
        int numOfCandle2 = scnr.nextInt();
        scnr.nextLine();
        System.out.println("Please enter the number of " + candle3.getName() + " candles you would like to purchase.");
        int numOfCandle3 = scnr.nextInt();
        scnr.nextLine();

        // price calculations****
        // simple math to determine total price
        double totalCandle1Price = (numOfCandle1 * candle1.getCost());
        double totalCandle2Price = (numOfCandle2 * candle2.getCost());
        double totalCandle3Price = (numOfCandle3 * candle3.getCost());
        double totalPrice = (totalCandle1Price + totalCandle2Price + totalCandle3Price);
        double discount;
        double discountedPrice;
        // if else statements to determine what discount to use and also to implement it into the cost
        if (totalPrice > 20 && totalPrice <=35){
            discount = (totalPrice * 0.05);
            discountedPrice = (totalPrice - discount);
        }
        else if (totalPrice > 35 && totalPrice <= 55){
            discount = (totalPrice * 0.07);
            discountedPrice = (totalPrice - discount);
        }
        else if (totalPrice > 55 && totalPrice <= 100){
            discount = (totalPrice * 0.1);
            discountedPrice = (totalPrice - discount);
        }
        else if (totalPrice > 100){
            discount = (totalPrice * 0.2);
            discountedPrice = (totalPrice - discount);
        }
        else {
            discountedPrice = totalPrice;
        }

        //burn time*******************
        //simple math to get total burn time
        int totalBurnTimeCandle1 = (numOfCandle1 * candle1.getTime());
        int totalBurnTimeCandle2 = (numOfCandle2 * candle2.getTime());
        int totalBurnTimeCandle3 = (numOfCandle3 * candle3.getTime());
        int totalBurnTime = (totalBurnTimeCandle1 + totalBurnTimeCandle2 + totalBurnTimeCandle3);

        //cost per minute**************
        //simple math to find cost per minute
        int totalMinutes = (totalBurnTime * 60);
        double costPerMinute = (discountedPrice / totalMinutes);

        // output display*************
        // the for statemnets are used to make the disired histograms after the ouptut statements above them
        System.out.println("Transaction info:");
        System.out.println("Histogram of number purchased: ");
        System.out.print(numOfCandle1 + " type " + candle1.getType() + " (" + candle1.getName() + ") " + "candles purchased: ");
        for (int i = 1; i <= numOfCandle1; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(numOfCandle2 + " type " + candle2.getType() + " (" + candle2.getName() + ") " + "candles purchased: ");
        for (int j = 1; j <= numOfCandle2; j++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(numOfCandle3 + " type " + candle3.getType() + " (" + candle3.getName() + ") " + "candles purchased: ");
        for (int k = 1; k <= numOfCandle3; k++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("Additional info: ");
        System.out.println("The total burn time of all the candles purchased is: " + totalBurnTime + " hours.");
        System.out.println("The total cost of all the candles purchased is: " + totalPrice + "$. the discounted cost is: " + discountedPrice + "$.");
        System.out.println("The cost per minute of burning these candles is: " + costPerMinute + "$.");

        scnr.close();


    }
}
