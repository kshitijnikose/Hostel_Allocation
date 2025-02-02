package hostel.hostel_project.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "STUDENT_ID")
    private String Student_Id;

    @Column(name = "NAME")
    private String Name;

    @Column(name = "AGE")
    private int Age;

    @Column(name = "GENDER")
    private String Gender;

    @Column(name = "PHONE_NO")
    private int Phone_No;

    @Column(name = "EMAIL")
    private String Email;

    @Column(name = "ROOM_ID")
    private String Romm_Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Room_Id", insertable = false, updatable = false)
    @JsonBackReference
    private WingsRoom Rooms;

    public Students() {
    }

    public Students(String student_Id, String name, int age, String gender, int phone_No, String email,
            String romm_Id) {
        Student_Id = student_Id;
        Name = name;
        Age = age;
        Gender = gender;
        Phone_No = phone_No;
        Email = email;
        Romm_Id = romm_Id;
    }

    @Override
    public String toString() {
        return "Students [Student_Id=" + Student_Id + ", Name=" + Name + ", Age=" + Age + ", Gender=" + Gender
                + ", Phone_No=" + Phone_No + ", Email=" + Email + ", Romm_Id=" + Romm_Id + "]";
    }

}
