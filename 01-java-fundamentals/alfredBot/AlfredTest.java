public class AlfredTest {
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all it's methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        //Connects to the
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "evening");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");

        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");
        System.out.println(testDateAnnouncement);
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}

