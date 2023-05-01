public class Test {
    public static void main(String[] args) {
        // Create A Health Professionals By Using The Constructs From HealthProfessional Class
        HealthProfessional health_professional1 = new HealthProfessional();
        HealthProfessional health_professional2 = new HealthProfessional();
        HealthProfessional health_professional3 = new HealthProfessional();

        // Create A Doses By Using The Constructs From Dose Class
        Dose dose1 = new Dose();
        Dose dose2 = new Dose();
        Dose dose3 = new Dose();

        // Create A Citizens By Using The Constructs From Citizen Class
        Citizen citizen1 = new Citizen();
        Citizen citizen2 = new Citizen();
        Citizen citizen3 = new Citizen();
        Citizen citizen4 = new Citizen();
        Citizen citizen5 = new Citizen();
        Citizen citizen6 = new Citizen();
        Citizen citizen7 = new Citizen();

        // Add The Citizens And The Doses To The List Created In Covid Class By Using The Constructs From Covid Class
        Covid.AddCitizen(citizen1);
        Covid.AddDose(citizen1 , dose1);
        Covid.AddDose(citizen1 , dose2);
        Covid.AddCitizen(citizen2);
        Covid.AddDose(citizen2 , dose3);
        Covid.AddCitizen(citizen3);
        Covid.AddDose(citizen3 , dose1);
        Covid.AddDose(citizen3 , dose2);
        Covid.AddDose(citizen4 , dose3);
        Covid.AddCitizen(citizen5);
        Covid.AddCitizen(citizen6);
        Covid.AddCitizen(citizen7);

        // Save The Information In The File
        Covid.SavingFile();

    }
}
