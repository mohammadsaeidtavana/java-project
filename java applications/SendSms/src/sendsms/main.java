package sendsms;

import com.nexmo.client.NexmoClient;
import com.nexmo.client.auth.AuthMethod;
import com.nexmo.client.auth.JWTAuthMethod;
import com.nexmo.client.auth.TokenAuthMethod;
import com.nexmo.client.sms.SmsSubmissionResult;
import com.nexmo.client.sms.messages.TextMessage;
import com.nexmo.client.verify.CheckResult;
import com.nexmo.client.verify.VerifyResult;
import com.nexmo.client.voice.Call;
import com.nexmo.client.voice.CallEvent;
import com.simplewire.sms.SMS;
import com.sun.tools.classfile.StackMapTable_attribute;

import java.nio.file.Paths;

/**
 * Created by saeedtavana on 3/18/18.
 */
public class main {

    public static void main(String[] args)throws Exception {


        // Optional Message Settings
        // Specify source and destination ports that will appear
        // in the GSM User-Data-Header
        //sms.setSourcePort((short)0x0000);
        //sms.setDestPort((short)0x0000);
        //
        // Specify a network type "hint" - helps Simplewire
        // choose between a TDMA vs. GSM network for example.
        // Only useful for certain types of messages such as
        // WAP push or MIDP Java WMA messages and if the destination
        // operator runs both TDMA and GSM networks.
        // sms.setNetworkType(SMS.NETWORK_TYPE_GSM);

        // Message Settings

        //two factor authentication code
       /* AuthMethod auth = new TokenAuthMethod("088a2b7d", "65YOIp02AW08RhiK");
        NexmoClient client = new NexmoClient(auth);
        VerifyResult ongoingVerify = client.getVerifyClient().verify("+48798203194", "NEXMO");


        CheckResult obj = client.getVerifyClient().check(ongoingVerify.getRequestId(), "7818");
        System.out.println(obj.getStatus());*/


        //send sms
        AuthMethod auth = new TokenAuthMethod("088a2b7d","65YOIp02AW08RhiK");
        NexmoClient client = new NexmoClient(auth);

        TextMessage message = new TextMessage("Athina", "+48798203194", " 2 factor authentication\nfaal hast va system sms mifereste ");


       SmsSubmissionResult[] responses = client.getSmsClient().submitMessage(message);
        for (SmsSubmissionResult response : responses) {
            System.out.println(response);
        }
    }
}
