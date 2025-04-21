package com.xworkz.interfaces.in;

public class StudentMarks {
        int[] marks;
        public StudentMarks(int[] inputMarks) {
            marks = inputMarks;
        }
        public void displayMarks() {
            System.out.println("Student Marks:");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
        }
        public static void main(String[] args) {
            int[] myMarks = {60, 75, 88, 92, 100};
            StudentMarks student = new StudentMarks(myMarks);
            student.displayMarks();
        }
    }

