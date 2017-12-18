package com.muaz.checkers;

import java.util.Scanner;
public class Checkers {
public static void main(String[] args) {
		
		
		//Tahtayý olusturmak:
		String[][] board = new String[8][8];
		
		System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		for(int i=0;i<8;i++){
			
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
			
			for(int j=0;j<8;j++){
				if(i==1 || i==2  )
						board[i][j]="x";
				
				else if(i==5 || i==6)
	                	board[i][j]="o";
				else{
					board[i][j]=" ";
				}
					
					System.out.print("|"+" " + board[i][j]+ " " );
			}
			System.out.println("| " +i+".index");	}	
		
		for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		
		
		
		
		while(oyunbitti(board)){
		
		//player1:
		for(int i=0;i<1;i++){
			if(yemezorun1(board)){
				if(yürütme1(board))
					i--;
			}
			else{
				yeme1(board);
				if(!yemezorun1(board)){
						i--;
				}
				
			}
	if	(damayapma1(board))	;  
		}
		//player2
		for(int j=0;j<1;j++){
			if(yemezorun2(board)){
				if(yürütme2(board))
					j--;
			}
			else{
				yeme2(board);
				if(!yemezorun2(board)){
					j--;
				}
					
			}
			if(damayapma2(board));
		}
		
			
		}
	}
		

	
	
	
	
		
	
	
	
	
			public static boolean yürütme1(String[][]board){
				boolean q=false;
				Scanner input=new Scanner(System.in);
					
		System.out.println("Player 1 sýra sende :");
		System.out.println("oynatmak istediðin tasýn 1.indexini gir: ");
		int a=input.nextInt();
		System.out.println("oynatmak istediðin tasýn 2.indexini gir: ");
		int b=input.nextInt();
		System.out.println ("oynamak istedðin yerin 1.indexi :");
		int c=input.nextInt();
		System.out.println ("oynamak istedðin yerin 2.indexi :");
		int d=input.nextInt();
		if(a<8&&b<8&&c<8&&d<8&&a>-1&&b>-1&&c>-1&&d>-1){
			if(((board[a][b]=="x")&&(a+1==c && b==d)&&(board[a+1][b]==" "))||((board[a][b]=="x")&&(a==c && b+1==d)&&(board[a][b+1]==" "))||((board[a][b]=="x")&&(a==c && b==d+1)&&(board[a][b-1]==" "))){
			board[a][b]=" ";
			board[c][d]="x";
			
			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		}
		
		
			
			
			
		//Damnýn Hareketi player1:

				else	if(board[a][b]=="X"){
					
							
					damayürüme1(board,a,b,c,d);
					damayeme1(board,a,b,c,d);
					
		
		
		}
		else{
	     	System.out.println ("Player 1 hatalý oynama!!!");
			q=true;
		}
				}
	
	
		
		
		else{
		
			q=true;
		}
		
		return q;
}           
            public static boolean  yürütme2(String[][]board){
            	boolean a=false;
            	Scanner input=new Scanner(System.in);
            	System.out.println("Player 2 sende :");
		System.out.println("oynatmak istediðin tasýn 1.indexini gir: ");
		int q=input.nextInt();
		System.out.println("oynatmak istediðin tasýn 2.indexini gir: ");
		int w=input.nextInt();
		System.out.println ("oynamak istedðin yerin 1.indexi :");
		int e=input.nextInt();
		System.out.println ("oynamak istedðin yerin 2.indexi :");
		int r=input.nextInt();
		
		
		//iþlem yapýlacak basamak boþmu? ve oynann hamle 1 birim mi?
		if(q<8&&w<8&&e<8&&r<8&&q>-1&&w>-1&&e>-1&&r>-1){
				if(((board[q][w]=="o")&&(q==e+1 && w==r)&&(board[e][r]==" "))||((board[q][w]=="o")&&(q==e && w+1==r)&&(board[e][r]==" "))||((board[q][w]=="o")&&(q==e && w==r+1)&&(board[e][r]==" "))){
			board[q][w]=" ";
			board[e][r]="o";
			
			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
            	
            	
            }
	
		else if(board[q][w]=="O"){
			damayürüme2(board,q,w,e,r);
			damayeme2(board,q,w,e,r);
		}
		else{	
			System.out.println ("Player 2 hatalý oynama!!");
            	a=true;
		}
		}
            else{
            a=true;
            }
            return a;
            
}
            public static void yeme1(String[][] board){
        Scanner input=new Scanner(System.in);
        System.out.println("Player 1 sýra sende ve yeme hamlesini oyna :");
		System.out.println("oynatmak istediðin tasýn 1.indexini gir: ");
		int a=input.nextInt();
		System.out.println("oynatmak istediðin tasýn 2.indexini gir: ");
		int b=input.nextInt();
		System.out.println ("oynamak istedðin yerin 1.indexi :");
		int c=input.nextInt();
		System.out.println ("oynamak istedðin yerin 2.indexi :");
		int d=input.nextInt();
            //doðrusal olarak yeme:
            if(a<8&&b<8&&c<8&&d<8&&a>-1&&b>-1&&c>-1&&d>-1){
            	if(a<6){
            			if(board[a][b]=="x"&&(board[a+1][b]=="o"||board[a+1][b]=="O")&&a+2==c&&b==d&&board[a+2][b]==" "){
		
			board[a][b]=" ";
			board[a+1][b]=" ";
			board[c][d]="x";
			
			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
			
		}
            	}
            	if(b<6){
            		//yatay-saða  yeme:
			if(board[a][b]=="x"&&(board[a][b+1]=="o"||board[a][b+1]=="O")&&a==c&&b+2==d&&board[c][d]==" "){
			
			board[a][b]=" ";
			board[a][b+1]=" ";
			board[c][d]="x";

			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            	}
		
		
			
		}	
			if(b>1){
					//yatay-sola  yeme:
			if(board[a][b]=="x"&&(board[a][b-1]=="o"||board[a][b-1]=="O")&&board[c][d]==" "&&a==c&&b-2==d){
			
			board[a][b]=" ";
			board[a][b-1]=" ";
			board[c][d]="x";

			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");

	}
			}
		
	if(board[a][b]=="X"){
		damayeme1(board,a,b,c,d);
		
	}
            } 
            	}
            public static void yeme2(String[][] board){
            		Scanner input=new Scanner(System.in);
            	System.out.println("Player 2 sende :");
		System.out.println("oynatmak istediðin tasýn 1.indexini gir: ");
		int q=input.nextInt();
		System.out.println("oynatmak istediðin tasýn 2.indexini gir: ");
		int w=input.nextInt();
		System.out.println ("oynamak istedðin yerin 1.indexi :");
		int e=input.nextInt();
	
	    System.out.println ("oynamak istedðin yerin 2.indexi :");
		int r=input.nextInt();
		//doðrusal olarak yeme:
		if(q>1){
			if(board[q][w]=="o"&&(board[q-1][w]=="x"||board[q-1][w]=="X")&&board[e][r]==" "&&q-2==e&&r==w){
			board[q][w]=" ";
			board[q-1][w]=" ";
			board[e][r]="o";

			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
			
	}
		}
		if(w<6){
				//yatay-saða doðru  yeme:
			if(board[q][w]=="o"&&(board[q][w+1]=="x"||board[q][w+1]=="X")&&board[e][r]==" "&&q==e&&w+2==r&&w<6){
			board[q][w]=" ";
			board[q][w+1]=" ";
			board[e][r]="o";

			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
			
		}
		}
		if(w>1){
			//yatay-sola doðru yeme:
		if(board[q][w]=="o"&&(board[q][w-1]=="x"||board[q][w-1]=="X")&&board[e][r]==" "&&q==e&&w-2==r&&w>1){
			board[q][w]=" ";
			board[q][w-1]=" ";
			board[e][r]="o";

			//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  

			}
		}
		
			if(board[q][w]=="O"){
				damayeme2(board,q,w,e,r);
			}
			
            }
            public static boolean  yemezorun1(String[][] board){
            	boolean a=true;
            for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
			
			
			
				if(i<6){
					if((board[i][j]=="x"&&(board[i+1][j]=="o"||board[i+1][j]=="O")&&board[i+2][j]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
					a=false;
					
				}
				}
				if(j<6){
					if((board[i][j]=="x"&&(board[i][j+1]=="o"||board[i][j+1]=="O")&&board[i][j+2]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
					a=false;
					}
				}
					if(j>1){
						if((board[i][j]=="x"&&(board[i][j-1]=="o"||board[i][j-1]=="O")&&board[i][j-2]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
				a=false;
				}
					}
				
			
				
			}
			}
	
            
			return a;
	
			
            }
            public static boolean  yemezorun2(String[][] board){
            	boolean a=true;
            
				//tahta üzerinde yeme zorunluluðu var mý??
				for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(1<i){
					if((board[i][j]=="o"&&(board[i-1][j]=="x"||board[i-1][j]=="X")&&board[i-2][j]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
					a=false;
					
				}
				}
				if(j<6){
					if((board[i][j]=="o"&&(board[i][j+1]=="x"||board[i][j+1]=="X")&&board[i][j+2]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
					a=false;
					}
				}
					if(j>1){
						if((board[i][j]=="o"&&(board[i][j-1]=="x"||board[i][j-1]=="X")&&board[i][j-2]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
				 a=false;
				}
					}
				
			}
				
		}
		return a;

            }
            public static boolean  oyunbitti(String[][] board){
            	boolean sonuc=true;
           boolean p1=false;
           boolean p2=false;
              boolean  a=false;
              boolean b=false;
              boolean c=false;
              boolean d=false;
              for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(board[i][j]=="x"){
						a=true;
				}
				
		}
            	
            }
            
              
              for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(board[i][j]=="o"){
						b=true;
				}
				
		}
            	
            }
             for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(board[i][j]=="X"){
					c=true;
				}
				
		}
            	
            }
             for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(board[i][j]=="O"){
						d=true;
				}
				
		}
            	
            }
            
            if((a==true||c==true)&&b==false&&d==false){
            p1=true;
            System.out.println ("Player 1 KazanDIn!!");
            }
            if((b==true||d==true)&&a==false&&c==false){
            p2=true;
            	System.out.println ("Player 2 kazandýn!!");
            }
            if(p1==true){
            	sonuc=false;
            }
            if(p2==true){
            	sonuc=false;
            }
            return sonuc;
           
            }
            public static boolean damayapma1(String[][]board){
            	boolean a=false;
            	for(int i=0;i<8;i++){
            		
            		if(board[7][i]=="x"){
            			System.out.println ();
            			System.out.println ("Player 1 bir daman var:-->");
            			board[7][i]="X";
            			a=true;

            			//tahtadaki son hali bastýrmak icin:
            			//TODO
            			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
            			for(int i1=0;i1<8;i1++){
            				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
            				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i1][j]+ " " );	}	System.out.println("| "+i1+".index");
            		}
            			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
              
            		}
            	}
            
            	
            return a;	
            }
            public static boolean damayapma2(String[][]board){
            	      	boolean a=false;
            	for(int i=0;i<8;i++){
            		
            		if(board[0][i]=="o"){
            			System.out.println ();
            			System.out.println ("Player 2 bir daman var:-->");
            			board[0][i]="O";
            			a=true;

            			//tahtadaki son hali bastýrmak icin:
            			//TODO
            			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
            			for(int i1=0;i1<8;i1++){
            				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
            				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i1][j]+ " " );	}	System.out.println("| "+i1+".index");
            		}
            			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
              
            		}
            	}
            
            	
            return a;
            	
            }
            public static void damayürüme1(String[][]board,int a,int b,int c,int d){
            	      	int g=d-b;
            		
			         	int t=0;
			         	int k=0;
			         	int l=b-d;
			         	
			         	
			         	
			         	
		// yatayda hareketi:
		
		
		            if((a==c)){
		            while(b<=d){
		            	
		    if (board[a][b]==" "){
		    		t++;
		    		//if aradaki kareler boþ mu? kontrolü:::
		    		//boþ deðilse yürüme hamlesi çalýþmaz
		    		
		    		if(t==g){
		    			board[a][d-g]=" ";
		    			board[c][d]="X";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		
		    	}
		    	
		       b++;
		    }
		    while(d<=b){
		    	if(board[a][b]==" "){
		    		k++;
		    		if(k==l){
		    			board[a][l+d]=" ";
		    			board[c][d]="X";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		    	}
		    	b--;
		    }
		}
		
		
		
		
	//dikey yürüme:
	int q=0;
	int w=0;
	int r=a-c;
	int y=c-a;
	
	if((b==d)){
		            while(a<=c){
		            	
		    if (board[a][b]==" "){
		    		w++;
		    		//if aradaki kareler boþ mu? kontrolü:::
		    		//boþ deðilse yürüme hamlesi çalýþmaz
		    		
		    		if(w==y){
		    			board[c-y][b]=" ";
		    			board[c][d]="X";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		
		    	}
		    	
		       a++;
		    }
		    while(c<=a){
		    	if(board[a][b]==" "){
		    		q++;
		    		if(q==r){
		    			board[r+c][b]=" ";
		    			board[c][d]="X";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		    	}
		    	a--;
		    }
	
		
            	
            }
            }
            public static void damayürüme2(String[][]board,int q,int w,int e,int r){
                    	int g=r-w;
			         	int t=0;
			         	int k=0;
			         	int l=w-r;
			         	int f=e-q;
			         	//player 2 yatay dama yürütme ::
 if(q==e){
		            while(w<=r){
		            	
		    if (board[q][w]==" "){
		    		t++;
		    		if(t==g){
		    			board[q][r-g]=" ";
		    			board[e][r]="O";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		    			
		    		
		    	}
		    	
		       w++;
		    }
		   while(r<=w){
		    	if(board[q][w]==" "){
		    		k++;
		    		if(k==l){
		    			board[q][l+r]=" ";
		    			board[e][r]="O";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		    	}
		    	w--;
		    }
		}
		
		int a=0;
		int b=0;
		int c=e-q;
		int d=q-e;
		
		
	//dikey yürüme
	
		if((w==r)){
		            while(q<=e){
		            	
		    if (board[q][w]==" "){
		    		a++;
		    		//if aradaki kareler boþ mu? kontrolü:::
		    		//boþ deðilse yürüme hamlesi çalýþmaz
		    		
		    		if(a==c){
		    			board[e-c][w]=" ";
		    			board[e][r]="O";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		
		    	}
		    	
		       q++;
		    }
		    while(e<=q){
		    	if(board[q][w]==" "){
		    		b++;
		    		if(b==d){
		    			board[e+d][w]=" ";
		    			board[e][r]="O";

		    			//tahtadaki son hali bastýrmak icin:
		    			//TODO
		    			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
		    			for(int i=0;i<8;i++){
		    				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
		    				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		    		}
		    			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
		      
		    		}
		    	}
		    	q--;
		    }
	
		
            	
            }
		
            	
            }
            public static void  damayemezor1(String[][]board){
            	
            		
            for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(board[i][j]=="X"){
					for(int y=1;y<7;y++){
					if(	board[i][y]=="o"||board[i][y]=="O"){
						
							int h=0;
							int g=j-y;
							int f=0;
							int z=y-j;
						
						//yatay sað:
						if(y>j){
						
						while(j<y){
						
								if(board[i][j]==" "){
										f++;
								}
								if(f==z-1){
									if(board[i][j+1]==" "){
										System.out.println ("Yeme zorunlulugu damaile::"+i+" "+(y-z));
									}
									
									
								}
									
							j++;	
							}
						}
						//yatay sol::
						if(y<j){
							while(y<j){
							
								if(board[i][j]==" "){
										h++;
								}
								if(h==g-1){
									if(y-1==0){
										System.out.println ("Yeme zorunlulugu dama ile::"+i+" "+(g+y));
									}
									
									
								}
									
							j--;
							}	
							}
							
							
						}
					}
					
			
					for(int t=1;t<7;t++){
						if(board[t][j]=="o"||board[t][j]=="O"){
							int a=0;
							int b=t-i;
							int c=0;
							int d=i-t;
							
			if(t>i){
							
						while(i<t){
						
								if(board[i][j]==" "){
										a++;
								}
								if(a==b){
									if(t+1==0){
										System.out.println ("Yeme zorunlulugu dama ile::"+(t-b)+" "+j);
									}
									
									
								}
									
							i++;	
							}
								
							}
			if(t<i){
					while(t<i){
						
								if(board[i][j]==" "){
										c++;
								}
								if(c==d-1){
									if(board[i-2][j]==" "){
										System.out.println ("Yeme zorunlulugu dama ile::"+(t+d)+" "+j);
									}
									
									
								}
									
							i--;	
							}
								
							}
						}
					}
						
					
				}
				
            
            
}
            }
            }
            public static boolean damayemezor2(String[][]board){
            		boolean a=true;
            
				//tahta üzerinde yeme zorunluluðu var mý??
				for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
			//dikey::
				if(1<i){
					if((board[i][j]=="O"&&(board[i-1][j]=="x"||board[i-1][j]=="X")&&board[i-2][j]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
					a=false;
					
				}
				}
				if(i<6){
					if((board[i][j]=="O"&&(board[i+1][j]=="x"||board[i+1][j]=="X")&&board[i+2][j]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
					a=false;
					}
				}
				if(j<6){
					if((board[i][j]=="O"&&(board[i+1][j]=="x"||board[i+1][j]=="X")&&board[i][j+2]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
					a=false;
					}
				}
					if(j>1){
						if((board[i][j]=="o"&&(board[i-1][j]=="x"||board[i-1][j]=="X")&&board[i][j-2]==" ")){
					System.out.println ("Yeme zorunluluðu var!!"+i+" ve  "+j+" indexli taþla oyna");
				 a=false;
				}
					}
				
			}
				
		}
		return a;
            	
            }
            public static void damayeme1(String[][] board,int a,int b,int c,int d){
            
            	//yatay yeme::
            	if(a==c){
            	
            			if(board[a][b]=="X"&&b<=d){
            				int h=0;
            				int j1=0;
            				int n=b;
            				while(b<=d){
            					int t=0;
            					if(board[a][b]==" "){
            						j1++;
            		 		        t=1;
            		 	}
            		 	if(t==0){
            		 		if(board[a][b]=="o"||board[a][b]=="O"){
            		 			
            		 		
            		 			int v=d-b;
            		 			int y=0;
            		 			while(b<=d){
            		 				
            		 				if(board[a][b]==" "){
            		 				y++;
            		 				if(v==y){
            		 					h=1;
            		 					board[a][n]=" ";
            		 					board[c][d]="X";
            		 					board[a][d-v]=" ";
            		 					//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            		 					
            		 				}
            		 			}
            		 			b++;
            		 			}
            		 		
            		 		}
            		 	}
            		 	b++;
            				}
     	
            	}
            	if(board[a][b]=="X"&&d<=b){
            		int q=0;
            		int w=0;
            		int e=b;
            		while(d<=b){
            			int u=0;
            			if(board[a][b]==" "){
            				 q++;
            				u=1;
            			}
            			if(u==0){
            				if(board[a][b]=="o"||board[a][b]=="O"){
            					int k=b-d;
            					int l=0;
            					while(d<=b){
            						if(board[a][b]==" "){
            							l++;
            							if(k==l){
            								board[a][e]=" ";
            								board[c][d]="X";
            								board[a][k+d]=" ";
            								//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            							}
            						}
            						b--;
            					}
            				}
            			}
            			b--;
            		}
            		
            	}
           
            		
            		 
            	
            }
            //Dikey yeme::
            if(b==d){
            	if(board[a][b]=="X"&&c<=a){
            				int h=0;
            				int j1=0;
            				int n=a;
            				while(c<=a){
            					int t=0;
            					if(board[a][b]==" "){
            						j1++;
            		 		        t=1;
            		 	}
            		 	if(t==0){
            		 		if(board[a][b]=="o"||board[a][b]=="O"){
            		 			
            		 		
            		 			int v=a-c;
            		 			int y=0;
            		 			while(c<=a){
            		 				
            		 				if(board[a][b]==" "){
            		 				y++;
            		 				if(v==y){
            		 					h=1;
            		 					board[n][b]=" ";
            		 					board[c][d]="X";
            		 					board[v+c][b]=" ";
            		 					//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            		 				}
            		 			}
            		 			a--;
            		 			}
            		 		
            		 		}
            		 	}
            		 	a--;
            				}
            }
            if(board[a][b]=="X"&&a<=c){
            				int h=0;
            				int j1=0;
            				int n=a;
            				while(a<=c){
            					int t=0;
            					if(board[a][b]==" "){
            						j1++;
            		 		        t=1;
            		 	}
            		 	if(t==0){
            		 		if(board[a][b]=="o"||board[a][b]=="O"){
            		 			
            		 		
            		 			int v=c-a;
            		 			int y=0;
            		 			while(a<=c){
            		 				
            		 				if(board[a][b]==" "){
            		 				y++;
            		 				if(v==y){
            		 					
            		 					h=1;
            		 					board[n][b]=" ";
            		 					board[c][d]="X";
            		 					board[c-v][b]=" ";
            		 					//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            		 				}
            		 			}
            		 			a++;
            		 			}
            		 		
            		 		}
            		 	}
            		 	a++;
            				}
            }
            
}
}
            public static void damayeme2(String[][] board,int q,int w,int e,int r){
            	//yatay yeme::
            	if(q==e){
            	
            			if(board[q][w]=="O"&&w<=r){
            				int h=0;
            				int j1=0;
            				int n=w;
            				while(w<=r){
            					int t=0;
            					if(board[q][w]==" "){
            						j1++;
            		 		        t=1;
            		 	}
            		 	if(t==0){
            		 		if(board[q][w]=="x"|board[q][w]=="X"){
            		 			
            		 		
            		 			int v=r-w;
            		 			int y=0;
            		 			while(w<=r){
            		 				
            		 				if(board[q][w]==" "){
            		 				y++;
            		 				if(v==y){
            		 					h=1;
            		 					board[q][n]=" ";
            		 					board[e][r]="O";
            		 					board[q][r-v]=" ";
            		 					//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            		 				}
            		 			}
            		 			w++;
            		 			}
            		 		
            		 		}
            		 	}
            		 	w++;
            				}
     	
            	}
            	if(board[q][w]=="O"&&r<=w){
            		int f=0;
            		int h=0;
            		int j1=w;
            		while(r<=w){
            			int u=0;
            			if(board[q][w]==" "){
            				 f++;
            				u=1;
            			}
            			if(u==0){
            				if(board[q][w]=="x"||board[q][w]=="X"){
            					int k=w-r;
            					int l=0;
            					while(r<=w){
            						if(board[q][w]==" "){
            							l++;
            							if(k==l){
            								board[q][j1]=" ";
            								board[e][r]="O";
            								board[q][k+r]=" ";
            								//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            							}
            						}
            						w--;
            					}
            				}
            			}
            			w--;
            		}
            		
            	}
           
            		
            		 
            	
            }
            //dikey yeme::
            if(w==r){
            	if(board[q][w]=="O"&&e<=q){
            				int h=0;
            				int j1=0;
            				int n=q;
            				while(e<=q){
            					int t=0;
            					if(board[q][w]==" "){
            						j1++;
            		 		        t=1;
            		 	}
            		 	if(t==0){
            		 		if(board[q][w]=="x"||board[q][w]=="X"){
            		 			
            		 		
            		 			int v=q-e;
            		 			int y=0;
            		 			while(e<=q){
            		 				
            		 				if(board[q][w]==" "){
            		 				y++;
            		 				if(v==y){
            		 					h=1;
            		 					board[n][w]=" ";
            		 					board[e][r]="O";
            		 					board[v+e][w]=" ";
            		 					//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            		 				}
            		 			}
            		 			q--;
            		 			}
            		 		
            		 		}
            		 	}
            		 	q--;
            				}
            }
            if(board[q][w]=="O"&&q<=e){
            				int h=0;
            				int j1=0;
            				int n=q;
            				while(q<=e){
            					int t=0;
            					if(board[q][w]==" "){
            						j1++;
            		 		        t=1;
            		 	}
            		 	if(t==0){
            		 		if(board[q][w]=="x"||board[q][w]=="X"){
            		 			
            		 		
            		 			int v=e-q;
            		 			int y=0;
            		 			while(q<=e){
            		 				
            		 				if(board[q][w]==" "){
            		 				y++;
            		 				if(v==y){
            		 					h=1;
            		 					board[n][w]=" ";
            		 					board[e][r]="O";
            		 					board[e-v][w]=" ";
            		 					//tahtadaki son hali bastýrmak icin:
			//TODO
			System.out.println("  0.  1.  2.  3.  4.  5.  6.  7.");
			for(int i=0;i<8;i++){
				for(int j=0;j<8;j++){	System.out.print("+---");	}	System.out.println("+");	
				for(int j=0;j<8;j++){	System.out.print("|"+" " + board[i][j]+ " " );	}	System.out.println("| "+i+".index");
		}
			for(int x=0;x<8;x++){	System.out.print("+---");	}	System.out.println("+");
  
            		 					
            		 				}
            		 			}
            		 			q++;
            		 			}
            		 		
            		 		}
            		 	}
            		 	q++;
            				}
            }
            
}
            
            	
            }
}
