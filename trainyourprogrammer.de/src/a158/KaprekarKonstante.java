package a158;

public class KaprekarKonstante {
	public static void main(String[] args) {
		
		String s="0000";
		String sNeu="";
		String temp="";
		
		char[] c =s.toCharArray();
		for(int x=0;x<10;x++){
			c[0]=(char)(x+48);
		for(int y=0;y<10;y++){
			c[1]=(char)(y+48);
			for(int z=0;z<10;z++){
				c[2]=(char)(z+48);
				for(int q=0;q<10;q++){
					c[3]=(char)(q+48);
					
					temp=String.valueOf(c);
					if(!(c[0]==c[1]&&c[0]==c[2]&&c[0]==c[3])
							&&(Integer.valueOf(temp)<10000)){
						// Hier kann man den auszugebenden Bereich ändern  		                                
						s=sNeu=String.copyValueOf(c);
						char[] cMax=s.toCharArray();
						char[] cMin=s.toCharArray();
						int d1=0;
						int d2=0;
						
						do{
							s=sNeu;
							cMax=s.toCharArray();
							cMin=s.toCharArray();
						for(int u=0;u<c.length;u++){
							int max=-1;
							int positionMax=-1;
						for(int u2=u;u2<c.length;u2++){
							if(cMax[u2]>max){
								max=cMax[u2];
								positionMax=u2;
								int u3=cMax[u];
								cMax[u]=(char)max;
								cMax[positionMax]=(char)u3;
							}
						}
						}	
						
						for(int u=0;u<c.length;u++){
							int min=99;
							int positionMin=-1;
						for(int u2=u;u2<c.length;u2++){
							if(cMin[u2]<min){
								min=cMin[u2];
								positionMin=u2;
								int u3=cMin[u];
								cMin[u]=(char)min;
								cMin[positionMin]=(char)u3;
							}
						}
						}	
						temp=s;
						if(d1!=0){
						System.out.print("Neue Zahl:"+d1+"-"+d2+"="+s+"  ");
						}else{
							System.out.print("Startzahl:"+s+"  ");
						}
						
						s=String.valueOf(cMax);
						d1=Integer.valueOf(s);
						
						s=String.valueOf(cMin);
						d2=Integer.valueOf(s);
						
						System.out.print("max:"+String.valueOf(cMax)+"  ");
						System.out.print("min:"+String.valueOf(cMin)+"  ");
						
						sNeu=String.valueOf(d1-d2);
						sNeu=String.format("%04d", Integer.valueOf(sNeu));
						}while(!(sNeu.equals(temp)));
						System.out.println("=>Finales Ergebnis:"+sNeu);
		}
		}
		}
		}
		}
		
	}
}