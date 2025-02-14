package com.convertimagetobyte;

import java.io.*;
import java.nio.file.Files;

public class ConvertImageToByte {

    // Method to convert image to byte array
    public static byte[] imageToByteArray(File imageFile) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (FileInputStream fis = new FileInputStream(imageFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
        }
        return baos.toByteArray();
    }

    // Method to convert byte array back to image file
    public static void byteArrayToImage(byte[] byteArray, File outputImageFile) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
             FileOutputStream fos = new FileOutputStream(outputImageFile)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
    // Main method
    public static void main(String[] args) {
        File originalImageFile = new File("C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\convertimagetobyte\\th.jpg");
        File outputImageFile = new File("C:\\Users\\praja\\OneDrive\\Desktop\\Week04\\Day03\\src\\main\\java\\com\\convertimagetobyte\\output.jpg");

        try {
            // Convert image to byte array
            byte[] byteArray = imageToByteArray(originalImageFile);

            // Convert byte array back to image file
            byteArrayToImage(byteArray, outputImageFile);

            // Verify if the new file is identical to the original image
            byte[] originalBytes = Files.readAllBytes(originalImageFile.toPath());
            byte[] outputBytes = Files.readAllBytes(outputImageFile.toPath());

            if (java.util.Arrays.equals(originalBytes, outputBytes)) {
                System.out.println("The new image file is identical to the original image file.");
            } else {
                System.out.println("The new image file is NOT identical to the original image file.");
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
