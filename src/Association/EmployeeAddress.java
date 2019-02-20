
package Association;
public class EmployeeAddress extends Address{
    
     String employeeName;
    public EmployeeAddress(String employeeName,String roadNo, String zipCode, String city, String division) {
        super(roadNo, zipCode, city, division);
        this.employeeName=employeeName;
    }
    public void setEmployeeName(String name){
        employeeName=name;
    }
   public String getEmployeeName(){
       return employeeName;
   }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
