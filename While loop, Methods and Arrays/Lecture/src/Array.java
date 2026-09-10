public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[3] = 41;
//        myArr[4] = 58;
//        myArr[1] = 9;
//        myArr[2] = 36;

        int[] myArr = {98, 9, 36, 41, 58};
//        int index = 2;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        // Array traversal
        int index = 0;
        while (index < 5) {
            System.out.println(myArr[index]);
            index++;
        }

        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);
    }
}
