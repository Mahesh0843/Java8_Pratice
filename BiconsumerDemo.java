import java.util.function.BiConsumer;

public class BiconsumerDemo {
    public static void main(String[] args) {
        
    BiConsumer<String,String> bi=(n,m)->{
        System.out.println("firstname "+n+" lastname");
        System.out.println(m);
    };
    bi.accept("mahesh", "chandra");
}
}
