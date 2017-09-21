package learn;

public class Torch {
         public void Switch()
         {
    	boolean sys = true;
    	System.out.println("手电筒的开关关着");
    	if (this.power==0)
    			{
        	System.out.println("手电筒没电了");

    	}
    	else{
        	System.out.println("手电筒还有"+this.power+"格电");

    	}
         }
    	public void getpower(int p)
    	{
    		this.power=this.power+p;
    		System.out.println("手电筒还有"+this.power+"格电");
    	}
    	
    
	private int power = 0;
	
}
