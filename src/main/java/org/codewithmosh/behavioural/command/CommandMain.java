package org.codewithmosh.behavioural.command;

import org.codewithmosh.behavioural.command.editor.BoldCommand;
import org.codewithmosh.behavioural.command.editor.HTMLDocument;
import org.codewithmosh.behavioural.command.editor.History;
import org.codewithmosh.behavioural.command.editor.UndoCommand;
import org.codewithmosh.behavioural.command.framework.Button;
import org.codewithmosh.behavioural.command.gui.AddCustomerCommand;
import org.codewithmosh.behavioural.command.gui.BlackAndWhiteCommand;
import org.codewithmosh.behavioural.command.gui.CompositeCommand;
import org.codewithmosh.behavioural.command.gui.CustomerService;
import org.codewithmosh.behavioural.command.gui.ResizeCommand;

public class CommandMain {
    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        var composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteCommand());

        composite.execute();
        composite.execute();

        var history = new History();
        var document = new HTMLDocument();
        document.setContent("Hello Laddu Kutty");
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());

    }
}
