/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mail;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author root
 */
@WebService()
public class SendMailWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendMail")
    public String sendMail(@WebParam(name = "subject")
    String subject, @WebParam(name = "content")
    String content, @WebParam(name = "recipients")
    ArrayList<String> recipients) {
        //TODO write your implementation code here:
        for (String recp : recipients) {
            System.out.println("-----"+subject+" to "+recp+"-------");
            System.out.println(content);
        }
        return "Mails send!";
    }

}
