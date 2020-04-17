public class Main {

    private static String userName = "Hannah-Tabea";
    private static String password ="1234";

    public static void main(String[] args) {
	// write your code here
        User u1 = new User("Hannah-Tabea" ,"HaTaHa29!!");
        User u2 = new User("Natalie" ,"NatMan13!");
        User u3 = new User("Hanna" ,"HanGoe24!!");
        User u4 = new User("Jette" ,"JetBeu17!");
        UserList uList = new UserList();
        uList.add(u1);
        uList.add(u2);
        uList.add(u3);
        uList.add(u4);
        /*Authentifizierung authentifizierung = new Authentifizierung(uList);*/
        GUI gui = new GUI(uList);


    }
}
