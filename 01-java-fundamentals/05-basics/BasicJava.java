import java.util.Arrays;
import java.util.ArrayList;


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

    //6
    //If you're POPULATING an array USE ARRAYLIST for ease
    //when initializing an array(regular array) int[] num = new int[5] (5 is the length) 
    public ArrayList arrOdd255(){
        ArrayList oddsList = new ArrayList();
        for (int i = 1; i <= 255; i += 2) {
            oddsList.add(i);
        }
        return oddsList;
    }

    //7
    public void avgArr(int[] arr){
        int sum =0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }

    //8
    public int greaterThanY(int[] arr, int y) {
        int valuesGreaterThanY = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > y){
                valuesGreaterThanY++;
            }
        }
        return valuesGreaterThanY;
    }

    //9
    public ArrayList squareArr(int[] arr) {
        ArrayList squareList = new ArrayList();
        for(int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
            squareList.add(arr[i]);
        }
        return squareList;
    }

    //10
    //arrays to string allows you to view what is inside the array
    public String noNegArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return Arrays.toString(arr);
    }

    //11
    public ArrayList maxMinAvg(int[] arr) {
        ArrayList maxMinAvgList = new ArrayList();
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg= sum/arr.length;
        maxMinAvgList.add(max);
        maxMinAvgList.add(min);
        maxMinAvgList.add(avg);
        return maxMinAvgList;
    }

    //12
    //Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each
    //number by one to the front. 
    //For example, when the method is done, an x of
    //[1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last
    //number is 0. The method does not need to wrap around the values shifted
    //out of bounds.
    public ArrayList shiftArray(int[] arr){
        ArrayList shiftArrList = new ArrayList();
        for(int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
            shiftArrList.add(arr[i]);
        }
        arr[arr.length-1] = 0;
        shiftArrList.add(arr[arr.length-1]);
        return shiftArrList;
    }

    public void shiftingArr(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
//user snippets "cls" for sysout
//user snippet for iterating through an array is "for"
    
}
