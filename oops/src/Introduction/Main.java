package Introduction;

public class Main {
    public static void main(String[] args) {
        // create a datatype which can store 5 names
        String[] names = new String[5];

        // create a datatype which can store 5 roll numbers
        int[] rollNumbers = new int[5];

        // create a datatype to store data of 5 students
        // data  = {rno, name, cgpa}

        Students student = new Students();
    }

    static class Students{
        int rno;
        String name;
        float cgpa;
    }
}
