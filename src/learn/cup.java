package learn;

public class cup implements Cupint {
            int water=0;
            interface Cup {
            	int water=0;
            }		
            
      
	  public void addwater(int w){
	         this.water=this.water+w;
	         System.out.println("�ҵı��������"+w+"mlˮ");   
	     }
	  public void drinkwater(int w){
	         this.water=this.water-w;
	         System.out.println("�ҵı���������"+w+"mlˮ");   
	     }
	  int a=100;
	public void seecup ()
	{  
	if (this.water<this.a)  {
      System.out.println("�ҵı�������û��ˮ����Ҫ��ˮ");
      for (int i=0; i< 10; i++) {
    	     this.water=this.water+10;
    	     System.out.println("�ҵı��������10mlˮ");
    	  }
      
      }
     else
      {
   	   System.out.println("�ҵı�������"+water+"mlˮ");   
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
