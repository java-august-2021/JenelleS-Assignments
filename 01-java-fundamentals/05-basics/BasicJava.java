import java.lang.reflect.Array;

public class BasicJava {
    //1
    public void print255() {
        for(int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    //2
    public void printOdd255() {
        for(int i = 1; i <= 255; i+=2) {
            System.out.println(i);
        }
    }

    //3
    public int sigma255() {
        int sum = 0;
        for(int i = 1; i <= 255; i++) {
            sum+= i;
        }
        return sum;
    }

    //4
    //.length is only for arrays NOT arraylists
    //used for iterating through an array
    public void itArr(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //5
    //starting at the beginning of the array is easiest since we are not comparing arrays
    public int maxArr(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public void arrOdd255(){
        int[] numArr =  new int[256];
        for(int i = 0; i < numArr.length; i++) {
            if(i%2 != 0){
                numArr[i] = i;
            }
        }

        for(int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
