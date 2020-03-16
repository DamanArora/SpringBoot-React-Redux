package functionInterface;

//Accepts a single argument and returns no result

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        greetCustomer(new Customer("Daman", "7896541230"));
        System.out.println("Other Approach");
        grettCust.accept(new Customer("Nadia", "888"));
        System.out.println("-------BiConsumer-------");
        grettCustBi.accept((new Customer("Rooh", "888")), true);
    }

    //biConsumer approach
    static BiConsumer<Customer, Boolean> grettCustBi = (customer, showPhoneNumber)
            -> System.out.println("Hello "+customer.cname+" your number: "+(showPhoneNumber ? customer.cnum : "********"));

    //consumer approach
    static Consumer<Customer> grettCust = customer -> System.out.println("Hello " + customer.cname + " number is: "+customer.cnum);

    //normal approach
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.cname+" your number: "+customer.cnum);
    }

    static class Customer {
        private final String cname;
        private final String cnum;

        Customer(String cname, String cnum) {
            this.cname = cname;
            this.cnum = cnum;
        }
    }
}
