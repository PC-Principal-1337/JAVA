package a118;

public class Dupletten {
	public static void main(String[] args) {
	int counter=0;
	int[] arr=new int[]{0, 3, 3, 3, 2, 7, 7, 7, 7, 3, 2, 1, 1, -2, 4, 4, 8, 9, 8, 6};
	for(int x=0;x<arr.length;x++){
	try{
	if(arr[x]==arr[x+1]){
	counter++;
	x++;
	}
	}catch(Exception ArrayIndexOutOfBoundsException){}
	}
	System.out.println(counter);
	}
}
