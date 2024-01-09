package builder;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String city;

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }



    private Student(StudentBuilder builder){

        if(builder.age > 50){
            throw new IllegalArgumentException("Age can not be greater than 50");
        }
        if(builder.age < 18){
            throw new IllegalArgumentException("Age can not be less than 18");
        }

        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.city = builder.city;
    }
    @Override
    public String toString(){
        return "Student :" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", email=" + email +
                ", phone=" + phone +
                ", address=" + address +
                ", city=" + city;

    }


    public static class StudentBuilder{
        private String firstName;
        private String lastName;
        private int age;
        private String email;
        private String phone;
        private String address;
        private String city;

        public StudentBuilder(String firstName, String lastName,int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;

        }
//        public StudentBuilder setAge(int age){
//            this.age = age;
//            return this;
//        }

        public StudentBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public StudentBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public StudentBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        public StudentBuilder setCity(String city){
            this.city = city;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

}
//Let’s see how we can implement builder design pattern in java:
//First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class.
// We should follow the naming convention and if the class name is Student then builder class should be named as StudentBuilder.
//Java Builder class should have a public constructor with all the required attributes as parameters.i.e in StudentBuilder class.
//Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
//The final step is to provide a build() method in the builder class that will return the Object needed by client program.
// For this we need to have a private constructor in the Class with Builder class as argument in Student class.


//The builder pattern is a design pattern that allows for the step-by-step creation of complex objects using the correct sequence of actions.
// The construction is controlled by a director object that only needs to know the type of object it is to create.

//Note: Notice that Student class has only getter methods and no public constructor.
// So the only way to get a Student object is through the StudentBuilder class.