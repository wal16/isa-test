import java.util.ArrayList;
import java.util.List;

class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    PatientService() {


        this.patients.add(new Patient("Maria", "Nowakowska", 13));
        this.patients.add(new Patient("Tomek", "Nowak", 13));
        this.patients.add(new Patient("Daria", "Kowska", 13));
        this.patients.add(new Patient("Mateusz", "NLis", 13));
        this.patients.add(new Patient("Marek", "Inglot", 13));
        this.patients.add(new Patient("Lech", "Gacg", 13));
        this.patients.add(new Patient("Ziemowit", "Podolski", 13));
        this.patients.add(new Patient("Zbigniw", "Koalski", 13));
        this.patients.add(new Patient("Igor", "Ul", 13));
    }

    List<Patient> getAll() {
        return this.patients;
    }
}
