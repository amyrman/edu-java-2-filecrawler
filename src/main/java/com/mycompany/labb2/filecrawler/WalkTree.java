package com.mycompany.labb2.filecrawler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WalkTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter search string: ");
        String searchString = scanner.nextLine();
        scanner.close();

        String rootDirectory = "./src";
        search(searchString, rootDirectory);
    }

    private static void search(String searchString, String rootDirectory) {
        File root = new File(rootDirectory);
        if (!root.exists() || !root.isDirectory()) {
            System.out.println("Invalid directory: " + rootDirectory);
            return;
        }

        File[] files = root.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                search(searchString, file.getAbsolutePath());
            } else if (file.isFile() && file.canRead()) {
                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.contains(searchString)) {
                            System.out.println("Found in file: " + file.getAbsolutePath());
                            break;
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Error reading file: " + file.getAbsolutePath());
                }
            }
        }
    }
}