package hostel.hostel_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hostel.hostel_project.Model.WingsRoom;

public interface WingRoomRepo extends JpaRepository<WingsRoom, String> {

}
