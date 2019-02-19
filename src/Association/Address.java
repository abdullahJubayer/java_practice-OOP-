package Association;

public class Address {
    String roadNo;
    String zipCode;
    String city;
    String division;

    public Address(String roadNo, String zipCode, String city, String division) {
        this.roadNo = roadNo;
        this.zipCode = zipCode;
        this.city = city;
        this.division = division;
    }
    
    public void setRoadNo(String r){
        roadNo=r;
    }
    public void setZipCode(String z){
        zipCode=z;
    }
    public void setCity(String c){
        city=c;
    }
    public void setDivision(String d){
        division=d;
    }
    public String getRoadNo(){
        return roadNo;
    }
    public String getZipCode(){
        return zipCode;
    }
    public String getCity(){
        return city;
    }
    public String getDivision(){
        return division;
    }
    
}
