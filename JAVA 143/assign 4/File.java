

// Robert M. Wood Jr
// 5/2/18
// CPW 143
// Assignment #4
//

public class File extends Document{
	 private String format;
     
     public File(String format){ // constructor
        this.format = format;
     }
   
     public File(String format, String text){   // constructor 
        super(text); // gets the text from document
        this.format = format; 
        
     }
    
     public String toString(){ // string to return requested info
        return "Format: " + format +", " + super.toString();    
     }
    
}
