package a137;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ZahlenUebersetzer {
public static void main(String[]args){
System.out.println("Welche Zahl möchten sie ins Englische übersetzen?(1-999)");

int zahl=-1;

while(!(zahl>0&&zahl<1000)){
try{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
zahl=Integer.parseInt(in.readLine());
}catch(Exception e){
System.out.println("Eingabe war keine Zahl");
}
}
	
String arr19[]=new String[]{"","one","two","three","four","five","six","seven","eight","nine",
		"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};	
	
String stelle2[]=new String[]{"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

//modulo 10 entspricht der Stelle "ganz rechts" von der Zahl, geteilt durch 10 entfernt diese Stelle
String ausgabe="";
int mod=0;

	mod+=(zahl/10)%10;//die ersten 19 Zahlen haben an zweiter Stelle eine 1 oder 0
	if(mod>1){//wenn nicht 19, füge einerstelle hinzu, teile durch 10
	mod=zahl%10;
	ausgabe=arr19[mod];
	zahl=zahl/10;	
	mod=zahl%10;
	
	if(!(ausgabe.equals(""))){//Zehnerpotenzen:wenn Einerstelle=0 lasse "-" weg
	ausgabe=stelle2[mod]+"-"+ausgabe;
	}else{
	ausgabe=stelle2[mod];
	}
	zahl=zahl/10;
	
	}else{//1-19
	mod=(zahl%10)+((zahl/10)%10)*10;
	ausgabe=arr19[mod];
	zahl=zahl/100;
	}
	
	if(zahl>=1){//wenn Hunderterstelle vorhanden
	mod=zahl%10;
	if(!(ausgabe.equals(""))){
	ausgabe=arr19[mod]+ " hundred and "+ausgabe;
	}else{
	ausgabe=arr19[mod]+ " hundred";
	}
	}
	System.out.println(ausgabe);
	
}
}
