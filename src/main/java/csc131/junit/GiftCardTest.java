package csc131.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class GiftCardTest
{
 @Test
 public void getIssuingStore()
 {
 double balance;
 GiftCard card;
 int issuingStore;

 issuingStore = 1337;
 balance = 100.00;
 card = new GiftCard(issuingStore, balance);
 assertEquals("getIssuingStore()",
 issuingStore, card.getIssuingStore());
 }
 
 @Test
 public void getBalance()
 {
	 double balance;
	 GiftCard card;
	 int issuingStore;
	 double tolerance;
	 
	 tolerance = 0.001;
	 issuingStore = 1337;
	 balance = 100.00;
	 card = new GiftCard(issuingStore, balance);
	 assertEquals("getBalance()", balance, card.getBalance(), tolerance);
 }
 
 @Test
 public void deduct()
 {
	 double balance;
	 GiftCard card;
	 int issuingStore;
	 double num;
	 
	 issuingStore = 1337;
	 balance = 100.00;
	 num = 40.50;
	 String result1 = "Remaining Balance:  59.50";
	 card = new GiftCard(issuingStore, balance);
	 assertEquals("deduct()", result1, card.deduct(num));
 }
 
}