package instagramapi;

public class App 
{
    public static void main( String[] args )
    {
        Instagram i = new Instagram()
                .username("java.lang.string")
                .password("DONTWORRY");

        System.out.println(i.getAccount().getName());
        i.editAccount().setName("");
    }
}
