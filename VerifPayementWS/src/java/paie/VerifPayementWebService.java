/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package paie;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author BenJ
 */
@WebService
public class VerifPayementWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "verif")
    public boolean verif(@WebParam(name = "nom")
    String nom, @WebParam(name = "prenom")
    String prenom) {
        //TODO write your implementation code here:
        return true;
    }

}
