public class practice   
{    
    public static void main(String[] args) {    
        String string = "senior developer lalith kishore";    
        int count = 0;    
            
           
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            System.out.println("Total number of characters : " + count);    
    }    
}     
