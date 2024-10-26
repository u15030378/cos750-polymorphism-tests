# Welcome to the polymorphism homework assignment

## Getting started
> **Requirements:**<br/>
> - Java v11 - see the troubleshooting section on how to use a different java version<br/>
> - Maven v3 or later

The project can be built using maven.
```bash
mvn clean package
```

The above command will create an executable `.jar` file that can be run from the command line:
```bash
java -jar target/polymorphism-0.0.1-SNAPSHOT.jar 
```

Running the application from the IDE or command line **should** result in the same output:

<img src="assets/images/Spring-boot-output.png" alt="Spring boot output" width="1000"/>

>If you see the above output, YOU'RE GOOD TO GO! 

## Project structure

---
- src
  - main
    - java
      - polymorphism <span style="font-size:11px">*- This package contains classes that demonstrate polymorphism.*</span>
        - [Vehicle](src/main/java/polymorphism/Vehicle.java) <span style="font-size:11px">*- The base class for all vehicles with an abstract drive() method.*</span>
        - [Truck](src/main/java/polymorphism/Truck.java) <span style="font-size:11px">*- An example class that extends the Vehicle class and implements the drive() method.*</span>
      - 
  - test <span style="font-size:11px">*- Test class.*</span>
    - java
      - polymorphism
        - [PolyMorphicVehicleClassTest](src/test/java/polymorphism/PolyMorphicVehicleClassTest.java) <span style="font-size:11px">*- A test class for the Vehicle sub-classes.*</span>
---

## Instructions
1. Create a new class called `Car` that extends the `Vehicle` class and implements the `drive()` method in the vehicles directory.
2. Look at the `Truck` class for guidance on how to implement the `drive()` method.
3. In /src/test/java/polymorphism, take a look at the expected output for the `Car` class in the corresponding unit test and make your car class return the same.
4. Uncomment the test method for the `Car` class in the `PolyMorphicVehicleClassTest` class.
5. Run the test class to verify that your `Car` class is working as expected. To compile your newly added `Car` class and run the test, use the following command:
```mvn clean package```
6. Do the same for the rest of the test cases that are commented out.

## Submission


## Troubleshooting
When compiling or running the application on a java version other than v11, you will receive the following error: 
```bash
java: invalid target release: 11
```

Resolve this by updating the `java.version` property in your [pom.xml](pom.xml) to correspond to your local java version and then run
```bash
mvn clean package
```
