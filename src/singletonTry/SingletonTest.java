package singletonTry;

public class SingletonTest {
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub

	}


	    public static void main(String[] args) {
	        Singleton singleton1 = Singleton.getInstance();
	        Singleton singleton2 = Singleton.getInstance();

	        System.out.println(singleton1 == singleton2); // It should print "true"
	    }
	}


