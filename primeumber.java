public class hello{    
 public static void main(String args[]){    
  int i,m=0,p=0;      
  int n=3;   
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" not prime no");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" not prime no");      
     p=1;      
     break;      
    }      
   }      
   if(p==0)  { System.out.println(n+"  prime no"); }  
  }
}    
}   
