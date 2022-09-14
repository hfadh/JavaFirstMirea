package ru.mirea.task2;

public class Dog {
   private int age;
   private String name;
   public Dog(int a, String n){
       age = a;
       name = n;
   }
   public int getAge(){
       return age;
   }
   public String getName(){
       return name;
   }
   public void setAge(int a){
       age = a;
   }
   public void setName(String n){
       name = n;
   }
   public void Convert_Age(){
       age *=7;
   }

}
