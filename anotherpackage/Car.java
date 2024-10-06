package anotherpackage;

public class Car
{
String model;
String color;
int year;

public Car(String model,String color,int year)
{
this.model=model;
this.color=color;
this.year=year;
}

public void displayDetails()
{
System.out.println("Model:"+model);
System.out.println("Color:"+color);
System.out.println("year:"+year);

}
}
