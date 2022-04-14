/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanksgivingticketsales;
import java.util.Scanner;
/**
 *
 * @author 4800590195
 */
public class ThanksgivingTicketSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Thanksgiving Extravaganza Ticket Sales by Kevin Bell");
        //declare variables
        Scanner computerKeyboardInput = new Scanner(System.in);
        int childrenTickets, adultTickets, seniorTickets, 
                transactionFeePerPerson, totalNumberOfGuests, subTotal, 
                finalTotal, priceOfOneChildTicket, priceOfOneAdultTicket,
                priceOfOneSeniorTicket, transactionFeeSubTotal, 
                moneyGivenTendered, change;
        //prompt user input
        System.out.print("Enter the number of kids ($6) : ");
        childrenTickets = computerKeyboardInput.nextInt();
        System.out.print("Enter the number of adults ($10) : ");
        adultTickets = computerKeyboardInput.nextInt();
        System.out.print("Enter the number of seniors ($8) : ");
        seniorTickets = computerKeyboardInput.nextInt();
        //do the work
        totalNumberOfGuests = childrenTickets + adultTickets + seniorTickets;
        priceOfOneChildTicket = 6;
        priceOfOneAdultTicket = 10;
        priceOfOneSeniorTicket = 8;
        transactionFeePerPerson = 2;
        subTotal = (childrenTickets * priceOfOneChildTicket) +
                (adultTickets * priceOfOneAdultTicket) +
                (seniorTickets * priceOfOneSeniorTicket);
        transactionFeeSubTotal = totalNumberOfGuests * 
                transactionFeePerPerson;
        finalTotal = transactionFeeSubTotal + subTotal;
        //output
        System.out.println("Total number of guests: " + totalNumberOfGuests);
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Transaction fee: $" + transactionFeeSubTotal);
        System.out.println("Final total: $" + finalTotal);
        //prompt user input
        System.out.print("Enter amount of money tendered: $");
        moneyGivenTendered = computerKeyboardInput.nextInt();
        //calculate change to return to user
        change = moneyGivenTendered - finalTotal;
        //output
        System.out.println("Change: $" + change);
        System.out.println();
    }
    
}
