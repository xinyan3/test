package learn;

public class test {


	public static void main(String[] args){
	    System.out.println(cc.q);
	    Thread mythread=new Thread();
	    System.out.println(mythread.getId()+mythread.getName()+mythread.getContextClassLoader());
	    mythread.run();

	
	    System.out.println(cc.b);
}
}