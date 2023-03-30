// https://www.codechef.com/problems/CHEFEREN
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
		    int n = s.nextInt();
		    int e = s.nextInt();
		    int o = s.nextInt();
		    int te=0,to = 0;
		    if(n%2==0){
		        te = te + n/2*e;
		        to = to + n/2*o;
		        System.out.println(to+te);
		    }else{
		        te = te + n/2*e;
		        to = to + ((n-n/2)*o);
		        System.out.println(te+to);
		    }
		    
		    
		}
	}
}
