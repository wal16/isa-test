import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {




        this.patients.add(new Patient("Marek", "Inglot", 13));
        this.patients.add(new Patient("Lech", "Gacg", 13));
        this.patients.add(new Patient("Ziemowit", "Podolski", 13));
        this.patients.add(new Patient("Zbigniw", "Koalski", 13));
        this.patients.add(new Patient("emilia", "Oz", 13));
        this.patients.add(new Patient("Lena", "Labuda", 13));
        this.patients.add(new Patient("Roger", "Mała", 13));
        this.patients.add(new Patient("Sebastian", "Jungingen", 13));
        this.patients.add(new Patient("Roman", "Jung", 13));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
