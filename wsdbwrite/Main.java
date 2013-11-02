/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wsdbwrite;

/**
 *
 * @author romain
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u1 = new User("Jean","Dupont");
        User u2 = new User("John","Doe");
        boolean b;

        b = DBWrite.WriteUser("db.txt", u1, false);
        System.out.println(u1+", saved: "+b);
        b = DBWrite.WriteUser("db.txt", u2, true);
        System.out.println(u2+", saved: "+b);
    }

}
