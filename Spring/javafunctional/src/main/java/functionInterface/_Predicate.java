package functionInterface;

import java.util.function.Predicate;

//Predicate returns true/false
public class _Predicate {

    public static void main(String[] args) {
        System.out.println(checkPhoneNum("98 0000"));
        System.out.println("With Predicate");
        System.out.println(chekNum.test("97"));
    }

    //Similar is bipredicate

    //Predicate approach
    static Predicate<String> chekNum = num -> num.startsWith("97") && num.length() >2;

    //Normal approach
    static boolean checkPhoneNum(String number){
        return number.startsWith("98") && number.length() >= 4;
    }

}
