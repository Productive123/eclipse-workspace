package com.ev.odev;
import java.util.Scanner;

public class ikinciderecedenklem {

	public static void main(String[] args) {
	
    Scanner sc= new Scanner (System.in);
    System.out.println("(ax� + bx + c)ikinci dereceden bir denklemdir.\n Denklemdeki sabitleri asagidaki gibi s�rayla giriniz :");
    System.out.printf("a degerini giriniz:");
    double a=sc.nextInt();
    System.out.printf("b degerini giriniz:");
    double b=sc.nextInt();
    System.out.printf("c degerini giriniz:");
    double c=sc.nextInt();
    
    double delta=(b * b)- (4 * a * c);
    if (delta >0 ) {
    	double x1=((-1*b)-Math.sqrt(delta))/(2*a);
    	double x2=((-1*b)+Math.sqrt(delta))/(2*a);
        System.out.println("x1="+ x1+ "\n x2=" + x2);
        
    }
        if (delta<0) {
        	System.out.println("Denklemin ger�el k�k� yoktur.");
        }
        if (delta==0){
        	double x =(-1 * b)/(2 * a);
        	System.out.println("�ak���k iki k�k� vard�r x1=x2"+x);
        }
    
    

    	
	
	
	
	
	
	}

}
