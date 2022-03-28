# Testing Framework for Monefy Android application

Tesing framework is build using Kotlin, JUnit and Appium. 
This stack helps to build automation test cases for both Android and iOS apps, allows to implement PageObject pattern and can work with emulators. 

## Installation
Kotlin, Gradle and JUnit are required. 

I don't have any android device, so I've installed **Adnroid SDK Tools** to use emulator. 
**Appium Server GUI** was used to start appium server on localhost
**Appium inspector** was used to locate element's ids.

## Execution
To run tests start emulator or connect android device
Run **adb devices** in terminal to get list of attached devices. 
Get udid of attached device and put it in BaseTest class

To start testing simply run **./gradlew test**

## PS
This framework could be easily expanded to test iOS app.
