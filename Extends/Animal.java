public class Animal
{
String name;

public void Sound(){
System.out.println("This animal makes sound.");
}

}

class Dog extends Animal{
public void bark(){
System.out.println("Dog barks.");
}
}

class  Main{

public static void main(String[] args){
Dog dog=new Dog();
dog.name="buddy";
System.out.println(dog.name);
dog.Sound();
dog.bark();


}
}









