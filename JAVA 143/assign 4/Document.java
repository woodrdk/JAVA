
public class Document {
   private String text;
   
   public Document(){ // no arg constructor
       text = "This space intentionally left blank.";
   }
   public Document(String text){ // gen constructor
       this.text = text;
   }
      
   public String getText(){
       return text;
   }
     
   public void setText( String str ){
       text = str; 
   }
   
   public int size(){
       return text.length();
   }
   
   public String toString(){
       return "Contents: " + text;    
   }
}