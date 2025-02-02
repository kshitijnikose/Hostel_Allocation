package hostel.hostel_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hostel.hostel_project.Model.WingsRoom;
import hostel.hostel_project.Repository.WingRoomRepo;

@Service
public class WingRoomService {

    @Autowired
    private WingRoomRepo wingRoomRepo;

    public List<WingsRoom> getAllWings() {

        return wingRoomRepo.findAll();

    }

    public WingsRoom insertRoom(WingsRoom room) {

        return wingRoomRepo.save(room);

    }

    public void getByID(String id) {

        wingRoomRepo.findById(id);

    }

    public WingsRoom update(WingsRoom room) {

        return wingRoomRepo.save(room);

    }

    public void delete(String id) {

        wingRoomRepo.deleteById(id);

    }

}
