package multiplicationtable;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int rows=12;//Number of rows
    int columns=12;//Number of columns
    
    //print the upper rows
    System.out.print("");
    for(int i=1;i<=rows;i++) {
    	System.out.print(i+"");
    }
    System.out.println();
    
    //printing separation line
    for(int i=0;i<=columns;i++) {
    	System.out.print("------");
    }
    System.out.println();
    
    //printing multiplication table
    for(int i=1;i<=rows;i++) {
    	System.out.print(i+"");
    for(int x=1; x<=columns;x++) {	
    	System.out.print(i*x+"");
    }
     System.out.println();		
     
     
    	
    	
    } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
