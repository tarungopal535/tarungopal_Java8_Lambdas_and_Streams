package java8Features;

import java.util.ArrayList;
import java.util.Scanner;
class Average{
	double average(ArrayList<Integer> l ) {
		int length = l.size();
		int sum =0;
		for(int i=0;i<length;i++) {
			sum+= (int)l.get(i);
		}
		return (double)(sum/length);
	}
}
public class AverageofList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n;
        int i,t;
        double res;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the list : ");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            t=sc.nextInt();
            list.add(t);
        }
        System.out.println(list);
        Average avg = new Average();
        res=avg.average(list);
        
        System.out.println("Average : "+res);
	}

}
