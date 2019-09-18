import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CRUDonEmp {

	public static void main(String[] args) {
		
		Configuration config= new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		/*
		Vehicle v1= new Vehicle(1901, "Brand 1", "M01", 5478960);
		Vehicle v2= new Vehicle(1902, "Brand 2", "M02", 5478967);
		Vehicle v3= new Vehicle(1903, "Brand 3", "M03", 5478965);
		session.save(v1);
		session.save(v2);
		session.save(v3);*/
		
	/*	Laptop l1 =new Laptop("101","HP",199999);
		Laptop l2 =new Laptop("102","DELL",99999);
		Laptop l3 =new Laptop("103","MAC",399999);
		
		session.save(l1);
		session.save(l2);
		session.save(l3);*/
		
		Emp e1 = new Emp(1,"jojo",54000,new Laptop("101"));
		Emp e2 = new Emp(2,"pojo",55000,new Laptop("103"));
		session.save(e1);

		org.hibernate.Transaction tr=session.beginTransaction();
		tr.commit();
		session.close();
		System.out.println("data added");
	}

}
