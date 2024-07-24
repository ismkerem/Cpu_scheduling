# Scheduling Algorithms GUI

## Introduction
This Java application implements three CPU scheduling algorithms: First-Come, First-Served (FCFS), Shortest Job First (SJF), and Priority Scheduling. The application features a simple graphical user interface (GUI) to input process details and visualize the scheduling results.

## Features
- Implements FCFS, SJF, and Priority scheduling algorithms.
- Simple and user-friendly GUI for input and display.
- Visual representation of scheduling results including Gantt charts.

## Installation
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/SchedulingAlgorithmsGUI.git
    ```
2. Navigate to the project directory:
    ```bash
    cd SchedulingAlgorithmsGUI
    ```
3. Compile the Java files:
    ```bash
    javac -d out src/*.java
    ```

## Usage
1. Run the application:
    ```bash
    java -cp out Main
    ```
2. Use the GUI to:
    - Input process details (Process ID, Arrival Time, Burst Time, and Priority).
    - Select the scheduling algorithm (FCFS, SJF, or Priority).


## Example
1. Input process details:
    - Process ID: P1, Arrival Time: 0, Burst Time: 4, Priority: 2
    - Process ID: P2, Arrival Time: 1, Burst Time: 3, Priority: 1
    - Process ID: P3, Arrival Time: 2, Burst Time: 2, Priority: 3

2. Select "SJF" scheduling.

3. Click "Schedule" to see the Gantt chart and the scheduling details.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.


