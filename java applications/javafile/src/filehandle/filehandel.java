package filehandle;

import java.io.*;
import java.util.Scanner;

/**
 * Created by saeedtavana on 5/27/17.
 */
public class filehandel {
    public static void main(String[] args)throws Exception {

        File file = new File("saeedfile1.txt");
        ObjectOutputStream  out =new ObjectOutputStream(new FileOutputStream("saeedobj.dat"));
        person person=new person();
        person.age=10;
        person.name="saeedtavana";
        out.writeObject(person);
        out.flush();
        out.close();
        ObjectInputStream in =new ObjectInputStream(new FileInputStream("saeedobj.dat"));
        person p=(filehandle.person) in.readObject();
        System.out.println();
        System.out.println(p.name);
        System.out.println(p.age);
        in.close();
        
       // System.out.println(file.exists());
        //try {


           /* PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("salam this text is from java");
            person person=new person();
            person.age=10;
            person.name="saeedtavana";
            printWriter.println();
            printWriter.println();
            //printWriter.print(person);
            printWriter.println();
            printWriter.println(person.age);
            printWriter.println(person.name);*/
           // FileOutputStream fileOutputStream=new FileOutputStream("saeedobj.txt");
            //ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            //objectOutputStream.writeObject(person);
            //objectOutputStream.flush();
            //objectOutputStream.close();
            //printWriter.flush();
            //printWriter.close();
            //FileInputStream fileInputStream=new FileInputStream(file);
           /* int mark, total=0, count=0;
            Scanner input =
                    new Scanner(file);
            while (input.hasNext())
            {
                mark = input.nextInt();
                total += mark;
                count++;
            }
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
