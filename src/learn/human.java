package learn;

public class human {
	int high=175;
     cup mycup=new cup();
      
      public void reckonyear(int f){
    	   int c=f % 4;
    	   int d=f % 100;
    	   int g=f % 400;
    	   if (c!=0){
    		   System.out.println(f+"年不是闰年"); 
    	   }
    	   else if (d!=0)
    	   {
    		   System.out.println(f+"年是闰年"); 
    	   }
    	   
    	   else if (g==0)
    	   {
    		   System.out.println(f+"年是闰年"); 
    	   }
    	   else 
    	   {
    		   System.out.println(f+"年不是闰年"); 
    	   }
      }
     
   
     public void seewater () {
    	 System.out.println("我的杯子里有"+mycup.water+"ml的水");
     }
     public void drinkwater (int w){
    	 this.mycup.seecup();
         this.mycup.water=this.mycup.water-w;
         System.out.println("我喝了"+w+"ml的水");
         System.out.println("我的杯子里还有"+mycup.water+"ml的水");
     }
     interface MetricCup extends cup.Cup{
    	 
     }
    
}
