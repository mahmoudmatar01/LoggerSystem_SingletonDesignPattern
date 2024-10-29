# LoggerSystem_SingletonDesignPattern

This project demonstrates the **Singleton Design Pattern** through a logger system. The logger ensures that only one instance of the logger exists, providing a centralized logging mechanism with various log levels.

## Project Structure

This project includes a `Logger` class that implements the Singleton pattern and an enumeration for log levels. The `Main` class demonstrates how to use the logger to output messages at different log levels.

### 1. `Logger`
   - The `Logger` class handles all logging tasks and restricts instantiation to a single instance.
   - It uses a private static variable, `instance`, to hold the single instance of the `Logger` class.
   - The constructor is private to prevent external instantiation.
   - Contains methods for logging messages at different levels:
     - `logError(String message)`
     - `logDebug(String message)`
     - `logWarn(String message)`
     - `logInfo(String message)`
   - The logging methods check the current `LogLevel` and output messages accordingly.
   - Uses **double-checked locking** in the `getInstance()` method to ensure thread safety while keeping the instantiation overhead low.

### 2. `LogLevel` (Enum)
   - This enumeration defines the various logging levels: `INFO`, `WARNING`, `ERROR`, and `DEBUG`.
   - The `Logger` class uses this enum to control which messages are output based on the set level.

### 3. `Main`
   - This class includes the `main` method, which demonstrates the Singleton Logger.
   - Calls different log methods (`logError`, `logDebug`, `logWarn`, `logInfo`) to log messages at various levels.

## How It Works

1. **Singleton Pattern**:
   - The Singleton pattern ensures that only one instance of `Logger` is created.
   - The `getInstance()` method provides access to this single instance.
   - Double-checked locking in `getInstance()` ensures that only one thread can create the instance, making it thread-safe.

2. **Logging Levels**:
   - Each log method sets the `LogLevel` and checks if the current log level is equal to or less than the method's level. 
   - This way, messages of the appropriate level and higher severity are printed.

## Sample Output

Running the `Main` class produces an output like:

```plaintext
ERROR: Error message with type ERROR
Debug: Debug message with type DEBUG
Info: Info message with type INFO
Warn: Warn message with type WARNING
```

## Key Takeaways
- The Singleton Design Pattern ensures that a class has only one instance and provides a global access point to that instance.
- The logger is implemented with thread-safe lazy instantiation, which ensures that the instance is only created when needed.
- Using an enum for `LogLevel` makes the code cleaner and ensures only predefined log levels are used.

## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see the Singleton Logger.
