package java_practice;

public class Error_VS_Exception {

    static Error_VS_Exception Obj=new Error_VS_Exception();
;
    public static void main(String[] args) {
        
        try{
                int n=5/0;///This is a exception
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
                Obj.m1();///This is an Error
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    void m1(){
        Obj.m2();
    }
    void m2(){
      Obj.m1();
    }
}
