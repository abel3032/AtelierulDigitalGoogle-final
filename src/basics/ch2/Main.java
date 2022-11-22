package basics.ch2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (compute(n) == "FALS")
            System.out.println(n);
        else
            System.out.println(compute(n));
    }
    static String compute(int n) {

        String secventa="";
        int aux=reverse(n);
        if(n%3==0)
            secventa=secventa+"Foo";
        if(n%5==0)
            secventa=secventa+"Bar";
        if(n%7==0)
            secventa=secventa+"Qix";
        while(aux!=0)
        {
            if(aux%10==3)
                secventa=secventa+"Foo";
            if(aux%10==5)
                secventa=secventa+"Bar";
            if(aux%10==7)
                secventa=secventa+"Qix";
            aux=aux/10;
        }
        if(secventa=="")
            secventa="FALS";
        return secventa;
    }
    static int reverse(int n)
    {
        int rev_num=0;
        while(n>0)
        {
            rev_num=rev_num*10+n%10;
            n=n/10;
        }
        return rev_num;
    }
}
