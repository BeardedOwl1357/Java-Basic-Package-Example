- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Executing the code](#executing-the-code)
- [Resources](#resources)

# Prerequisites

- Check whether you have `java` and `javac` installed
  - Open terminal (windows powershell, windows command prompt, linux terminal etc.)
  - Execute the commands below separately

```
java --version
javac --version
```

- If the commands are executed correctly (showing their version numbers), then everything is alright
- Otherwise, you need to install Java tools: [How to Install & Run Java in Visual Studio Code (Under 5 minutes) {2022}](https://youtu.be/fbyobdxDQno)

# Project Structure

- `bin/` folder stores packages containing compiled java classes
- `src/` folder stores .java files (the source code)

# Executing the code

- In this specific project, we use the terminal commands to execute
- To compile the java code in src/geometery, use the following command

```
javac -d bin/ src/geometery/*.java
```

- `javac` stands for "Java compiler"
- The `-d` flag stands for "The directory where we need to place generated class files"

  - In our case, when we compile the source code inside `src/geometery/` package, we need to place the compiled files to `bin/` folder

- After compilation, to execute the java code, use the following commands

```
java -cp bin/ src/App.java
```

- The `-cp` flag stands for "class search path of directories and zip/jar files"
  - Basically, it tells the compiler where it should look for packages and compiled class files
  - In our case, the `geometery` package contains the compiled classes
  - The geometery packages exists inside the `bin/` folder

# Resources

- [Oracle Documentation : Packages](https://docs.oracle.com/javase/tutorial/java/package/index.html)
- [Packages in Java](https://youtu.be/k7TwStbkK70)
- [Java Tutorial: Creating Packages in Java](https://youtu.be/av816KIz8nM)
