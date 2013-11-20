/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbws;

import java.io.BufferedWriter;
import java.io.File;
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
public class writeDBWS {

    private int m_id = 0;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public boolean operation(@WebParam(name = "filename")
    String filename, @WebParam(name = "data")
    String data, @WebParam(name = "append")
    boolean append) {
        //TODO write your implementation code here:
        if(filename.equals("")) {
                    return false;
        }
        try {
                File file = new File(filename);

                // if file doesnt exists, then create it
                if (!file.exists()) {
                        file.createNewFile();
                }

                FileWriter fw = new FileWriter (file.getAbsoluteFile(),append);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(m_id+"|"+data+"\n");
                m_id++;
                bw.close();
        } catch (IOException e) {
                e.printStackTrace();
                return false;
        }
        return true;
    }

}
