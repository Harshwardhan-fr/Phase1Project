import java.io.File;
import java.util.Scanner;

public class fileOperations {
    public static File f1= new File("C:\\Users\\hrwrd\\IdeaProjects\\Phase1Project\\dir");
    void AddFile(String Fname) {
        File f= new File(Fname);
        if(!f.exists()){
            try{
                f.createNewFile();
            }catch (Exception e){
                System.out.println("Couldn't create file");
            }
        }
        f.renameTo(new File(f1,f.getName()));
    }
    void DelFile(String Fname){
        File f=new File(f1,Fname);
        if(f.exists()){
            f.delete();
            System.out.println("File Deleted Sucessfully");
        }else{
            System.out.println("File Doesn't exist");
        }
    }
    void SearchFiles(String Fname){
        File F= new File(f1,Fname);
        if(F.exists()){
            System.out.println("File Exists");
        }else{
            System.out.println("File doesn't exists");
        }
    }
    public void fileOps() {
        Scanner sc= new Scanner(System.in);
        String aux="0";
        while(aux!="4") {
            System.out.println("1-Add a File");
            System.out.println("2-Delete a File");
            System.out.println("3-Search a File");
            System.out.println("4-Exit a File");
            aux= sc.nextLine();
            String Fname;
            switch (aux){
                case "4":
                    break;
                case "3":
                    System.out.println("Search function Selected");
                    break;
                case "2":
                    System.out.println("Enter the file name");
                    Fname=sc.nextLine();
                    DelFile(Fname);
                    break;
                case "1":
                    System.out.println("Enter the file name");
                    Fname=sc.nextLine();
                    AddFile(Fname);
                    break;
                default:
                    System.out.println("Enter a valid value");
            }
        }
    }
}
