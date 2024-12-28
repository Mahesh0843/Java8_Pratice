// #1535A
import java.util.*;
public class winner {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        while(n-->0)
        {
        int[] e=new int[4];
        int m1=-1;
        int m2=-1;
        for(int i=0;i<4;i++)
        {
            e[i]=t.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            if(m1<e[i])
            {
                m2=m1;
                m1=e[i];
            }
            else if(m2<e[i] && m2!=m1)
            {
                m2=e[i];
            }
        }
        int w1=Math.max(e[0],e[1]);
        int w2=Math.max(e[2],e[3]);
        int m1w=-1;
        int m2w=-1;
        if(w1>w2)
        {
            m1w=w1;
            m2w=w2;
        }
        else{
            m1w=w2;
            m2w=w1;
        }
        if(m1w==m1 && m2w==m2)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }

    }

    }
}