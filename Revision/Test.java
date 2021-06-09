package Revision;

public class Test{
    public static void main(String[] a){
        MC mc = new MC(10);
        MC mc2 = mc.inc();
        System.out.println(mc2.x+" , "+ mc.x);
    }
}