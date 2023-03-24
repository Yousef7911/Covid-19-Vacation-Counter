import java.util.Date;
// This Class Created To Store The Information About The Doses
public class Dose {
    // The Manufacturer Name Of The Dose
    private String Manufacturer;
    // When The Dose Have Been Taken
    private Date DateCreated;
    // Where The Dose Have Been Taken
    private String Place;
    // The Health Professional Who Give The Dose
    private HealthProfessional HealthProfessional;
    // Zero Argument Construct
    public Dose (){
        DateCreated = new java.util.Date(); // Create A Date And Add It To The Dose
    }
    // 3 Argument Construct
    public Dose (String Manufacturer , String Place , HealthProfessional HealthProfessional){
        DateCreated = new Date(); // Create A Date And Add It To The Dose
        this.Manufacturer = Manufacturer; // Set The Manufacturer Of The Dose
        this.Place = Place; // Set The Place That The Dose Have Been Taken In
        this.HealthProfessional = HealthProfessional; // Set The Health Professional Who Give The Dose
    }
    // Return When The Dose Have Been Taken
    public Date getDateCreated() {
        return DateCreated;
    }
    // Return The Manufacturer Name
    public String getManufacturer() {
        return Manufacturer;
    }
    // Set This Manufacturer To Manufacturer
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }
    // Return Where The Dose Have Been Taken
    public String getPlace() {
        return Place;
    }
    // Set This Place To Place
    public void setPlace(String Place) {
        this.Place = Place;
    }
    // Return The Health Professional Who Give The Dose
    public HealthProfessional getHealthProfessional() {
        return HealthProfessional;
    }
    // Set The Health Professional Who Give The Dose To Health Professional
    public void setHealthProfessional(HealthProfessional HealthProfessional) {
        this.HealthProfessional = HealthProfessional;
    }
    // An Override To The Method toString To Return The Information About The Dose
    @Override
    public String toString() {
        return "Dose Taken: {" +
                "Manufacturer: " + Manufacturer +
                ", Taken At: " + DateCreated +
                ", In: " + Place + "}\n" +
                HealthProfessional.toString();
    }
}