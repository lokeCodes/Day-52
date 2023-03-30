// https://www.codechef.com/problems/COUGAME
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
		    int g = s.nextInt();
		    int b = s.nextInt();
		    if(b>g){
		        System.out.println(b-g);
		    }
		}
	}
}
