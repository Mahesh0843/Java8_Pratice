interface InnerMethodref {

    public void m1();
}
public class Methodref {
    public static void m2()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        InnerMethodref q=Methodref::m2;
        q.m1();
    }
}
