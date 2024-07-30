package Permutation;

import java.util.HashSet;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
		String g="abc";
		HashSet<String> d=new HashSet<>();
		for(int i=0;i<g.length();i++)
		{
		    String ans=g.substring(i+1,g.length())+g.substring(0,i+1);
            System.out.println(ans);
		}
		//System.out.print(d);
    }
}
