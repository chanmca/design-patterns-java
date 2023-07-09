package org.codewithmosh.behavioural.strategy;

public class ImageMain {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("gautam",
                new JPEGCompressor(), new HighContrast());
        imageStorage.store("gautam", new PNGCompressor(),
                new BlackAndWhiteFilter());
    }
}
