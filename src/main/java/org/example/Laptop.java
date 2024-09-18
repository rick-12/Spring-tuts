package org.example;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop constructor");
    }
//    public void getLaptop() {
//        System.out.println("Here is your laptop!");
//    }
    public void compile() {
        System.out.println("Compiling in laptop!");
    }
}
