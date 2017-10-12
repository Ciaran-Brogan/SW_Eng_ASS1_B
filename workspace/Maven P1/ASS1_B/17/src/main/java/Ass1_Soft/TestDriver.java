package Ass1_Soft;
import java.time.LocalDate;

import CB.SoftwareEng.Course_Programme;
import CB.SoftwareEng.Module;
import CB.SoftwareEng.Student;

//import java.time.LocalDate;
import java.util.*;

public class TestDriver {
    
    public static void main(String args[]){
        //Students
        Student S0 = new Student("Evan Mcgloin", 21, "08/09/1995");
        Student S1 = new Student("John Groake", 17, "01/05/2000");
        Student S2 = new Student("Wayne Rooney", 32, "12/02/1985");
        Student S3 = new Student("Roy Keane", 39, "04/11/1976");
        Student S4 = new Student("Brian Maloney", 17, "13/07/2000");
        Student S5 = new Student("Tom Connolly", 31, "29/01/1986");
        Student S6 = new Student("Tony Duffy", 37, "31/10/1980");
        Student S7 = new Student("Michael D Higgins", 56, "23/06/1961");
        Student S8 = new Student("Oisin Gill", 37, "17/04/1978");
        Student S9 = new Student("Conor Keane", 24, "20/12/1993");    
        
        //List of Students
        List<Student> All = new ArrayList<Student>();
        All.add(S0);
        All.add(S1);
        All.add(S2);
        All.add(S3);
        All.add(S4);
        All.add(S5);
        All.add(S6);
        All.add(S7);
        All.add(S8);
        All.add(S9);              
             
        //List of Engineering Students
        List<Student> Eng = new ArrayList<Student>();
        Eng.add(S0);
        Eng.add(S1);
        Eng.add(S2);
        Eng.add(S3);
        Eng.add(S9);
        
        //List of CS&IT Students
        List<Student> CS_IT = new ArrayList<Student>();
        CS_IT.add(S4);
        CS_IT.add(S5);
        CS_IT.add(S6);
        CS_IT.add(S7);
        CS_IT.add(S8);
        
        //Modules
        Module CT416 = new Module("System on Chip", "CT416", CS_IT);
        Module CT417 = new Module("Software Eng3", "CT417", All);
        Module EE445 = new Module("DSP", "EE445", Eng);
        
        //Start and End Dates
        LocalDate StartDate = LocalDate.now();
        LocalDate EndDate = LocalDate.now();
        
        //CS & IT modules lists
        ArrayList<Module> CS_IT_modules = new ArrayList<Module>();
        CS_IT_modules.add(CT416);
        CS_IT_modules.add(CT417);
        Course_Programme CSIT = new Course_Programme("CS & IT", CS_IT_modules, StartDate, EndDate);
        
        //Engineering modules list
        ArrayList<Module> Eng_modules = new ArrayList<Module>();
        Eng_modules.add(EE445);
        Eng_modules.add(CT417);
        Course_Programme ENG = new Course_Programme("Engineering", Eng_modules, StartDate, EndDate);
        
        //Print Student name, Modules & Courses
        CSIT.printINFO();
        ENG.printINFO();
    }
    
}