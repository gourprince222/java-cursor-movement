
# Java Keep Awake

A lightweight Java desktop utility that automatically moves the mouse cursor at configurable intervals to help prevent display inactivity.

## Features

- Automatic mouse cursor movement.
- Configurable movement interval.
- Timestamp logging using Java Logger.
- Lightweight implementation using Java AWT Robot.
- No external dependencies.

## Technologies

- Java 8+
- AWT Robot
- Java Util Logging

## Prerequisites

- JDK 8 or higher.
- Desktop environment with mouse access.

## Getting Started

### Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/java-cursor-movement.git
```

### Run the application

Open the project in IntelliJ IDEA and run:

`CursorMovement.java`

Alternatively, compile and run:

```bash
javac -d out src/com/prince/cursormovement/CursorMovement.java
java -cp out com.prince.cursormovement.CursorMovement
```

## Configuration

The cursor movement interval and movement distance can be customized in the source code.

## Disclaimer

This utility is intended for legitimate personal desktop use.
It does not override operating system or organizational security policies.

## License

Distributed under the MIT License.
See the LICENSE file for details.
