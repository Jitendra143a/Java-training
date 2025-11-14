package lect8;
// class Employee {
//  void work() {
//  System.out.println("Employee is working");
//  }
// }
// class Manager extends Employee {
//  void attendMeeting() {
//  System.out.println("Manager is attending a meeting");
//  }
// }
// public class singlelevel {
//  public static void main(String[] args) {
//  Manager m = new Manager();
//  m.work();
//  m.attendMeeting();
//  }
// }
//     Child() {
//     System.out.println("child constructor this.x:x="+x);
//     }
// class person{
//     void displayName(){
//         System.out.println("Name: John Doe");
//     }
// }
// class student extends person{
//     void displayClass(){
//         System.out.println("Class: 12th");
//     }
// }
// class monitor extends student{
//     void checkDiscipline (){
//         System.out.println("Discipline is good");
//     }
// }

// public class singlelevel {
//     public static void main(String[] args) {
//         monitor m = new monitor();
//         m.displayName();
//         m.displayClass();
//         m.checkDiscipline();
//     }
// }
class main {
    void add(int a){
        System.out.println(a); 
    }
    void add(int a, int b){
        System.out.println(a+b); 
    }
    void add(int a, int b, int c){
        System.out.println(a+b+c); 
    }
    public static void main(String[] args) {
        main obj = new main();
        obj.add(2);
        obj.add(2,3);
        obj.add(2,3,4);
    }
}



