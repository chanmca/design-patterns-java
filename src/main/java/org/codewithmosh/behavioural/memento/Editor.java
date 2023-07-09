package org.codewithmosh.behavioural.memento;

public class Editor {
    private String content;
    private String title;

    public EditorState createState() {
        return new EditorState(content, title);
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
        this.title = state.getTitle();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
