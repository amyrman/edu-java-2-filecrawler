# Java filecrawler

A Java assignment to create a file crawler utilizing:
- <a href="https://www.baeldung.com/java-8-streams" target="_blank">Java Stream API</a>
- <a href="https://www.baeldung.com/java-exceptions" target="_blank">Error Handling</a>
- <a href="https://www.baeldung.com/java-collections" target="_blank">Collections</a>
- <a href="https://www.baeldung.com/java-try-with-resources" target="_blank">Try-with-resources</a>
- <a href="https://www.baeldung.com/javadoc" target="_blank">JavaDocs</a>

The <a href="./src/main/java/com/example/FileCrawler.java" target="_blank">`FileCrawler`</a> class uses the following Java classes:

- <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html" target="_blank">`ArrayList`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html" target="_blank">`List`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html" target="_blank">`Scanner`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html" target="_blank">`Files`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html" target="_blank">`Path`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/nio/file/Paths.html" target="_blank">`Paths`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html" target="_blank">`Stream`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/nio/charset/StandardCharsets.html" target="_blank">`StandardCharsets`</a>
- <a href="https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html" target="_blank">`IOException`</a>

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

You need to have [Maven](https://maven.apache.org/download.cgi) installed on your machine.

### Installation

1. Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2. Navigate to the project root directory:
    ```bash
    cd <project-directory>
    ```
3. Install the project:
    ```bash
    mvn clean install
    ```

## Viewing JavaDocs

After installation, you can view the JavaDocs by opening the `index.html` file in the `./target/apidocs` directory.

On Windows, you can do this with the `start` command:
```bash
start ./target/apidocs/index.html
```

On Unix-based systems, you can use the `open` command:
```bash
open ./target/apidocs/index.html
```

## Running the Program

You can run the program with the following command:
    ```bash
    mvn -q exec:java
    ```

This will run the program in quiet mode, where it only outputs errors and warnings.

## Changelog

See the [CHANGELOG.md](CHANGELOG.md) file for details.

## License

This project is licensed under the GNU General Public License v3.0 - see the [COPYING.txt](COPYING.txt) file for details
