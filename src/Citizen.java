import java.util.ArrayList;
import java.util.Comparator;
// This Class Created To Store The Information About The Citizens
public class Citizen {
    // The Name Of The Citizen
    private String Name;
    // The Citizen Civil ID
    private String CivilId;
    // The Citizen Integer age
    private String Age;
    // His / Her Gender
    private String Gender;
    // The List Which Contain The Doses That The Citizen Have Taken
    private ArrayList<Dose> Doses;
    // Zero Argument Construct
    public Citizen (){
        this.Doses = new ArrayList<Dose>(); // Set A List To Collect The Doses That The Citizen Have Taken
    }
    // 4 Argument Construct
    public Citizen (String Name , String CivilId , String Age , String Gender){
        this.Name = Name; // Set The Name Of The Citizen
        this.CivilId = CivilId; // Set The Civil ID Of The Citizen
        this.Age = Age; // Set The Age Of The Citizen
        this.Gender = Gender; // Set The Gender Of The Citizen
        this.Doses = new ArrayList<Dose>(); // Set A List To Collect The Doses That The Citizen Have Taken
    }
    // 5 Argument Construct
    public Citizen (String Name , String CivilId , String Age , String Gender , ArrayList<Dose> Doses){
        this.Name = Name; // Set The Name Of The Citizen
        this.CivilId = CivilId; // Set The Civil ID Of The Citizen
        this.Age = Age; // Set The Age Of The Citizen
        this.Gender = Gender; // Set The Gender Of The Citizen
        this.Doses = Doses; // Set Doses List To Collect The Doses That The Citizen Have Taken
    }
    // Return The Name Of This Citizen
    public String getName() {
        return Name;
    }
    // Set This Citizen Name To Name
    public void setName(String Name) {
        this.Name = Name;
    }
    // Return The Civil ID Of This Citizen
    public String getCivilId() {
        return CivilId;
    }
    // Set This Citizen Civil ID To CivilId
    public void setCivilId(String CivilId) {
        this.CivilId = CivilId;
    }
    // Return The Age Of This Citizen
    public String getAge() {
        return Age;
    }
    // Set This Citizen Age To Age
    public void setAge(String Age) {
        this.Age = Age;
    }
    // Return The Gender Of This Citizen
    public String getGender() {
        return Gender;
    }
    // Set This Citizen Gender To Gender
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    // Return The Doses That This Citizen Have Taken
    public ArrayList<Dose> getDoses() {
        return Doses;
    }
    // Add A Dose To This Citizen
    public void setDose(Dose dose) {
        this.Doses.add(dose);
    }
    // An Override To The Method toString To Return The Information Of That Citizen
    @Override
    public String toString() {
        return "Citizen: {" +
                "Name: " + Name +
                ", CivilId: " + CivilId +
                ", Age: " + Age +
                ", Gender: " + Gender + "}\n" +
                Doses + "\n";
    }
    // An Override To equals Method To Checks If This Civil ID Already Exists
    @Override
    public boolean equals(Object obj) {
        Citizen citizen = (Citizen)obj;
        if (this.getCivilId()==citizen.getCivilId()){
            return true;
        }
        else
            return false;
    }
    // This Method Compares Between The Citizens In The List By Override Compare method
    public static Comparator<Citizen> CompareByCivilId = new Comparator<Citizen>() {
        // An Override To compare Method To Return The Difference Between The Citizens Civil ID
        @Override
        public int compare(Citizen citizen1, Citizen citizen2) {
            String CitizenCivilId1 = citizen1.getCivilId().toLowerCase();
            String CitizenCivilId2 = citizen2.getCivilId().toLowerCase();
            return CitizenCivilId1.compareToIgnoreCase(CitizenCivilId2);
        }
    };
}