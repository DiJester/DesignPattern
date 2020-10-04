package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i =0;i<100;i++)
        {
        	new Thread(()->{
        		System.out.println(LazySingleton.getInstance().hashCode());
        	}
        	).start();
        }
	}

}
