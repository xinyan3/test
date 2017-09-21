package learn;

public class cup implements Cupint {
            int water=0;
            interface Cup {
            	int water=0;
            }		
            
      
	  public void addwater(int w){
	         this.water=this.water+w;
	         System.out.println("我的杯子里加了"+w+"ml水");   
	     }
	  public void drinkwater(int w){
	         this.water=this.water-w;
	         System.out.println("我的杯子里少了"+w+"ml水");   
	     }
	  int a=100;
	public void seecup ()
	{  
	if (this.water<this.a)  {
      System.out.println("我的杯子里有没有水，需要加水");
      for (int i=0; i< 10; i++) {
    	     this.water=this.water+10;
    	     System.out.println("我的杯子里加了10ml水");
    	  }
      
      }
     else
      {
   	   System.out.println("我的杯子里有"+water+"ml水");   
      }
	}
	@Override
	public void addWater(int w) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void drinkWater(int w) {
		// TODO Auto-generated method stub
		
	}
}
