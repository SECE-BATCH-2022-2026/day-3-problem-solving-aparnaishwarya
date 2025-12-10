
public class stringRepeat {
    public static void main(String[]args){
        String s1 = "asd" ;
        String s2 = "asd" ;
        // System.out.println(s2.compareTo(s1));

        String str = "Ap" ;
        int n = 3 ;
        String ans = "" ;
        if(str.length()>3){
            String sub = str.substring(0,3) ;
            for(int i=0;i<n;i++){
                ans+=sub ;
            }
        }
        else{
            for(int i=0;i<n;i++){
                ans+=str ;
            }
        }
        System.out.println(ans);
    }
}
