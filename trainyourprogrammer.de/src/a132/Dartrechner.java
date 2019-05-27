package a132;

public class Dartrechner {

	public static void main(String[] args) {
	int n=171;
	int[] arr20=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	String[][]res=new String[n][500000];
	System.out.println(arr20.length);
	
	int t1=0;
	int t2=0;
	int t3=0;
	int m=0;
	int zaeler=0;
	String s1="";
	String s2="";
	boolean doppel=false;
	
	while(zaeler<n){
	for(int x=0;x<23;x++){
		for(int y=0;y<23;y++){
			for(int z=0;z<22;z++){
				
				if(z==21){
				t3=50;
				}else
				t3=(arr20[z]*2);	
				
				if(y==21){
				t2=25;
				}else if(y==22){
				t2=50;
				}else
				t2=arr20[y];
				
				if(x==21){
				t1=25;
				}else if(x==22){
				t1=50;
				}else
				t1=arr20[x];;
					
				if((zaeler-(t3+t2+t1)==0)&&t3!=0){
					res[zaeler][m]="[s"+t1+"-s"+t2+"-d"+t3+"]";
					m++;
				}
				
				if((t1>1)&&(t2>1)){
				if((t1!=25)&&(t1!=50)&&(t2!=50)&&(t2!=25)){	
					for(int g=1;g<4;g++){//alle Kombinationen d1 d2 double und triple
						for(int h=1;h<4;h++){
						if(g==1)
						s1="s";	
						if(g==2)
						s1="d";
						if(g==3)
						s1="t";
						if(h==1)
						s2="s";	
						if(h==2)
						s2="d";
						if(h==3)
						s2="t";
						t1=t1*g;
						t2=t2*h;
						if((zaeler-(t3+t2+t1)==0)&&t3!=0){
							res[zaeler][m]="["+s1+t1/g+"-"+s2+t2/h+"-d"+t3+"]";
							m++;
							}else if(((zaeler-(t3+t2+t1)==0)&&t3==0)&&s2.equals("d")){
							res[zaeler][m]="["+s1+t1/g+"-"+s2+t2/h+"-"+ ""+t3+"]";
							m++;
							}else if(t2==0&&t3==0&&s1.equals("d"))
							res[zaeler][m]="["+s1+t1/g+"-"+t2/h+"-"+t3+"]";
							m++;
							
						t1=t1/g;
						t2=t2/h;
					}
					}
				}}
				
				if(t1!=25&&t1!=50){
				if((t2==25)||(t2==50)){
					for(int v=2;v<4;v++){
					
						
					if(v==2)
					s1="d";
					if(v==3)
					s1="t";
					t1=t1*v;
					if((zaeler-(t3+t2+t1)==0)&&t3!=0){
						res[zaeler][m]="["+s1+t1+"-"+t2+"-"+t3+"]";
						m++;
						}
					t1=t1/v;
					}
				}
				}
				
				if(t2!=25&&t2!=50){
				if((t1==25)||(t1==50)){
					for(int v=2;v<4;v++){
					t2=t2*v;
					if((zaeler-(t3+t2+t1)==0)&&t3!=0){
						res[zaeler][m]="["+t1+"-"+t2+"-"+t3+"]";
						m++;
						}
					t2=t2/v;
					}
				}
				}
				
				
				
				}
			}
		}
	zaeler++;
	m=0;
	}
	
	
	for(int x=0;x<171;x++){
	System.out.print("Punkte:"+x);
	for(int y=0;y<7;y++){
	System.out.print(res[x][y]+" ");
	}System.out.println();
	}
	
	
}
}