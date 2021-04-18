import java.util.HashMap;
import java.util.Map;

public class MapAndHashMap {
    public static void main(String[] args) {

        String[] names =
                //<editor-fold desc="raw names data">
                {"James", "Henry",
                 "Crane","Tool",
                "Mark","Fencer",
                "Troy","Name",
                "Giggle","John",
                "Rankle","Spencer"};
                //</editor-fold>

        String[] firstNames = new String[names.length/2];
        String[] lastNames = new String[names.length/2];

        for(int i = 0; i < names.length; i++){
            if(i % 2 == 0){ firstNames[i/2] = names[i]; }
            else{ lastNames[i/2] = names[i]; }
        }

        Map<String, String> people = new HashMap<>();
        for(int i = 0; i < lastNames.length; i++){
            people.put(lastNames[i],firstNames[i]);
        }
        System.out.println(people.get("John"));
    }
} 
