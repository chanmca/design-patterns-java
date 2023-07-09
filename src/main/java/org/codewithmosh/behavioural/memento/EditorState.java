package org.codewithmosh.behavioural.memento;

public class EditorState {
    private final String content;
    private final String title;
    public EditorState(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }
}
