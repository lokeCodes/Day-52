// https://www.codechef.com/problems/CHSFORMT
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int res = a+b;
		    if(res<3){
		        System.out.println(1);
		    }else if(res>=3 && res<=10){
		        System.out.println(2);
		    }else if(res>=11 && res<=60){
		        System.out.println(3);
		    }else{
		        System.out.println(4);
		    }
		}
	}
}
