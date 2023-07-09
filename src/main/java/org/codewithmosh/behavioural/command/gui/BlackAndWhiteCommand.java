package org.codewithmosh.behavioural.command.gui;

import org.codewithmosh.behavioural.command.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white");
    }
}
