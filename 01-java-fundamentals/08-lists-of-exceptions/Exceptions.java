import java.util.ArrayList;
public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add(48);
        myList.add(49);
        myList.add(50);
        myList.add("13");
        myList.add("Goodbye World");
        myList.add("hello world");

        // Integer castedValue = 0;
        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("This value works " + castedValue);
            } catch (Exception e) {
                System.out.println("This is not a number at index " + i + ": " + e);
            }
        }
    }
}
