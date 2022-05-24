
public class DeptFactory {
	 public Department getDept(String deptType){  
         if(deptType == null){  
          return null;  
         }  
         if(deptType.equalsIgnoreCase("ITDEPT")) {  
              return new ITDept();  
         }   
         else if(deptType.equalsIgnoreCase("CSDEPT")){  
             return new CSDept();  
         }
       return null; 
       }
}
