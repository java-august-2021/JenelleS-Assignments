import java.util.Date;
public class AlfredQuotes {
/*
    * Inputs: None
    * Return Type: String
    * Description: Returns a generic greeting that Alfred will say to anyone.
    */
    public String basicGreeting() {
// You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
/* 
    * Inputs: String name, String dayPeriod 
    *                      Assume "morning", "afternoon" or "evening".
    * Return Type: String
    * Description: Returns a greeting that includes the person's name
    *         as well as the day period. For example:
    *        "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
    public String guestGreeting(String name, String dayPeriod) {
        String greet = String.format("Good %s, Welcome %s!", dayPeriod, name);
        return greet;
    }
    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    public String dateAnnouncement() {
        Date date = new Date();
        return "Current date is: " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") >= 0) {
            return "Alexis can't do this. I will take the task!";
        } else if (conversation.indexOf("Alfred") >= 0){
            return "Of course, right on it!";
        } else {
            return "Well, what do you want me to do about it?";
        }
    }
}

