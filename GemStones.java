import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStones{

    public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int no_of_testcase=s.nextInt();
		String [] string=new String[no_of_testcase];
		int j;
		int gem_elements=0;
		char c;
		boolean found=false;
		String rdup = "";
		
		for(int i=0;i<no_of_testcase;i++)
		{
			string[i]=s.next();			
		}
		int len=string[0].length();
		for (int i = 0; i< len; i++) {
			   int count = 1;
			   for (int k = i+1; k < len; k++) {
				   if (string[0].charAt(i) == string[0].charAt(k)) {
						count++;
				   }
			   }
			   if (count == 1){
				   rdup += string[0].charAt(i);
			   }
		} 
		
		for(int i=0;i<rdup.length();i++)
		{
			j=1;
			c=rdup.charAt(i);
			find:
			while(j<no_of_testcase){
				if(string[j].indexOf(c)!=-1)
					found=true;
				else{
					found=false;
					break find;
				}
				j++;
			}
			if(found)gem_elements++;
		}
		System.out.println(gem_elements);
    }
}