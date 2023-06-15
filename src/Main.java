import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main extends ListFiles {
    public static String root_dir="C:\\Users\\hrwrd\\IdeaProjects\\Phase1Project\\dir";
    public static void main(String[] args) {
        File f1= new File(root_dir);
        System.out.println("Welcome to File System by Harshwardhan");
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("1-List all files in Directory");
            System.out.println("2-File operations");
            System.out.println("3-Close application");
            int aux=0;
            aux=sc.nextInt();
            switch(aux){
                case 3:
                    System.out.println("GoodBye");
                    System.exit(0);
                case 2:
                    System.out.println("File Operations Selected");
                    break;
                case 1:
                    Listfiles();
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
        }
}