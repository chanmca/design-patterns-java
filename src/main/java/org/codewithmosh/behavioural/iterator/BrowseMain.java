package org.codewithmosh.behavioural.iterator;

public class BrowseMain {
    public static void main(String[] args) {
        var browseHistory = new BrowseHistory();
        browseHistory.push("google.com");
        browseHistory.push("amazon.com");
        browseHistory.push("redhat.com");

        Iterator iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
