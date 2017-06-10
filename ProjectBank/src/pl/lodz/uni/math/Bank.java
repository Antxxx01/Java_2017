package pl.lodz.uni.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; //do klasy skaner


public class Bank {
   private static Bank bank = null;
   private static String name;
   private static String city;
   private static String street;
   private static String id;
   private List<Client> clients = new ArrayList<Client>();

   
   static Scanner input = new Scanner(System.in);

   
   private Bank(String bankName, String bankCity, String bankStreet, String bankId) {
      name = bankName;
      city = bankCity;
      street = bankStreet;
      id = bankId;
   }
   
   
   public static Bank getInstance() {
      if (bank == null) {
         System.out.println("Podaj dane Banku : ");
         bank = new Bank(setBankName(), setBankCity(), setBankStreet(), setBankId());
      }
      return bank;
   }

   
   public Client createClient(String firstName, String lastName, String city, String street, String clientId) {
      Client client = new Client(firstName, lastName, city, street, clientId);
      clients.add(client);
      return client;
   }

   
   public void bankClients() {
      System.out.println("Klient banku " + getName() + ": ");
      for (Client client : clients) {
         System.out.println(clients.indexOf(client) + 1 + ". " + client.getFirstLastName());
      }
      System.out.print("\n\n");
   }

   
   static String setBankName() {
      System.out.println("Nazwa banku : ");
      name = input.nextLine();
      return name;
   }
   
   
   static String getName() {
      return name;
   }

   
   static String setBankCity() {
      System.out.println("Miasto: ");
      city = input.nextLine();
      return city;
   }

   
   static String setBankStreet() {
      System.out.println("Ulica: ");
      street = input.nextLine();
      return street;
   }

   
   static String setBankId() {
      System.out.println("Numer id banku:");
      id = input.nextLine();
      return id;
   }

   
}
