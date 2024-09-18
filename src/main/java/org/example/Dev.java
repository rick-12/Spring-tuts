package org.example;

public class Dev {

    private Computer computer;

    public void setComputer(Computer computer) {
        System.out.println("Setter Injection");
        this.computer = computer;
    }

    public Dev() {
        System.out.println("Dev constructor");
    }

    public void build() {
        computer.compile();
        System.out.println("Working on awesome project!");
    }
}
