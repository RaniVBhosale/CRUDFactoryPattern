
public class CSDept extends Department{
	public CSDept(){
		this.setId(2);
		this.setName("CS");
		System.out.println("Creating CS Dept");
	}
	@Override
	public void readDept() {
		System.out.println("reading CS Dept");
	}

	@Override
	public void UpdateDept() {
		System.out.println("updatng CS Dept");
	}

	@Override
	public void deleteDept() {
		System.out.println("Deleted Account with id "+this.getId()+" and name "+this.getName());
	}

}
