
public class Email extends Document{
	 private String sender;
	 private String recipient;
	 private String subject;
    
 
     
     public Email(String sender, String recipient, String subject, String text){
         super(text);
         this.sender = sender;
         this.recipient = recipient;
         this.subject = subject; 
     }
     
     public Email(String sender,String recipient, String subject){
         this.sender = sender;
         this.recipient = recipient;
         this.subject = subject; 
     }
     
     public String toString(){
         return "From: " + sender + ", To: " + recipient +
                ", Subject: " + subject + "\n" + super.toString();
     }
    
}