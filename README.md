# Android Calculator

## Introduction
This project is an Android Calculator App developed as a school assignment using Android Studio. It's designed to perform a wide range of mathematical operations, from basic arithmetic to complex calculations, catering to the needs of various users. This app demonstrates the application of Android development skills in creating practical, user-friendly tools for everyday use.

## Features
List the features of your calculator, such as:
- Basic arithmetic operations (addition, subtraction, multiplication, division)
- Advanced mathematical functions (if any)
- User-friendly interface

## Getting Started

### Prerequisites
List any prerequisites needed to run your project, such as:
- Android Studio
- Java JDK

### Installation
Step-by-step guide on how to set up your project locally. For example:
1. Clone the repository to your local machine:

## Connecting BlueStacks to Android Studio

To test Android applications on a virtual device, BlueStacks can be an alternative to the default emulator in Android Studio. Follow these steps to connect BlueStacks with Android Studio:

1. **Install BlueStacks**: Download and install BlueStacks from the [official website](https://www.bluestacks.com). Follow the setup instructions.

2. **Enable ADB Integration in Android Studio**:
   - Open Android Studio and navigate to `File` > `Settings` (or `Android Studio` > `Preferences` on macOS).
   - In the settings, go to `Tools` > `External Tools`.
   - Click the `+` button to add a new tool. Name it "BlueStacks".
   - Set the `Program` to the path of your ADB executable, usually `<Android SDK location>/platform-tools/adb`.
   - For `Parameters`, enter `connect 127.0.0.1:5555`.
   - Set `Working directory` to `$ProjectFileDir$`.
   - Click `OK` to save.

3. **Connect BlueStacks to Android Studio**:
   - Start BlueStacks.
   - In Android Studio, select `Tools` > `External Tools` and choose "BlueStacks" to connect via ADB.
   - You can also manually connect by opening a terminal/command prompt, navigating to your ADB location, and executing `adb connect 127.0.0.1:5555`.

4. **Deploy and Run Your Application**:
   - With BlueStacks running and connected, run your application from Android Studio.
   - Choose your project, click the run button, and select BlueStacks as the deployment target from the "Select Deployment Target" window.

This setup allows you to use BlueStacks as an alternative to the default Android emulator for application testing directly from Android Studio.
