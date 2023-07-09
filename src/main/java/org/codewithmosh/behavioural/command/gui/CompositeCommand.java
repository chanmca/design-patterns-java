package org.codewithmosh.behavioural.command.gui;

import org.codewithmosh.behavioural.command.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (var command : commands)
            command.execute();
    }
}
