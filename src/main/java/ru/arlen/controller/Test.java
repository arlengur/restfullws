package ru.arlen.controller;

public class Test {
    public static void main(String[] args) {
        A ref = new B();
        ref.f();
    }
}
class A{
    public void f(){System.out.println("A");}
}
class B extends A{
    public void f(){System.out.println("B");}
}