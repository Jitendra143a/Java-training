package lect7;
//class car{
// public car(){
// System.out.println("car constructor");
// }
// public car(int i){
// System.out.println(i);
// }
// public car(int i,int j){
// System.out.println(i);
// System.out.println(j);
// }
//}
//public class Java7 {
// public static void main(String[] args) {
// car c1 = new car();
// car c2 = new car(45);
// car c3 = new car(23,34);
// }
//}
// class Animal {
//  void eat(){
//  System.out.println("pizza");
//  }
// }
// class Dog extends Animal {
//  void eat(){
//  System.out.println("hehe");
//  }
// }
// class Cat extends Animal {
//  void eat(){
//  System.out.println("cat");
//  }
// }
// class puppy extends Dog {
//  void eat(){
//  System.out.println("puppy");
//  }
// }
// class AnimalMain {
//  public static void main(String[] args) {
//   Animal a1=new Animal();
//   a1.eat();
//   Dog d1=new Dog();
//   d1.eat();
//   Cat c1=new Cat();
//   c1.eat();
//   puppy p1=new puppy();
//   p1.eat();
//  }
// }
class Parent {
    int x=10;
 Parent() {
  System.out.println("parent constructor this.x:x="+x);
 }
}
class Child extends Parent {
    int x=20;
 Child() {
  System.out.println("child constructor:x="+this.x);
 }

void show(){
    int x=30;
    System.out.println("show method:x="+x);
    System.out.println("this.x=+x this.x"+this.x);
    System.out.println("super.x=+x super.x"+super.x);
}
public class animal {
 public static void main(String[] args) {
  Child c=new Child();
  c.show();
 }
}
}