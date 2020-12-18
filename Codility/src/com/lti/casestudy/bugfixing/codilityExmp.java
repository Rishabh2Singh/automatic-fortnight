package com.lti.casestudy.bugfixing;

public class codilityExmp {
	public int solution(String S) {
        int count=0;
        char a[]=new char[S.length()];
        for(int i=0;i<S.length();i++){
            a[i]=S.charAt(i);
        }
        if(a.length==1)
            return -1;
        else if(a[0]=='H' && a[1]=='H')
            return -1;
        else if(a[0]=='H' && a[1]=='-'){
            count++;
            a[1]='T';
        }
            for(int i=1;i<a.length-1;i++){
            	System.out.println(a[i]);
                if(a[i]=='T' || a[i-1]=='T')
                    continue;
                else if(a[i]=='H'){
                    if(a[i-1]=='-' && a[i+1]=='-'){
                        a[i+1]='T';
                        count++;
                        System.out.println("-- ");
                    }
                    else if(a[i-1]=='-' && a[i+1]=='H'){
                        a[i-1]='T';
                        count++;
                        System.out.println("-H ");
                    }
                    else if(a[i-1]=='H' && a[i+1]=='-'){
                        a[i+1]='T';
                        count++;

                        System.out.println("H- ");
                    }
                    else if(a[i-1]=='H' && a[i+1]=='H')
                        return -1;
                }
            
        }
        if(a[a.length-1]=='H' && a[a.length-2]=='-')
            count++;
        for(char x:a)
        	System.out.print(x+" ");
        return count;
    }
	public static void main(String[] args) {
		System.out.println(new codilityExmp().solution("H-HH-HH-"));

	}

}
