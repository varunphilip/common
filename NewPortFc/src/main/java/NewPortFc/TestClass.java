package NewPortFc;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class TestClass {
	public static final String ACCOUNT_SID = "ACc33d1d4cb33366f0d58852bfb38ebaa7";
    public static final String AUTH_TOKEN = "45202cfb371a2b9ebf78a7628a8a2fcb";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        for(int i = 0; i < 1; i++) {
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+919940282141"),
                new com.twilio.type.PhoneNumber("whatsapp:+16692383272"),
                "Thanks for registering with Newport FC !!!")
            .create();

        System.out.println(message.getSid());
        }
}
}

