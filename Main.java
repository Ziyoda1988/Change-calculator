class Main {
  public static void main(String[] args) {
    
java.util.Scanner sc = new java.util.Scanner(System.in);
				
	System.out.println("Please enter the amount: (e.g. 23.89) ");
		
	double  amount = sc.nextDouble();
    amount = amount * 100;
    int dollar = (int)amount /100;
    amount = amount % 100;
    System.out.println( dollar + 
 " Dollars ");
    
    int quarters = (int) amount /25;
    amount = amount % 25;
    System.out.println( quarters + 
 " Quarters ");

    int dimes = (int) amount / 10;
    amount = amount % 10;
    System.out.println( dimes + 
 " Dimes ");

    int nickels = (int) amount / 5;
    amount = amount % 5;
    System.out.println( nickels + 
 " Nickels ");

    int penny = (int) amount / 1;
    amount = amount % 1;
     System.out.println( penny + 
 " Pennies ");
     

    

  // DON'T CHANGE THE ABOVE CODE. 
  // Code to get user input has been written for you. Use the "amount" variable initialized above.
  


  }
}