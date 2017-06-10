package pl.lodz.uni.math;

import java.util.ArrayList;
import java.util.List;


public class Client {
   private String firstName;
   private String lastName;
   private String city;
   private String street;
   private String phone;
   private List<Account> accounts = new ArrayList<Account>();

   
   public Client(String clientFirstName, String clientLastName, String clientCity, String clientStreet, String clientPhone) {
      firstName = clientFirstName;
      lastName = clientLastName;
      city = clientCity;
      street = clientStreet;
      phone = clientPhone;
   }

   
   public Account makeAccount(String accountId) {
      Account account = new Account(this, accountId);
      accounts.add(account);
      return account;
   }

   
   public String getFirstLastName() {
      return firstName + "  " + lastName;
   }

   
   public void listAccounts() {
      System.out.println("Konto klienta " + getFirstLastName() + " :");
      for (Account account : accounts) {
         System.out.println(account.getAccountId());
      }
      System.out.println("\n");
   }

   
   public void getBilling(){
      System.out.println(this.getFirstLastName()); 
      for(Account account : accounts){
         System.out.print("Nr konta : " + account.getAccountId());
         System.out.print("\n\n");
         System.out.println("Bilans: " + account.getBalance());
         account.showHistory();
         System.out.print("\n\n");
      }

   }
   
}