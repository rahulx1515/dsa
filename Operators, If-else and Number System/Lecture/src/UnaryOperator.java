public class UnaryOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(z);


        int a = 5;
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        int p = 5;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);
    }
}
