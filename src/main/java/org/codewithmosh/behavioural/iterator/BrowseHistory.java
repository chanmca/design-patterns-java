package org.codewithmosh.behavioural.iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int idx;

    public void push(String url) {
        urls[idx++] = url;
    }

    public String pop() {
        return urls[--idx];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {

        private BrowseHistory browseHistory;
        private int index;

        public ArrayIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return (index < browseHistory.idx);
        }

        @Override
        public String current() {
            return browseHistory.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }

    /*private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {

        private BrowseHistory browseHistory;
        private int index;

        public ListIterator(BrowseHistory browseHistory) {
            this.browseHistory = browseHistory;
        }

        @Override
        public boolean hasNext() {
            return (index < browseHistory.urls.size());
        }

        @Override
        public String current() {
            return browseHistory.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }*/
}
