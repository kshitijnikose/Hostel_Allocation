package hostel.hostel_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hostel.hostel_project.Model.Wings;
import hostel.hostel_project.Repository.WingsRepo;

@Service
public class WingsService {

    @Autowired
    private WingsRepo wingsRepo;

    public List<Wings> getWings() {

        return wingsRepo.findAll();
    }

    public String insertWing(Wings wing) {

        return "Inserted : " + wingsRepo.save(wing);

    }

    public String update(Wings w) {

        return "Updated Wings: " + wingsRepo.save(w);
    }

    public String delete(String id) {

        wingsRepo.deleteById(id);
        return "Deleted Wing ";
    }

}
