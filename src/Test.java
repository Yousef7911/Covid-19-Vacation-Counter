public class Test {
    public static void main(String[] args) {
        // Create A Health Professionals By Using The Constructs From HealthProfessional Class
        HealthProfessional health_professional1 = new HealthProfessional("Dr.Hala Mohamed" , "50030077" , 10);
        HealthProfessional health_professional2 = new HealthProfessional("Dr.Ahmed Ibrahim" , "65374831" , 15);
        HealthProfessional health_professional3 = new HealthProfessional("Dr.Taha Nabil" , "18793456" , 7);

        // Create A Doses By Using The Constructs From Dose Class
        Dose dose1 = new Dose("Sinovac" , "Arab Open University" , health_professional1);
        Dose dose2 = new Dose("Pfizer" , "Dar Al Fouad Hospital" , health_professional2);
        Dose dose3 = new Dose("Sinopharm" , "Khaled Abn El Waleed School" , health_professional3);

        // Create A Citizens By Using The Constructs From Citizen Class
        Citizen citizen1 = new Citizen("Yousef Ismail", "21510235", "19", "Male");
        Citizen citizen2 = new Citizen("Mahmoud Essam", "11510236", "22", "Male");
        Citizen citizen3 = new Citizen("Areej Ahmed", "40517110", "23", "Female");
        Citizen citizen4 = new Citizen("Amjad Emad", "90599745", "20", "Male");
        Citizen citizen5 = new Citizen("Auman Zaki", "31010211", "26", "Male");
        Citizen citizen6 = new Citizen("Yousef Ismail", "21510235", "19", "Male");
        Citizen citizen7 = new Citizen("Alaa sayid", "87456214", "34", "Female");

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