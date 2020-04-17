import java.util.ArrayList;
import java.util.List;
    /**
     * Beschreiben Sie hier die Klasse User.
     * Hier registrieren sich die Nutzer (der Website?) allerdings noch ohne Oberfläche
     * @author (Ihr Name)
     * @version (eine Versionsnummer oder ein Datum)
     */

public class User
{

        private String userName;
        private String password;


        /**
         * Konstruktor
         */
        public User (String userName, String password)
        {
            this.userName = userName;
            this.password = password;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }


        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

}
