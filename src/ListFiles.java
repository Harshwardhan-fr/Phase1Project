import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class ListFiles {
    public static File f1= new File("C:\\Users\\hrwrd\\IdeaProjects\\Phase1Project\\dir");
    public static void Listfiles(){
        String[] s1= f1.list();
        ArrayList<String>List=new ArrayList<>();
        for(String i:s1){
            List.add(i);
        }
        Collections.sort(List);
        System.out.println(List);
    }
}
