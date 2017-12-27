import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.awt.*;
import java.io.*;
import java.util.Scanner;

public class Processor{



    public static void main(String[] args){

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuiCSVsum guiCSVsum = new GuiCSVsum();
            }
        });



    }



    public String doJob(File file){

      //  Processor proc1 = new Processor();

        //System.out.println(proc1.fileToString());

        String content = this.fileToString();

        Finder finder = new Finder(content);

        return finder.getResult();


    }


    public static String fileToString(File file){
        StringBuilder sb = new StringBuilder();
        try {
            File file = new File("d:\\xxx.csv");
           // Scanner sc = new Scanner(file, "UTF-8");
            //FileReader fr = new FileReader("d:\\xxx.csv", UTF-8);
            //BufferedReader br = new BufferedReader(fr);
           InputStreamReader is = new InputStreamReader(new FileInputStream("d:\\xxx.csv"));
          //  Scanner sc = new Scanner(is);
          //  System.out.println(is.getEncoding());
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
