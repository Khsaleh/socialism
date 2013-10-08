package net.abdin.oteams.apps.matri;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author fabdin
 */
public class ApplicationsReader {

	private String filePath;
    public ApplicationsReader(String filePath) {
		this.filePath=filePath;
    }

	/**
	 * 
	 * This method will read the applications from the file and parse the data
	 * @return List of <code>Application</code>
	 */
    public List<Application> getApplications() {

        List<Application> applications = new ArrayList<Application>();
        try {
            //csv file containing data
            CSVReader reader = new CSVReader(new FileReader(filePath));
            String[] nextLine;
            int lineNumber = 0;
            List<String> fields = new ArrayList<String>();
            while ((nextLine = reader.readNext()) != null) {
                Application application = new Application();
                lineNumber++;

                for (int i = 0; i < nextLine.length; i++) {

                        if (lineNumber == 1) {
                        fields.add(nextLine[i]);
                    }else {
                        application.add(fields.get(i), nextLine[i]);
                        
                    }
                }
                
                applications.add(application);

            }
        } catch (Exception e) {
        }

        return applications;
    }

    List<Application> filter(List<Application> applications, HttpServletRequest request) {
        List<Application> filteredApplications=new ArrayList<Application>();
        
        String gender=request.getParameter("gender");
        
        if(gender!=null && !gender.equals("")){
            for(Application app:applications){
                for(Field f:app.getFields()){
                    if(f.getLabel().equals("Gender") && f.getValue().equals(gender) )
                    {
                        filteredApplications.add(app);
                        continue;
                    }
                }
            }
        }
        
        return filteredApplications;
        
    }
}
