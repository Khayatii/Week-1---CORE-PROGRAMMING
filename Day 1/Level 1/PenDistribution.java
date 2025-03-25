public class PenDistribution {
    public static void main(String[] args) {
        // Create variables to store total number of pens and total number of students
        int totalPens = 14, totalStudents = 3;
        // Dividing the totalPens with totalStudents to find the pens per student
        // Creating a variable to store the pens per student
        int pensPerStudent = totalPens / totalStudents;
        // Creating a variable for remaining pens
        int remainingPens = totalPens % totalStudents;
        // Printing the result
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d", pensPerStudent,
                remainingPens);

    }
}
