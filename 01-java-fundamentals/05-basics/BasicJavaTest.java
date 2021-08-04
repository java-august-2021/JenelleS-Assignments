public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava bJava = new BasicJava();

        //System.out.println(bJava."name of method to call"("if there is a variable to take in"));
        
        //1
        //bJava.print255();

        //2
        //bJava.printOdd255();

        //3
        //System.out.println(bJava.sigma255());

        //4
        int[] arr = {1,3,5,7,9,13};
        bJava.itArr(arr);

        //5
        int[] arr1 = {-3, -5, -7};
        int[] arr2 = {0, -5, 9};
        System.out.println(bJava.maxArr(arr));
        System.out.println(bJava.maxArr(arr1));
        System.out.println(bJava.maxArr(arr2));

        //6
        //anytime you are POPULATING an array please use ARRAYLIST
        System.out.println(bJava.arrOdd255());
        

    }
}
