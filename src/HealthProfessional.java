// This Class Created To Store The Information About The Health Professional
public class HealthProfessional extends Citizen {
    // Health Professional Experience In Years
    private double Experience;
    // Zero Argument Construct
    public HealthProfessional (){
    }
    // One Argument Construct
    public HealthProfessional (double Experience){
        this.Experience = Experience;
    }
    // 3 Argument Construct
    public HealthProfessional (String Name , String CivilId , double Experience){
        setName(Name); // Call The setName Method And Use It To Set The Health Professional Name
        setCivilId(CivilId); // Call The setCivilId Method And Use It To Set The Health Professional Civil ID
        this.Experience = Experience; // Set The Experience Of The Health Professional
    }
    // Return The Health Professional Experience
    public double getExperience() {
        return Experience;
    }
    // Set This Experience To Experience
    public void setExperience(double Experience) {
        this.Experience = Experience;
    }
    // An Override To The Method toString To Return The Information About The Health Professional
    @Override
    public String toString() {
        return "By The HealthProfessional: {" +
                "Name : " + getName() +
                ", CivilId : " + getCivilId() +
                ", Years Of Experience: " + Experience +
                "}";
    }
}