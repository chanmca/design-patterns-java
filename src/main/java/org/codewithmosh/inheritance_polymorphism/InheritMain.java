package org.codewithmosh.inheritance_polymorphism;

public class InheritMain {

    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.enable();
        var checkBox = new CheckBox();
        checkBox.disable();
        drawUIControl(textBox);
        drawUIControl(checkBox);
    }

    public static void drawUIControl(UIControl uiControl) {
        uiControl.draw();
    }
}
