package builder;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;

    private Student(StudentBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
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
        private String email;
        private String phone;
        private String address;
        private String city;

        public StudentBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

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
