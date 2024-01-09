package builder;

public class Client {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Rayee", "Nirosha")
                .setEmail("nirosha@gmail.com")
                .setCity("Bangalore")
                .build();
        System.out.println(student);
    }
}
