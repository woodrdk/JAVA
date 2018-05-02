
public class File extends Document{
	 private String format;
     
     public File(String format){
        this.format = format;
     }
   
     public File(String format, String text){
        super(text);
        this.format = format; 
        
     }
    
     public String toString(){
        return "Format: " + format +", " + super.toString();    
     }
    
}
