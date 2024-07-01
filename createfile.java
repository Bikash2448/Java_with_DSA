import java.io.*;

public class createfile {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\BIKASH MAL\\Desktop\\javafile.txt");
            int i ;
            while((i= fr.read())!= -1){
                System.out.print((char)i);
            }
            fr.close();


            // FileWriter f = new FileWriter("C:\\Users\\BIKASH MAL\\Desktop\\javafile.txt");
            // f.write("Hello Biku....");
            // f.close();


            // if(f.exists()){
            //     System.out.println("File Writable "+f.canRead());
            //     System.out.println("File Readable "+f.canWrite());
            //     System.out.println("File Length "+f.length());
            // }else{
            //     System.out.println("File Does't Exists ");
            // }


            // f.createNewFile();
            // System.out.println("File Successfully Created........");
        }catch (Exception e) {
            // TODO: handle exception
            System.out.println(" error is "+e.getMessage());
        }

    }
}
