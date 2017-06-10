package pl.lodz.uni.math;

public class Transaction {
   private Account sender;
   private Account receiver;
   private double value;
   private TransactionType type;
   private TransactionStatus status;

   
   public Transaction(Account accountSender, Account accountReciver, double accountValue, TransactionType accountType) {
      sender = accountSender;
      receiver = accountReciver;
      value = accountValue;
      type = accountType;
      doTransaction();
   }

   
   private void doTransaction() {
      this.status = TransactionStatus.SUCCESS;
      
      switch (this.type) {
     
      case TRANSFER:
         doTransfer();
         break;
      case DEPOSIT:
          doDeposit();
          break;
       case WITHDRAW:
          doWithdraw();
          break;
         
      default:
         status = TransactionStatus.FAIL;
         sender.addHistory(this);
      }
   }

   
   private void doDeposit() {
      if (sender.getAccountId() == receiver.getAccountId()) {
         receiver.setBalance(receiver.getBalance() + this.value);
      } else {
         this.status = TransactionStatus.ABORTED;
      }
      receiver.addHistory(this);
   }

   
   private void doWithdraw() {
      if (sender.getAccountId() == receiver.getAccountId()) {
         if (receiver.getBalance() >= this.value) {
            receiver.setBalance(receiver.getBalance() - this.value);
         } else {
            this.status = TransactionStatus.FAIL;
         }
      } else {
         this.status = TransactionStatus.ABORTED;
      }
      receiver.addHistory(this);
   }
   
   
   private void doTransfer() {
      if (sender.getAccountId() != receiver.getAccountId()) {
         if (sender.getBalance() >= this.value) {
            sender.setBalance(sender.getBalance() - this.value);
            receiver.setBalance(receiver.getBalance() + this.value);
            receiver.addHistory(this);
            
         } else {
            this.status = TransactionStatus.FAIL;
         }
         
      } else {
         this.status = TransactionStatus.ABORTED;
      }
      sender.addHistory(this);
   }

   
   public TransactionType getType() {
      return type;
   }
   
   
   public TransactionStatus getStatus() {
      return status;
   }
   
   
   public Account getSender() {
	      return sender;
	   }
   
   
   public Account getReceiver() {
      return receiver;
   }
   
   
   public double getValue() {
	      return value;
	   }
   
}
