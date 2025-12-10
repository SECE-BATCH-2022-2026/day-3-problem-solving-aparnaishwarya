import java.util.*;
public class MagicString {

    public static Boolean magic_string(String s){
        return s.matches("[a-zA-z0-9][R][0-9][a-zA-z0-9]") ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        String str = sc.nextLine() ; 
        System.out.println(magic_string(str));
    }
}
