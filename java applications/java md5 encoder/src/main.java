import java.util.Scanner;

/**
 * Created by saeedtavana on 7/4/17.
 */
public class main {
    public static void main(String[] args) {
        EncoderUtil encoderUtil=new EncoderUtil();
        try {
            System.out.println("insert number :");
            Scanner scanner=new Scanner(System.in);
            String pass=scanner.next();

            String name=encoderUtil.getMD5(pass);
            if (name.equals("c81e728d9d4c2f636f067f89cc14862c"))
            {
                System.out.println("correct");
            }
            else
            {
                System.out.println("not equal");
            }
            System.out.println(name);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
