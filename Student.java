package Exam;

public class Student {
    public String EnrollID;
    public String LastName;
    public String FistName;
    public int Age;


    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String enrollID) {
        EnrollID = enrollID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFistName() {
        return FistName;
    }

    public void setFistName(String fistName) {
        FistName = fistName;
    }

    public Student(String EnrollID, String LastName, String fistName, int Age){
        this.EnrollID = EnrollID;
        this.LastName = LastName;
        this.FistName = fistName;
        this.Age = Age;
    }


}
