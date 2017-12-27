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



    public String doJob(File file) throws FileNotFoundException{

      //  Processor proc1 = new Processor();

        //System.out.println(proc1.fileToString());

        String content = this.fileToString(file);

        Finder finder = new Finder(content);

        return finder.getResult();


    }


    public static String fileToString(File file) throws FileNotFoundException{
        StringBuilder sb = new StringBuilder();


            Scanner sc = new Scanner(new FileInputStream(file), "ISO-8859-2");



            System.out.println(sc.toString());
            String line;
            while(sc.hasNextLine()) {

                line = sc.nextLine();
                sb.append(line);
            }



        return sb.toString();
    }

}
