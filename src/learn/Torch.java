package learn;

public class Torch {
         public void Switch()
         {
    	boolean sys = true;
    	System.out.println("�ֵ�Ͳ�Ŀ��ع���");
    	if (this.power==0)
    			{
        	System.out.println("�ֵ�Ͳû����");

    	}
    	else{
        	System.out.println("�ֵ�Ͳ����"+this.power+"���");

    	}
         }
    	public void getpower(int p)
    	{
    		this.power=this.power+p;
    		System.out.println("�ֵ�Ͳ����"+this.power+"���");
    	}
    	
    
	private int power = 0;
	
}
