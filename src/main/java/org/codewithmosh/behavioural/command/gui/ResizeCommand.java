package org.codewithmosh.behavioural.command.gui;

import org.codewithmosh.behavioural.command.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resized");
    }
}
