package a75;

public class Rechtschreibpreufung {

public static void main(String[] args) {
String s=" Liebe Leserinnen und und Leser, heute ist der letzte Tag unserer Spendenkampagne. Als ich mich entschied, "
		+ "Wikipedia als gemeinnütziges  Projekt zu gründen, haben mich Leute gewarnt, dass ich diesen "
		+ "Schritt bereuen würde. Habe ich mir jemals vorgestellt, wieviel Geld wir mit Werbung hätten machen können? "
		+ "Sicher. Aber ich glaube niemand hätte mitgemacht. Niemand würde den Inhalten trauen. Um Wikipedias"
		+ " Unabhängigkeit zu schützen, gibt es keine Werbung. Sie wird finanziert,durch Spenden von durchschnittlich"
		+ " 20 €. jetzt sind Sie in Deutschland gefragt. Wenn alle, die das jetzt lesen, einen kleinen Beitrag"
		+ " leisten, ist unsere Spendenkampagne in einer Stunde vorüber. Schon der Preis einer Tasse Kaffee würde"
		+ " genügen. Über 8 MiLlionen Mal wird unser Spendenaufruf täglich angezeigt, aber nur 422.705 Menschen haben"
		+ " bisher gespendet. Es gibt Menschen, die sagen, dass wir in einer Zeit leben, in der Fakten nicht mehr zählen. "
		+ "Wikipedia ist das Gegenteil. Wir glauben, dass Fakten wichtig sind. Wenn Sie Wikipedia nützlich finden, nehmen"
		+ " Sie sich an diesem Freitag bitte eine Minute Zeit und geben Wikipedia mit Ihrer Spende etwas zurück."
		+ " Vielen Dank! Jimmy Wales, Wikipedia-Gründer";  
	
int maxWortlaenge=35;
char[] arr=s.toCharArray();
char[][] arr2d=new char[50][60];
char[] wort1=new char[maxWortlaenge];
char[] wort2=new char[maxWortlaenge];
	
	
int z=0;//2d Array wird mit 1d Array befüllt
for(int x=0;x<arr2d.length;x++){
	for(int y=0;y<arr2d[x].length;y++){
		if(z<arr.length){
		arr2d[x][y]=arr[z];
		z++;}else{
		break;
		}}}
	

int u=0;//ist der Zaehler vom 1d array
for(int x=0;x<arr2d.length;x++){
	for(int y=0;y<arr2d[x].length;y++){
		try{	
			
if(((arr[u]=='.')||(arr[u]==','))&&((arr[u-1]==' ')||(arr[u+1]!=' '))){//nach ./, muss leerzeichen kommen,davor nicht
if(((arr[u-1]<48)||(arr[u-1]>57))&&((arr[u+1]<48)||(arr[u+1]>57))){ //wenn ./, ist kein Bestandteil einer Zahl 
System.out.println("Fehler in Zeile "+x+", Spalte "+y+" :Leerzeichen falsch gesetzt");
}}

			
if((arr[u]=='.')||(arr[u]=='?')||arr[u]=='!'){//Satzanfang
if(arr[u]=='.'&&((arr[u-1]<48)||(arr[u-1]>57))&&((arr[u+1]<48)||(arr[u+1]>57))){//wenn . kein Bestanteil einer Zahl
if((arr[u+2]<65)||(arr[u+2]>90)){//es muss ein Großbuchstabe kommen A-Z
if((arr[u+2]!=220)&&(arr[u+2]!=196)&&(arr[u+2]!=214)){//Ä Ö Ü sind auch Großbuchstaben
if((arr[u+2]<48)||(arr[u+2]>57)){//ein Satz darf mit einer Zahl beginnen
System.out.println("Fehler in Zeile "+x+", Spalte "+y+" :Am Satzanfang schreibt man groß!");
}}}}}

			
if(arr[u]>65&&arr[u]<90){//Großbuchstabe
if(((arr[u-1]!=' ')&&(arr[u-1]!=45))||((arr[u+1]<97)||(arr[u+1]>122))){//links vom Gb kein' '/'-' oder rechts kein BS a-z 
if(((arr[u-1]!=' ')&&(arr[u-1]!=45))||((arr[u+1]!=228)&&(arr[u+1]!=246)&&(arr[u+1]!=252))){// ä ö ü sind erlaubt
System.out.println("Fehler in Zeile "+x+", Spalte "+y+" :Großbuchstabe oder Ziffer mitten im Wort");
}}}
			
			
if(arr[u-1]==' '){//neues Wort
int zw1=0;//Zaehler Wort1
int zw2=0;//zaehler Wort2
boolean doppelt=true;//doppelte Wörter
while(arr[u+zw1]!=' '){
wort1[zw1]=arr[u+zw1];
zw1++;
}
zw1++;
while(arr[u+zw1]!=' '){
wort2[zw2]=arr[u+zw1];
zw1++;
zw2++;
}
for(int m=0;m<wort1.length;m++){
if(wort1[m]!=wort2[m]){
doppelt =false;
}}
if(doppelt){
System.out.println("Fehler in Zeile "+x+", Spalte "+y+" :Doppeltes Wort");
}
wort1=new char[maxWortlaenge];
wort2=new char[maxWortlaenge];
}
			
}catch(Exception e){}//bei u=0 gibt es z.B kein arr[u-1]
if(u<arr.length){//arr[u] ist immer arr2d[x][y]
u++;}else{
break;}

}}

System.out.println();
for(int x=0;x<arr2d.length;x++){
	if(arr2d[x][0]!=000){
	System.out.printf("Zeile:%2d|",x);
	for(int y=0;y<arr2d[x].length;y++){
	System.out.print(arr2d[x][y]);
	}System.out.println();
	}else break;}
	
}}
