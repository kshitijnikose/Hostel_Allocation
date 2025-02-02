package hostel.hostel_project.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Wings")
public class Wings {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "WING_ID")
    private String Wing_Id;

    @Column(name = "WING_NAME")
    private String Wing_Name;

    @Column(name = "GENDER_ALLOWED")
    private String Gender_Allowed;

    @Column(name = "CAPACITY")
    private int Capacity;

    @Column(name = "OCCUPIED")
    private int Occupied;

    @Column(name = "ROOM_ID")
    private String Room_Id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Wing") // Corrected to match 'Wing' in WingsRoom
    @JsonManagedReference
    private List<WingsRoom> roomsList;

    public Wings() {
    }

    public Wings(String wing_Id, String wing_Name, String gender_Allowed, int capacity, int occupied, String room_Id) {
        // Wing_Id = wing_Id;
        Wing_Name = wing_Name;
        Gender_Allowed = gender_Allowed;
        Capacity = capacity;
        Occupied = occupied;
        Room_Id = room_Id;
    }

    @Override
    public String toString() {
        return "Wings [Wing_Id=" + Wing_Id + ", Wing_Name=" + Wing_Name + ", Gender_Allowed=" + Gender_Allowed
                + ", Capacity=" + Capacity + ", Occupied=" + Occupied + ", Room_Id=" + Room_Id + "]";
    }

}
