package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * This class provides methods to interactively search files in a directory (and
 * its
 * subdirectories) for a given search string. It prompts the user for a search
 * string,
 * then searches the current directory and its subdirectories for files that
 * contain the string,
 * and prints the absolute path of any files that contain the string. It also
 * handles errors
 * such as unreadable directories or files.
 */
public class FileCrawler {
  /**
   * The entry point for the FileCrawler program. This method orchestrates the
   * process of
   * prompting the user for a search string, searching the current directory and
   * its subdirectories
   * for files that contain the string, and displaying the results.
   *
   * @param args the command line arguments (not used)
   */
  public static void main(String[] args) {
    String searchString = getUserInput();
    List<Path> foundFiles = runFileCrawler(searchString);
    displayResults(foundFiles);
  }

  /**
   * Prompts the user for a search string. The input is read from the console.
   *
   * @return the search string entered by the user
   */
  private static String getUserInput() {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Please enter text to search for:");
      String searchString = scanner.nextLine();
      while (searchString.trim().isEmpty()) {
        System.out.println("Input cannot be empty. Please input search string or exit with Ctrl+C.");
        searchString = scanner.nextLine();
      }
      return searchString;
    }
  }

  /**
   * Displays the results of the file search to the user. The absolute path of
   * each file
   * that was found during the search is printed to the console.
   *
   * @param foundFiles the files that were found during the search
   */
  private static void displayResults(List<Path> foundFiles) {
    if (foundFiles.isEmpty()) {
      System.out.println("No files were found with the given text string.");
      return;
    }
    for (Path file : foundFiles) {
      System.out.println(file.toAbsolutePath());
    }
  }

  /**
   * Runs the file crawler to search for files that contain the search string. The
   * search
   * is performed in the current directory and its subdirectories.
   *
   * @param searchString the search string to look for
   * @return a list of files that contain the search string
   */
  private static List<Path> runFileCrawler(String searchString) {
    Path currentDirectory = Paths.get(".");
    List<Path> foundFiles = new ArrayList<>();
    try (Stream<Path> paths = Files.walk(currentDirectory)) {
      paths
          .filter(Files::isRegularFile)
          .filter(path -> containsString(path, searchString))
          .forEach(foundFiles::add);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return foundFiles;
  }

  /**
   * Determines whether a given file contains a given search string. The file is
   * read line
   * by line, and each line is checked for the presence of the search string.
   * 
   * @param path         the path of the file to check
   * @param searchString the search string to look for
   * @return true if the file contains the search string, false otherwise
   */
  private static boolean containsString(Path path, String searchString) {
    try {
      return Files.lines(path, StandardCharsets.ISO_8859_1).anyMatch(line -> line.contains(searchString));
    } catch (IOException e) {
      System.err.println("Cannot read file: " + path.toAbsolutePath());
      return false;
    }
  }
}
