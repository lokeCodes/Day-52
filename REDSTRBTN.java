// https://www.codechef.com/problems/REDSTRBTN
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
            if(x+y+z > 5){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		}
	}
}
