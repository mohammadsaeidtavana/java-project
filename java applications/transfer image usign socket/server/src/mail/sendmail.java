package mail;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 * Created by saeedtavana on 7/8/17.
 */
public class sendmail {
    public void send_mail(String filename)throws Exception
    {


        String username="hossein.mst.1374@gmail.com";
        String password="13741995";
        String message1 = "this message is sent via attachment ";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session=Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username,password);
            }
        });
        try {



            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("hossein.mst.1374@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("hossein.mst.1374@gmail.com"));
            message.setSubject("Testing Subject (java) with picture attachment");
            BodyPart messageBodyPart = new MimeBodyPart();

            messageBodyPart.setText(message1);

            // Create a multipar message
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            // Part two is attachment
            messageBodyPart = new MimeBodyPart();
            String filename1 = filename;
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename1);
            multipart.addBodyPart(messageBodyPart);

            // Send the complete message parts
            message.setContent(multipart);

            Transport.send(message);

            System.out.println("Done message sent");

        }catch (MessagingException e)
        {
            e.printStackTrace();
        }
    }
}
