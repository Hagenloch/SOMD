import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse UserList.
 * In dieser Liste können die Nutzer gespeichert werden, damit später ein abgleich der   Login- Daten mit allen Nutzern stattfinden kann
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */

public class UserList
{
    ArrayList<User> Userl;


    /**
     * Konstruktor: Teilnehmerliste
     */

    public UserList()
    {
        Userl = new ArrayList<User>();
    }

    /**
     * Methode: add
     */

    public void add(User U1)
    {
        Userl.add(U1);
    }

    /**
     * Methode: size
     */

    public int size()
    {
        return Userl.size();
    }


    /**
     * Methode: get
     */

    public  User get(int i)
    {
        return Userl.get(i);
    }

}

