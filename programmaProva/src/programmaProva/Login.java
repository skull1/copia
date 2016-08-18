package programmaProva;

public class Login {
	 
    public static boolean authenticate(String username, String password) {
        // hardcoded username and password
        if (username.equals("prova") && password.equals("pass")) {
            return true;
        }
        return false;
    }
}