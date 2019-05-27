package a152;
import java.util.Scanner;

public class Zahlenschnecke {
public static void main(String []args){	
int n=-1;
System.out.println("aus welcher Zahl soll eine Schnecke erstellt werden?");
Scanner scan=new Scanner(System.in);
try{
n=Integer.parseInt(scan.nextLine());
}catch(Exception e){
System.out.println("Eingabe war kein Integer");
System.exit(0);
}

//int[][]arr=new int[][]




System.out.println("Im Uhrzeigersinn(r) oder gegen Uhrzeigersinn(l)");
int richtung=-1;
if(scan.nextLine().equals("r")){
richtung=0;}
else if(scan.equals("l")){
richtung=1;	
}else{
System.exit(0);
}

boolean ecke=false;
if(richtung==0){
while(n>0){
//for(int x=0;x<)
	
	
	
	
}
}
	
}
}