package placement;

import java.util.Scanner;

public class AdjacentCharacters {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        pair(s,0);
        System.out.println(s1);
        sc.close();
        for(int i=0;i<s.length();i++)
        {
            s1 = s1+s.charAt(i);
            if(i == s.length()-1) return;
        
        if(s.charAt(i) == s.charAt(i+1)){
            s1 = s1+"*";
        }
        }
        
    }
    static String s1="";
    private static void pair(String s, int i){
        s1=s1+s.charAt(i);
        if(i == s.length()-1) return;
        if(s.charAt(i)==s.charAt(i+1)){
            s1=s1+"*";
        }
        pair(s,i+1);
    }
   
}
