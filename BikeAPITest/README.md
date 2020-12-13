

* BikeAPITest

## Table of contents
* [Technologies](#technologies)
* [Setup](#setup)
* [RunTestsFromTerminal](#RunTestsFromTerminal)
* [RunTestsFromIntellij](#RunTestsFromIntellij)



## Technologies
Project is created with:

* Java
* Maven
* Cucumber
* Jackson Databind

## Setup

Open Individual Module in Intellij and wait until all dependencies are installed.

### RunTestsFromTerminal


Run using Maven
Commands to run BikeApiTest
```
$ mvn clean install
```
```
$ mvn -Dtest=ApiTestRunner test
```
### RunTestsFromIntellij

> ###Open BikeApiTest Project

>Wait until dependencies are installed.

>Find ApiTestRunner.java file under src>test>java>testRunner

>Right click on it.

>Select Run 'ApiTestRunner' to execute the test.

