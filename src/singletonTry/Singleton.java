package singletonTry;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	    private static Singleton instance;

	    private Singleton() {}

	    public static Singleton getInstance() {
	        if (instance == null) {
	            instance = new Singleton();
	        }
	        return instance;
	    }
	}


