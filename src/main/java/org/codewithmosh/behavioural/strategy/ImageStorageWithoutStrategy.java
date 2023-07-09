package org.codewithmosh.behavioural.strategy;

public class ImageStorageWithoutStrategy {
    public ImageStorageWithoutStrategy(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    private String compressor;
    private String filter;

    public void store(String fileName) {
        if (compressor.equals("jpeg"))
            System.out.println("Compressing using JPEG");
        else if (compressor.equals("png"))
            System.out.println("Compressing using PNG");

        if (filter.equals("b&w"))
            System.out.println("Applying black & white filter");
        else if (filter.equals("high-contrast"))
            System.out.println("Applying high contrast filter");
    }

}
