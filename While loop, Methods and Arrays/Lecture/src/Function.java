public class Function {
    public static void main(String[] args) {
        greetUser(); //method calling

        FirstPattern();
        SecondPattern();
        ThirdPattern();
    }

    public static void greetUser(){
        System.out.println("Good Morning");
    }

    public static void FirstPattern() {
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");
//        System.out.println("* * * * *");

        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void SecondPattern() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }

    public static void ThirdPattern() {
            System.out.println("        *");
            System.out.println("      * *");
            System.out.println("    * * *");
            System.out.println("  * * * *");
            System.out.println("* * * * *");
    }
}
