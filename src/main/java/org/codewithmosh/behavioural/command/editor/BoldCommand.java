package org.codewithmosh.behavioural.command.editor;

public class BoldCommand implements UndoableCommand {
    private String previousContent;
    private final HTMLDocument htmlDocument;
    private final History history;

    public BoldCommand(HTMLDocument htmlDocument, History history) {
        this.htmlDocument = htmlDocument;
        this.history = history;
    }

    @Override
    public void execute() {
        previousContent = htmlDocument.getContent();
        htmlDocument.makeBold();
        history.push(this);
    }

    @Override
    public void unexecute() {
        htmlDocument.setContent(previousContent);
    }
}
