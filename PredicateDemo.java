import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
    String nm;
    int age;
    Person(String nn,int n)
    {
        nm=nn;
        age=n;
    }
}
public class PredicateDemo {
    public static void main(String[] args) {
        Person p1=new Person("nani",12);
        Person p2=new Person("nanyy",52);
        Person p3=new Person("nanvv",42);
        Person p4=new Person("nafrr",22);
        List<Person> ll=Arrays.asList(p1,p2,p3,p4);
        Predicate<Person> p=(m)->m.age>=22;
        Predicate<Person> pp=(m)->m.nm.startsWith("nan");
        Predicate<Person> p9=p.and(pp);
        for(Person l: ll)
        {
            if(p9.test(l))
            {
                System.out.println(l.nm);
            }
        }
    }
    
}