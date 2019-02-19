package Association;

class TeamMember {
    String projectMemberName;
    String projectMemberDesignation;
    String rojectMemberWorkType;

    public TeamMember(String projectMemberName, String projectMemberDesignation, String rojectMemberWorkType) {
        this.projectMemberName = projectMemberName;
        this.projectMemberDesignation = projectMemberDesignation;
        this.rojectMemberWorkType = rojectMemberWorkType;
    }

    public String getProjectMemberName() {
        return projectMemberName;
    }

    public void setProjectMemberName(String projectMemberName) {
        this.projectMemberName = projectMemberName;
    }

    public String getProjectMemberDesignation() {
        return projectMemberDesignation;
    }

    public void setProjectMemberDesignation(String projectMemberDesignation) {
        this.projectMemberDesignation = projectMemberDesignation;
    }

    public String getRojectMemberWorkType() {
        return rojectMemberWorkType;
    }

    public void setRojectMemberWorkType(String rojectMemberWorkType) {
        this.rojectMemberWorkType = rojectMemberWorkType;
    }
    
    
}
