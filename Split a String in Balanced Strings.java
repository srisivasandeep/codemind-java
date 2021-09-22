import java.util.*;
class Test4{     
	 public static  int balancedStringSplit(String s) {
	        int res = 0;
	        int counter = 0;
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == 'L') {
	                counter++;
	            } else {
	                counter--;
	            }
	            if (counter == 0) {
	                res++;
	            }
	        }
	        return res;
	    }
public static void main(String[] args) {         
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       int r = balancedStringSplit(s) ;
       System.out.println(r);
    } 
}