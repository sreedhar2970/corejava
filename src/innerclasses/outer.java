package innerclasses;

public class outer {

     class inner{
    	 public void methodone() {
    		 System.out.println("it is the inner method");
    	 }
     }
     public void outermethod() {
    	 inner i = new inner();
    	 i.methodone();
     } 
     public static void main(String[] args) {
     outer g = new outer();
     g.outermethod();
     }
}
