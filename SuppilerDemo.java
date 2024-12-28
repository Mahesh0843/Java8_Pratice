import java.util.function.Supplier;

public class SuppilerDemo {

    public static void main(String[] args) {
        
    Supplier<String> s=()->{
        String otp="";
        for(int i=0;i<5;i++)
        {
            otp+=(int)(Math.random()*10);
        }
        return otp;
    };
    System.out.println(s.get());
}
    
}