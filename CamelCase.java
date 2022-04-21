package placement;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        char res[] = s.toCharArray();
        int index=1,i;
        res[0] = Character.toUpperCase(res[0]);
        sc.close();
        for(i = 1;i<res.length;i++){
            if(res[i] == ' '){
                res[i+1] = Character.toUpperCase(res[i+1]);
                continue;
        }
        else{
            res[index++]=res[i];
        }
    }
    for(i=0;i<index;i++){
        System.out.print(res[i]);
    }
}

}
