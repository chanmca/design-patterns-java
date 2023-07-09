package org.codewithmosh.behavioural.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
