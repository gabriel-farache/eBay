/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wsdbwrite;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author romain
 */
public class DBWrite {

	public static boolean WriteUser(String filename, User user, boolean append) {
                if(filename.equals(""))
                    return false;
		try {
			File file = new File(filename);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),append);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(user.toString()+"\n");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
                        return false;
		}
                return true;
	}
}
