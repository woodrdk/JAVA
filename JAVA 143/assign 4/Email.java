

// Robert M. Wood Jr
// 5/2/18
// CPW 143
// Assignment #4
//

public class Email extends Document{
	 private String sender;
	 private String recipient;
	 private String subject;
    
 
     
     public Email(String sender, String recipient, String subject, String text){ // constructor
         super(text); // retrieves info from document
         this.sender = sender;
         this.recipient = recipient;
         this.subject = subject; 
     }
     
     public Email(String sender,String recipient, String subject){ // constructor
         this.sender = sender;
         this.recipient = recipient;
         this.subject = subject; 
     }
     
     public String toString(){ // returns requested imfo
         return "From: " + sender + ", To: " + recipient +
                ", Subject: " + subject + "\n" + super.toString();
     }
    
}