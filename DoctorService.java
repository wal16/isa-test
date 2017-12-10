import java.util.ArrayList;
import java.util.List;

class DoctorService {
    private final List<Doctor> doctors = new ArrayList<>();

    DoctorService() {
        this.doctors.add(new Doctor("Adam", "Lecz"));
        this.doctors.add(new Doctor("Marcin", "Leczniczny"));
        this.doctors.add(new Doctor("Lech", "Nowak"));
        this.doctors.add(new Doctor("khjgfj", "hjgfjhj"));
    }

    List<Doctor> getAll() {
        return this.doctors;
    }
}
