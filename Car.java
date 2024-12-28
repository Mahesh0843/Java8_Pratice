interface Inter {
    public void start();
    public default void clean(){
        System.out.println("cleann");
    }
}
public class  Car implements Inter {
    public void start()
    {
        System.out.println("carr");
    }
    public static void main(String[] args) {
        Car c=new Car();
        c.clean();
        c.start();
    }
}
