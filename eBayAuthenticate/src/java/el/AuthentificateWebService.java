/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package el;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author root
 */
@WebService()
public class AuthentificateWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "connection")
    public String connection(@WebParam(name = "username")
    String username, @WebParam(name = "password")
    String password) {
        if (username.equals("toto") && password.equals("tamere")){
            return "Connection succeed";
        }
        return "Connection failed";
    }
}
