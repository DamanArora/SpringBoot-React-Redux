package functionInterface;

import java.util.function.Supplier;

//It just return a value
public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println("Using Supplier");
        System.out.println(getDBDetails.get() );
    }

    //function way
    static Supplier<String> getDBDetails = () -> "jdbc://localhost:5432/users";

    //Traditional way
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

}
