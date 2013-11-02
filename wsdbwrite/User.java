/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wsdbwrite;

/**
 *
 * @author romain
 */
public class User {

    private static int UserCount = 0;

    private int _id;
    private String _firstName;
    private String _lastName;

    public User(String fname, String lname) {
        this._id = User.UserCount;
        User.UserCount++;
        this._firstName = fname;
        this._lastName = lname;
    }

    public String toString() {
        return "["+this._id+"]"+this._firstName+"#"+this._lastName;
    }
}
