package hostel.hostel_project.Model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Wings_Room_Table")
public class WingsRoom {

    @Id
    @Column(name = "ROOM_ID")
    private String Room_Id;

    @Column(name = "WINH_ID")
    private String Wing_Id;

    @Column(name = "ROOM_NUMBER")
    private String Room_Number;

    @Column(name = "CAPACITY")
    private int Capacity;

    @Column(name = "OCCUPIED")
    private int Occupied;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WING_ID", insertable = false, updatable = false)
    @JsonBackReference
    private Wings Wing; // Field name matches the 'mappedBy' in Wings

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Rooms")
    @JsonManagedReference
    private List<Students> StudentList = new ArrayList<>();

    public WingsRoom() {
    }

    public WingsRoom(String room_Id, String wing_Id, String room_Number, int capacity, int occupied, Wings wing) {
        Room_Id = room_Id;
        Wing_Id = wing_Id;
        Room_Number = room_Number;
        Capacity = capacity;
        Occupied = occupied;
        Wing = wing;
    }

    @Override
    public String toString() {
        return "WingsRoom [Room_Id=" + Room_Id + ", Wing_Id=" + Wing_Id + ", Room_Number=" + Room_Number + ", Capacity="
                + Capacity + ", Occupied=" + Occupied + ", Wing=" + Wing + "]";
    }

}
