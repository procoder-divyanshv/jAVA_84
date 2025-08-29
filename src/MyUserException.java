public class MyUserException {
    public static void main(String[] args) {
        UserDefinedException exp1 = new UserDefinedException();
        try {
            exp1.validata(20);
        }

        catch(Invalid_Age_exception e) {
            System.out.println(e.getMessage());
        }
    }


}
