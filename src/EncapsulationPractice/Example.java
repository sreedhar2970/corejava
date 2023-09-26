package EncapsulationPractice;

public class Example {

	public static void main(String[] args) {

     Encapsulate encapsulate = new Encapsulate();
     encapsulate.setAddress("gadwal");
     encapsulate.setAge(21);
     encapsulate.setName("naveen");
     
     System.out.println("the name is:"+encapsulate.getName());
     System.out.println("the address is"+encapsulate.getAddress());
     System.out.println("the age of " + encapsulate.getName() + "is" + encapsulate.getAge());

	}

}
