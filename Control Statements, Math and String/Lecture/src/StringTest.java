public class StringTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("First");
        sb.append(234);
        sb.append(" , now this is");
        sb.append(632.12);
        System.out.println(sb);
    }
}
