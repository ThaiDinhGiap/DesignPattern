# Singleton Pattern Practice

This project demonstrates the use of three my favorite types of Singleton design patterns in a simple **Game Engine**. The aim is to practice implementing and understanding different Singleton patterns for various use cases in a game environment.

## Project Structure

The project consists of three Singleton classes, each designed for a specific purpose within the game engine:

1. **LogManager** - Implements the **Bill Pugh Singleton** pattern.
2. **ConfigurationManager** - Implements the **Lazy Initialized Singleton** pattern.
3. **GameLoop** - Implements the **Double-Checked Locking Singleton** pattern.

Each Singleton is used to handle a specific part of the game engine to demonstrate their unique advantages and appropriate use cases.

## Singleton Implementations

### 1. BillPughSingleton (LogManager)

- The **LogManager** class is responsible for logging events, errors, and status information within the game engine. 
- It utilizes the **Bill Pugh Singleton** pattern, which is known for its high performance and thread-safety without using `synchronized`.

### 2. LazyInitializedSingleton (ConfigurationManager)

- The **ConfigurationManager** class manages game settings, such as resolution, volume, and other configuration options. 
- This Singleton uses **Lazy Initialization**, saves memory by delaying instantiation until it’s actually required. Suitable for single-threaded use cases or when synchronization is not a major concern.


### 3. DoubleCheckLockingSingleton (GameLoop)

- The **GameLoop** class controls the game loop, including updating game state and rendering graphics. 
- This class uses the **Double-Checked Locking Singleton** pattern to ensure thread-safety and efficient lazy initialization, making it ideal for multithreaded applications where multiple threads may attempt to initialize the instance simultaneously.
- Provides thread-safety while reducing the cost of `synchronized` after the instance has been initialized. Suitable for critical resources that must be accessed by multiple threads.




