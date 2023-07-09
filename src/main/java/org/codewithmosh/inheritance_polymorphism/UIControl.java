package org.codewithmosh.inheritance_polymorphism;

public abstract class UIControl {

    public void enable() {
        System.out.println("Enabled");
    }

    public void disable() {
        System.out.println("Disabled");
    }

    public abstract  void draw();
}
