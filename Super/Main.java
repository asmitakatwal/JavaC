class Animal{
String name;
public void Sound(){
System.out.println("This Animal makes Sound");
}

}

class Dog extends Animal{
public void Sound(){
super.Sound();
System.out.println("Dog barks");
}

}

class Main{
public static void main(String[] args){
Dog dog=new Dog();
dog.Sound();
}

}
