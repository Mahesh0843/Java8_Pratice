import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        
    Consumer<String> e=(name)->{
        System.out.println(name +", Good morning");
    };
    e.accept("mahi");
    e.accept("raju");

}
}
