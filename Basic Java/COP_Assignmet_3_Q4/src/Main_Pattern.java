//COP_Assignment_3
/* 
Q4). Write below pattern using recursion.
	
	1
	1 2 1
	1 2 1 2 1
	1 2 1
	1
	*/
public class Main_Pattern {

    public static void main(String[] args){
    	
    	
    	
    	pattern(1);
    
    
    }
    
    
    public static void pattern(int i)
    {
    	for( int j=1;j<=i;j++)
    	{
    		
    		int k=1;
    		
    		if(j%2==0) {
    			System.out.print((k+1)+" ");
    		}
    		else
    		{
    			System.out.print(k+" ");
    		}	
    	}
    	System.out.println();
    	if(i<4)
    	{
    		pattern(i+2);
    	}
    	for( int j=1;j<=(i-2);j++)
    	{
    		
    		int k=1;
    		
    		if(j%2==0) {
    			System.out.print((k+1)+" ");
    		}
    		else
    		{
    			System.out.print(k+" ");
    		}	
    	}
    	System.out.println();
    }

}

