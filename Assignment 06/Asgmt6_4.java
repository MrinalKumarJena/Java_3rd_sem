/*Write a program to implement multiple inheritance using interface.*/
interface a{
   void show();
}
interface b{
   void display();
}
class c implements a,b{
   public void show(){
       System.out.println("This is a menthod of interface a ");
   }
   public void display(){
       System.out.println("This is a menthod of interface b ");
   }
}
class Asgmt6_4{
   public static void main (String []args ){
       c x=new c();
       x.show();
       x.display();
   }
}