package Association;

import java.util.ArrayList;

public class EmployeeProjects {
    String porjectName;
    String projectLeader;
    String projectStartDate;
    String projectEndDate;
    ArrayList<TeamMember> teamMemberDetailes;

    public EmployeeProjects(String porjectName, String projectLeader, String projectStartDate, String projectEndDate, ArrayList<TeamMember> teamMemberDetailes) {
        this.porjectName = porjectName;
        this.projectLeader = projectLeader;
        this.projectStartDate = projectStartDate;
        this.projectEndDate = projectEndDate;
        this.teamMemberDetailes = teamMemberDetailes;
    }

    public String getPorjectName() {
        return porjectName;
    }

    public void setPorjectName(String porjectName) {
        this.porjectName = porjectName;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public ArrayList<TeamMember> getTeamMemberDetailes() {
        return teamMemberDetailes;
    }

    public void setTeamMemberDetailes(ArrayList<TeamMember> teamMemberDetailes) {
        this.teamMemberDetailes = teamMemberDetailes;
    }

    @Override
    public String toString() {
        return "This is Employee Projects Class"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
