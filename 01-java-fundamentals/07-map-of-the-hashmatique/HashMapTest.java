import java.util.HashMap;
import java.util.Set;
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Next Lifetime","I'll see you next lifetime");
        trackList.put("Tyrone","I guess you'd better call Tyrone");
        trackList.put("On & On","Oh my my my, I'm feeling high");
        trackList.put("Bag Lady","You gon hurt your back, dragging all them bags like that");
        trackList.put("You got me","If you were worried about where I been or who I saw");
        
        System.out.println(trackList.get("Next Lifetime"));//pulls track by name
        System.out.println(trackList);//prints entire trackList 

        Set<String> songTitles = trackList.keySet();
        for(String songTitle : songTitles) {//this will loop through all song titles and lyrics as well
            System.out.println(songTitle);
            System.out.println(trackList.get(songTitle));  
        }

        for(String songTitle: trackList.keySet()){// pulls only the song title
            System.out.println(songTitle);
        }

        for(String songLyrics: trackList.values()){// pulls only the lyrics
            System.out.println(songLyrics);
        }
        


    }
}
