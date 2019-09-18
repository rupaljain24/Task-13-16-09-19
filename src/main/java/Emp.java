import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	private int eno;//Primary key
	private String ename;
	private int sal;
	
	@OneToOne//(fetch=FetchType.LAZY)
	private Laptop laptop;
	


	public Emp() {
		super();
	}


	public Emp(int eno, String ename, int sal, Laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		
	}


	public int getEno() {
		return eno;
	}


	public void setEno(int eno) {
		this.eno = eno;
	}


	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", laptop=" + laptop + "]";
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	


	public Emp(int eno) {
		super();
		this.eno = eno;
	}
	

	

}
