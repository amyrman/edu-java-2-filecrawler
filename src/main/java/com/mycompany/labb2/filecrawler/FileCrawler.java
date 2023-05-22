package com.mycompany.labb2.filecrawler;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileCrawler {
  
  // Prompts the user for a search string and searches files in the current directory and its subdirectories.
  public static void main(String[] args) {

    // Create a Scanner object from the Scanner class by calling the constructor that accepts InputStream type to read input from the keyboard
    // Uses the 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter search string:");
    String searchString = scanner.nextLine();
    scanner.close();

    File currentDirectory = new File(".");
    searchFiles(currentDirectory, searchString);
  }

  /**
   * Searches files in a given directory (and its subdirectories) for a given search string.
   * 
   * @param directory The directory to search in.
   * @param searchString The search string to look for.
   */
  public static void searchFiles(File directory, String searchString) {
    File[] files = directory.listFiles();
    if (files == null) {
      System.err.println("Cannot read directory: " + directory.getAbsolutePath());
      return;
    }

    for (File file : files) {
      if (file.isDirectory()) {
        searchFiles(file, searchString);
      } else {
        try {
          if (containsString(file, searchString)) {
            System.out.println(file.getAbsolutePath());
          }
        } catch (IOException e) {
          System.err.println("Cannot read file: " + file.getAbsolutePath());
        }
      }
    }
  }

  /**
   * Determines whether a given file contains a given search string.
   * 
   * @param file The file to check.
   * @param searchString The search string to look for.
   * @return True if the file contains the search string, false otherwise.
   * @throws IOException If an I/O error occurs.
   */
  // a boolean method named containsString and accepts  that returns true if the file contains the search string
  public static boolean containsString(File file, String searchString) throws IOException {
    // try-with-resources statement to automatically close the reader
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        if (line.contains(searchString)) {
          return true;
        }
      }
    }
    return false;
  }

}
