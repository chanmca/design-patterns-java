package org.codewithmosh.behavioural.memento;

public class MementoMain {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new StateHistory();

        editor.setContent("Chandar");
        editor.setTitle("Computer Science");
        history.push(editor.createState());

        editor.setContent("Gautam");
        editor.setTitle("Google Maps");
        history.push(editor.createState());

        editor.setContent("Shylu");
        editor.setTitle("Photography");
        System.out.println(editor);
        editor.restore(history.pop());
        System.out.println(editor);
        editor.restore(history.pop());
        System.out.println(editor);


        var document = new Document();
        var docHistory = new DocumentHistory();

        document.setContent("Chandar");
        document.setFontName("Calibri");
        document.setFontName("12");
        docHistory.push(document.createState());

        document.setContent("Gautam");
        document.setFontName("Ubuntu");
        document.setFontName("14");
        docHistory.push(document.createState());

        document.setContent("Shylu");
        document.setFontName("SF PRO Display");
        document.setFontName("16");

        System.out.println(document);
        document.restore(docHistory.pop());
        System.out.println(document);
        document.restore(docHistory.pop());
        System.out.println(document);
    }
}
