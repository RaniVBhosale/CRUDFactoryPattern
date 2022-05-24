import java.util.*;  

public class Main {
	public static void main(String args[]) {
	
		DeptFactory dept=new DeptFactory();
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter department type: ITDept / CSDept");
		String str= sc.nextLine();    
		
		Department d=dept.getDept(str);
		d.readDept();
		d.UpdateDept();
		d.deleteDept();
	}
	
	
	
	
}
