package learn;

public class human {
	int high=175;
     cup mycup=new cup();
      
      public void reckonyear(int f){
    	   int c=f % 4;
    	   int d=f % 100;
    	   int g=f % 400;
    	   if (c!=0){
    		   System.out.println(f+"�겻������"); 
    	   }
    	   else if (d!=0)
    	   {
    		   System.out.println(f+"��������"); 
    	   }
    	   
    	   else if (g==0)
    	   {
    		   System.out.println(f+"��������"); 
    	   }
    	   else 
    	   {
    		   System.out.println(f+"�겻������"); 
    	   }
      }
     
   
     public void seewater () {
    	 System.out.println("�ҵı�������"+mycup.water+"ml��ˮ");
     }
     public void drinkwater (int w){
    	 this.mycup.seecup();
         this.mycup.water=this.mycup.water-w;
         System.out.println("�Һ���"+w+"ml��ˮ");
         System.out.println("�ҵı����ﻹ��"+mycup.water+"ml��ˮ");
     }
     interface MetricCup extends cup.Cup{
    	 
     }
    
}
