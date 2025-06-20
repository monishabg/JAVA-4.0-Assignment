package com.mvc.example;

public class MVCPatternTest {
	public static void main(String[] args) {
        
        Student student = new Student("Alice", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("\nUpdating student grade to B...");

        controller.setStudentGrade("B");
        controller.updateView();
    }

}
