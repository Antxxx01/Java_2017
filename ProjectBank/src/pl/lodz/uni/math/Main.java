package pl.lodz.uni.math;

public class Main {

   public static void main(String[] args) {
      Bank bank1 = Bank.getInstance();

      
      Client client1 = bank1.createClient("Matczak", "Tadeusz", "Warszawa", "Nowa 3", "111111001");
      Client client2 = bank1.createClient("Matczak", "El¿bieta", "Warszawa", "Stara 5", "111111002");
      

      Account account1 = client1.makeAccount("11-0000-0001");
      Account account2 = client1.makeAccount("11-0000-0002");
      Account account3 = client2.makeAccount("11-0000-0003");
      
      
      account1.doTransaction(TransactionType.DEPOSIT, 3000);
      account1.doTransaction(account3, 100);	//przelew
      account1.doTransaction(TransactionType.WITHDRAW, 5000);	//wyplata, za duza kwota
      account1.doTransaction(account1, 5);	//zleceniodawca i zleceniobiorca musi byc rozny
     
      
      
      System.out.println("\n\n");
      
      
      bank1.bankClients();
      client1.listAccounts();
      client1.getBilling();
      client2.getBilling();
      System.out.println("\n*************\n");
      account1.showHistory();
      
   }
   
   
   
}
