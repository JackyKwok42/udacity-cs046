Course Assessment Part 5 (Intro to Java Programming)

Question 28  Interface Credit Card (there are two java files here)

// This is a slightly modified version of the CreditCard class from an earlier problem set.
//
// Modify the class so that it implements the Comparable interface.
// Remember that the Comparable interface has one method, compareTo,
// which "returns a negative integer, zero, or a positive integer as
// this object is less than, equal to, or greater than the
// specified object."
// 
// CreditCards are compared by their balance.
//
// If this CreditCard has a bigger balance than another CreditCard does,
// then return a positive number.
//
// If this CreditCard has a smaller balance than another CreditCard does,
// then return a negative number.
//
// Otherwise, the two must be equal, so return 0.
//
// TODO: Add the code to make this class implement the Comparable interface.
//
// (Don't worry about checking if the parameter is a credit card. Assume it is a credit card.)

/**
   A credit card has a balance that can be changed by
   purchases and payments.
*/
public class CreditCard implements Comparable
{
   private double balance;

   /**
      Constructs a credit card with a zero balance.
   */
   public CreditCard(double transfer)
   {
      balance = transfer;
   }


   /**
      Makes a payment to  credit card.
      @param amount the amount to pay
   */
   public void payment(double amount)
   {
      balance = balance - amount;
   }

   /**
      Makes a purchase with the credit card
      @param amount the amount of the purchase
   */
   public void purchase(double amount)
   {
      balance = balance + amount;
   }

   /**
      Gets the current balance of the credit card.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }

    public int compareTo(Object otherObject)
    {
        CreditCard otherCreditCard = (CreditCard) otherObject;
        int balance1 = (int)this.getBalance();
        int balance2 = (int)otherCreditCard.getBalance();
        int diff = balance1 - balance2;
        return diff;
    }    
}



====================================================

import java.util.Arrays;
public class CreditCardPrinter
{
   public static void main(String[] args)
   {
       Comparable[] cards = { new CreditCard(1000),
                              new CreditCard(500),
                              new CreditCard(500),
                              new CreditCard(2000),
                              new CreditCard(300)
                            };
       Arrays.sort(cards);

       for (Comparable c : cards)
       {
           CreditCard card = (CreditCard)c;
           System.out.println(card.getBalance());
       }
   }
}
