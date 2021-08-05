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
        
        //7
        bJava.avgArr(arr);
        bJava.avgArr(arr1);
        bJava.avgArr(arr2);

        //8
        System.out.println(bJava.greaterThanY(arr, 3));

        //9
        System.out.println(bJava.squareArr(arr));
        System.out.println(bJava.squareArr(arr1));
        System.out.println(bJava.squareArr(arr2));

        //10
        int[] arr3 = {-3, -5, -7};
        int[] arr4 = {0, -5, 9};
        System.out.println(bJava.noNegArr(arr));
        System.out.println(bJava.noNegArr(arr3));
        System.out.println(bJava.noNegArr(arr4));

        //11
        int[] arr5 = {1,3,5,7,9,13};
        int[] arr6 = {-3, -5, -7};
        int[] arr7 = {0, -5, 9};
        System.out.println(bJava.maxMinAvg(arr5));
        System.out.println(bJava.maxMinAvg(arr6));
        System.out.println(bJava.maxMinAvg(arr7));



        //12
        int[] arr8 = {1, 5, 10, 7, -2};
        System.out.println(bJava.shiftArray(arr8));

        int[] arr9 = {1, 5, 10, 7, -2};
        bJava.shiftingArr(arr9);
    }
}
