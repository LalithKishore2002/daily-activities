public class practice {
public static void main(String[] args) {
    int i,m=0,p=0;
    int n=18;
    m=n/2;
    if (n==0||n==1) {
        System.out.println(n+" not prime");

    }else{
        for(i=2;i<=m;i++)
        {
            if (n%i==0) {
                System.out.println(n+ " not prime");
                 p=1;
                 break;           
        }
    }
    if (p==0) {
        System.out.println(n+" is prime");
    }
    }

}
    
}
