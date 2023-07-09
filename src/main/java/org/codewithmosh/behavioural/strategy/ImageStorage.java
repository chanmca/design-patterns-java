package org.codewithmosh.behavioural.strategy;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        filter.apply(fileName);
        compressor.compress(fileName);
    }
}
