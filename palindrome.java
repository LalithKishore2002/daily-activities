class practice{  
 public static void main(String args[]){  
  int r,sum=0,t;    
  int n=454;//It is the number variable to be checked for palindrome  
  t=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(t==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
