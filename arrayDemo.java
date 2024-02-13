package array;

public class arrayDemo {

	public static void main(String[] args) {

        int[] integers=new int[5];
        
        integers[0]=2;
        integers[1]=3;
        integers[2]=5;
        integers[3]=7;
        integers[4]=9;


   
        System.out.println(integers[0]);
        System.out.println(integers[1]);
        System.out.println(integers[2]);
        System.out.println(integers[3]);
        System.out.println(integers[4]);
       
        int[] ints=new int[10];
        for(int i:ints)
           System.out.println(i);
	}

}
class SumOfNumbers{
	public static void main(String[] args) {
		int[] ints= {2,3,4,5,7};
		int sum=0;
		for(int x: ints)
			sum += x;

		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + sum/ints.length);
		}
}