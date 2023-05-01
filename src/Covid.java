import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;
// This Class Created To Do The Operations That Happen Frequently
public class Covid {
    // A List To Store The Citizens Information In
    private static ArrayList<Citizen> Citizens = new ArrayList<Citizen>();
    // This Method Created To Add A Citizen To The List
    public static void AddCitizen (Citizen citizen){
        int counter = 0; // Counter Will Be Used To Check If The Citizen Already Exists
        // For Each Loop Go Through The List
        for (Citizen AddCitizen: Citizens) {
            // If Condition Uses The Override Of The Method equals That Have Been Created In Citizen Class
            if(AddCitizen.equals(citizen)) {
                counter++;
            }
        }
        // If Condition Check's If The Counter = 0 After Execution The For Each Loop
        if(counter==0) {
            // If True Add The Citizen To The List And Print A Message To Show That
            Citizens.add(citizen);
            System.out.println("Citizen Added Successfully");
        }
        else {
            // If False Print A Message To Show That
            System.out.println("Citizen Already Exists");
        }
    }
    // This Method Created To Add A Dose To A Citizen
    public static void AddDose (Citizen citizen , Dose dose){
        int counter = 0; // Counter Will Be Used To Check If The Citizen Already Exists
        // For Each Loop Go Through The List
        for(Citizen citizenObj: Citizens){
            // If Condition Uses The Override Of The Method equals That Have Been Created In Citizen Class
            if (citizenObj.equals(citizen)){
                citizenObj.setDose(dose); // If True Add The Dose To That Citizen
                counter++;
            }
        }
        // If Condition Check's If The Counter = 0 After Execution The For Each Loop
        if (counter == 0){
            citizen.setDose(dose); // If True Set The Dose To The Citizen
            Citizens.add(citizen); // Add The Citizen To The List And Print A Message To Show That
            System.out.println("Citizen Added Successfully");
        }
    }
    // This Method Created To Write The Information About The Citizens In The List After Sorting Them
    public static String getCitizens() {
        Collections.sort(Citizens , Citizen.CompareByCivilId); // Sort Citizens List By The Order Of The Civil ID
        return Citizens.toString(); // Write The Information About The Citizens In The List
    }
    // This Method Created To Retrieving The Number Of Fully Vaccinated Persons
    public static String GetFullyVaccinated () {
        int Counter = 0; // Counter Will Be Used To Count The Fully Vaccinated Persons
        // For Each Loop Go Through The List
        for (Citizen citizen: Citizens) {
            // If Condition Check's If The Size Of Doses List Created In Citizen Class > 1
            if(citizen.getDoses().size() > 1){
                Counter++;
            }
        }
        // Return The Number Of Fully vaccinated persons
        String FullyVaccinated = "Fully vaccinated persons = " + String.valueOf(Counter);
        return FullyVaccinated;
    }
    // This Method Created To Save All The Data In A File
    public static PrintWriter SavingFile (){
        // Try Catch Function Created To Check If The File Exists Or Not
        try {
            File file = new File("C:\\Users\\Yousef\\IdeaProjects\\Covid-19-Vacation-Counter\\Vaccinated Persons Counter.txt"); // Create A File and Add The Path
            PrintWriter Writer = new PrintWriter(file); // Create A Print Writer To Write In The File
            Writer.println(Covid.getCitizens()); // Print Citizens List In The File
            Writer.println(Covid.GetFullyVaccinated()); // Print The Number Of Fully Vaccinated Persons In The File
            Writer.close(); // Close The Print Writer
            return Writer;
        }
        // This Exception To Return If The File In This Path Has Filled To Open
        catch (FileNotFoundException f){
            System.out.println(f);
        }
        return null;
    }
}