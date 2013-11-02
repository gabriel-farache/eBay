/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package payment;

import javax.jws.WebService;

/**
 *
 * @author root
 */
@WebService()
public class PaymentWS {
    public void payment() {
        System.out.println("PaymentWS : Checking the payment ...");
        //Wait ...
        System.out.println("PaymentWS : Operation completed !");
    }
}
