# Student-Record-Management-System-Using-TreeMap

Overview:
You will create a Java application that manages student records. Each record will contain a student's ID, name, and GPA. The student ID will serve as the unique key. The application should allow adding new student records, deleting records, updating records, and displaying all records sorted by student ID.

Objectives:
Understand the implementation and functionalities of TreeMap.
Practice adding, removing, updating, and retrieving elements from a TreeMap.
Learn to sort data using natural ordering of keys.
Requirements:
Add a Student Record:

Implement a method to add a new student record to the TreeMap. The method should take student ID, name, and GPA as parameters.
Ensure that the student ID is unique before adding the record.
Delete a Student Record:

Implement a method to remove a student record from the TreeMap using the student ID.
Update a Student Record:

Implement a method to update the GPA of a student given their ID.
Display All Records:

Implement a method to display all student records sorted by student ID.
Find Students with GPA Higher Than a Specified Value:

Implement a method to display all students whose GPA is above a specified value.
Instructions:
Setup:

Create a Java project and add a new class named StudentRecordManager.
Define a TreeMap<Integer, Student> to store student records. The key will be the student ID.
Implementing Methods:

Implement methods for adding, deleting, updating, and displaying records as described in the requirements.
Use appropriate TreeMap operations like put(), get(), remove(), and looping through entries to implement these functionalities.
Testing:

Create a main method to test all functionalities.
Add at least 5 student records.
Display all records to ensure they are sorted.
Update the GPA of a student and show the updated list.
Delete a student record and display the remaining records.
Show all students with a GPA higher than 3.0.

To use test this. Open Intellij and run the main and test.