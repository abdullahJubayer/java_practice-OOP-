package Association;

import java.util.ArrayList;

public class ClassMain {
    public static void main(String[] args) {
        
        
        EmployeeAddress empAddressObj=new EmployeeAddress("Abdullah", "1207", "4444", "Mirpur-10", "Dhaka");
        
        TeamMember teamOneMember_1=new TeamMember("akash ","Software developer","Android");
        TeamMember teamOneMember_2=new TeamMember("nill","Software developer","PHP");
        TeamMember teamTwoMember_1=new TeamMember("batash ","Software Engineer","Android");
        TeamMember teamTwoMember_2=new TeamMember("pani","Software Engineer","PHP");
        
        ArrayList<TeamMember> teamMembers=new ArrayList<>();
        teamMembers.add(teamOneMember_1);
        teamMembers.add(teamOneMember_2);
        
        ArrayList<TeamMember> teamMembers2=new ArrayList<>();
        teamMembers2.add(teamTwoMember_1);
        teamMembers2.add(teamTwoMember_2);
        
        EmployeeProjects empProjectOBJ=new EmployeeProjects("Green Project", "Md.Abdullah jubayer",
                "24/7/2015", "2/1/2019",teamMembers);
        EmployeeProjects empProjectOBJ2=new EmployeeProjects("Black Project", "Md.Abdullah",
                "0/0/0", "0/0/0",teamMembers2);
        
        
        ArrayList<EmployeeProjects> empProjects=new ArrayList<>();
        empProjects.add(empProjectOBJ);
        empProjects.add(empProjectOBJ2);
        
        
        
        Employee eObj=new Employee("Abdullah", "1", "Student", "00",empAddressObj,empProjects);
        
        System.out.println("Name :"+eObj.getEmployeeName()+ "\nAddress :"+"\nRoad :"
                +eObj.getEmployeeAddress().getRoadNo()+"\nCity :"
                +eObj.getEmployeeAddress().getCity()+"\nDivision :"
                +eObj.getEmployeeAddress().getDivision()
                +"\nProjects :"+eObj.getEmployeeProject().size());
        
        for (EmployeeProjects l : eObj.getEmployeeProject()) {
            System.out.println("Project Name :"+l.getPorjectName()+"\nLeader Of Project :"+
                    l.getProjectLeader()+"\nNumber of Team Member :"+l.getTeamMemberDetailes().size());
                    for (TeamMember teamMember : l.getTeamMemberDetailes())
                    {
                                    System.out.println("Other Project Member :"+teamMember.getProjectMemberName());    
                     }
            
        }
        
        
    }
}
