public class UserDefinedException {
    public void validata(int age) throws Invalid_Age_exception
    {
        if(age<18)
            throw new Invalid_Age_exception("CAnnot caste vote age is less than 18");
        else
           System.out.println("Eligible to vote.");
    }
}
