package day3;

class Animal{  
void eat(){System.out.println("Moring...");}  
}  
class Dog extends Animal{  
void bark(){System.out.println("Afternoon...");}  
}  
class Cat extends Animal{  
void meow(){System.out.println("Night...");}

public void bark() {
	// TODO Auto-generated method stub
	
}  
}  
class TestInheritance1 {  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
c.bark();
}}  