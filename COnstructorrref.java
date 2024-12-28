import java.util.function.Supplier;

public class COnstructorrref {
    public static void main(String[] args) {
    Supplier<Demo> s=Demo::new;
    System.out.println(s.get());
    }
}
class Demo{
    Demo()
    {
        System.out.println("Demo const");
    }
}