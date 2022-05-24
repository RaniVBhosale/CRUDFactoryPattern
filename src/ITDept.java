
public class ITDept extends Department{

	public ITDept(){
		this.setId(1);
		this.setName("IT");
		System.out.println("Creating IT Dept");
	}
	@Override
	public void readDept() {
		System.out.println("reading IT Dept");
	}

	@Override
	public void UpdateDept() {
		System.out.println("Updating IT Dept");
		
	}

	@Override
	public void deleteDept() {
		System.out.println("Deleted Account with id "+this.getId()+" and name "+this.getName());
	}

}
