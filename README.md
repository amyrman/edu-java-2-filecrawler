# Java filecrawler

A Java assignment to create a file crawler utilizing:
- [Java Stream API](https://www.baeldung.com/java-8-streams)
- [Error Handling](https://www.baeldung.com/java-exceptions)
- [Collections](https://www.baeldung.com/java-collections)
- [Try-with-resources](https://www.baeldung.com/java-try-with-resources)
- [JavaDocs](https://www.baeldung.com/javadoc)

The [`FileCrawler`](./src/main/java/com/example/FileCrawler.java) class uses the following Java classes:

- [`ArrayList`](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
- [`List`](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)
- [`Scanner`](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
- [`Files`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html)
- [`Path`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html)
- [`Paths`](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Paths.html)
- [`Stream`](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)
- [`StandardCharsets`](https://docs.oracle.com/javase/8/docs/api/java/nio/charset/StandardCharsets.html)
- [`IOException`](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)

## Getting Started

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
