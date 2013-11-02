/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbws;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author root
 */
@WebService()
public class ReadDBWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "readWS")
    public String readWS(@WebParam(name = "filename")
    String filename, @WebParam(name = "id")
    String id) {
        String str=null;
        
        if(filename.equals("")) {
                    return null;
        }
        try {
                File file = new File(filename);
                boolean find = false;
                FileReader fr = new FileReader(file.getAbsoluteFile());
                BufferedReader br = new BufferedReader(fr);
                do {
                    str = br.readLine();
                    if(str.split("|")[0].equals(id)) {
                        find = true;
                    }
                } while(!find && str!= null);
                br.close();
        } catch (IOException e) {
                e.printStackTrace();
                return null;
        }
        return str;
    }
    

}
