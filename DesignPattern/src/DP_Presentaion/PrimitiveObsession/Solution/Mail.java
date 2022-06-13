package PrimitiveObsession.Solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mail {
    public static Pattern checkMail;
    public String mail;
    public Mail(String mailValue) {
        if (mailIsValid(mailValue)){
            this.mail = mailValue;
        }else{
            System.out.println("Enter a Valid email Address");
        }
    }
    boolean mailIsValid(String mail){
        checkMail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = checkMail.matcher(mail);
        return matcher.find();
    }

    @Override
    public String toString() {
        return
                "mail= " + mail;
    }
}