import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Puzzling {
    public ArrayList getTenRolls(){
        //need an array with 10 spots/or array list
        //loop into and populate array w/ 10 random numbers

        ArrayList<Integer> randArray = new ArrayList<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            randArray.add(r.nextInt(20));
            //Do not store in a variable it will store one random number
        }
        System.out.println(randArray);
        return randArray;
    }
    
    public Character getRandomLetter() {
        Random r = new Random();
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char i = 'a' ; i <= 'z'; i++) {//you can use the int as well and it will work
            //System.out.printf("%c ", i);//formatting rules
            alphabet.add(i);
        }
                
        return alphabet.get(r.nextInt(26));
        //Generate a random index between 0-25, 
        //and use it to pull a random letter out of the array.
    }

    public String generatePassword(){
        String password = new String();
        for(int i = 0; i < 8; i++){
            password += Character.toString(getRandomLetter());
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            newPassword.add(generatePassword());
        }
        return newPassword;
    }

    public void shuffleArray(ArrayList<String> arr){
        Random r = new Random();
        ArrayList<String> newArr = arr;
        r.nextInt(newArr.size()); //this gets the random index number between the first and last of the array
        //shuffle the array with the random indexes (won't it repeat the numbers ...)
        System.out.println(newArr); //original array
        Collections.shuffle(newArr);
        System.out.println(newArr);
    }
}
