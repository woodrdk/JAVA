
// Robert M. Wood Jr
// 5/2/18
// CPW 143
// Assignment #4
//


public class Document {
   private String text;
   
   public Document(){ // no arg constructor
       text = "This space intentionally left blank.";
   }
   public Document(String text){ // gen constructor
       this.text = text;
   }
      
   public String getText(){ // Method returns the value of text.
       return text;
   }
     
   public void setText( String str ){ // Method sets the value of text to that of str.
       text = str; 
   }
   
   public int size(){   // Method returns the number of characters in the field text.
       return text.length();
   }
   
   public String toString(){ // returns a String representing the document
       return "Contents: " + text;    
   }
}