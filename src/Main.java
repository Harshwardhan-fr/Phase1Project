import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static String root_dir="C:\\Users\\hrwrd\\IdeaProjects\\Phase1Project\\dir";
    public static void main(String[] args) {
        File f1= new File(root_dir);
        System.out.println("Welcome to File System by Harshwardhan");
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("1-List all files in Directory");
            System.out.println("2-File operations");
            System.out.println("3-Close application");
            Integer aux=0;
            try{
                aux=Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                System.out.println("Enter a valid integer");
            }
            switch(aux){
                case 3:
                    System.out.println("GoodBye");
                    System.exit(0);
                case 2:
                    fileOperations fp= new fileOperations();
                    fp.fileOps();
                    break;
                case 1:
                    ListFiles l= new ListFiles();
                    l.Listfiles();
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
    }
}