import java.io.*;
import java.util.Scanner;

public class Processor {



    public static void main(String[] args){

        Processor proc1 = new Processor();


        //System.out.println(proc1.fileToString());

        String content = proc1.fileToString();

        Finder finder = new Finder(content);

        System.out.println(finder.getResult());



    }


    public static String fileToString(){
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File("d:\\xxx.csv");
           // Scanner sc = new Scanner(file, "UTF-8");
            //FileReader fr = new FileReader("d:\\xxx.csv", UTF-8);
            //BufferedReader br = new BufferedReader(fr);
           InputStreamReader is = new InputStreamReader(new FileInputStream("d:\\xxx.csv"));
          //  Scanner sc = new Scanner(is);
            System.out.println(is.getEncoding());
            Scanner sc = new Scanner(new FileInputStream(file), "ISO-8859-2");



            System.out.println(sc.toString());
            String line;
            while(sc.hasNextLine()) {

                line = sc.nextLine();
                sb.append(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

        return sb.toString();
    }

}
