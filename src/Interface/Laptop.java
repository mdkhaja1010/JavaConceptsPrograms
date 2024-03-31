package Interface;

public interface Laptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keyboard();
	
    default void security() {//static key word also we can use instead of default
    	commoncode();
	   System.out.println("lapton security code");
	   
   }
     static void audio() {
    	 commoncode();
    	 System.out.println("audio code impleted");
     }
     private static void commoncode() {
    	 System.out.println("commoncode");
     }
	

}
