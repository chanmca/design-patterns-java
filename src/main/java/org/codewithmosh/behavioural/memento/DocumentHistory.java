package org.codewithmosh.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {

    private List<DocumentState> states = new ArrayList<>();

    public void push(DocumentState documentState) {
        states.add(documentState);
    }

    public DocumentState pop() {
        var lastIdx = states.size() - 1;
        var lastState = states.get(lastIdx);
        states.remove(lastState);
        return lastState;
    }
}
