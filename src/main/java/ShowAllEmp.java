import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;;

public class ShowAllEmp {

	public static void main(String[] args) {
		Configuration config = new Configuration().configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Emp.class);
		List<Emp> emps = cr.list();
		for (Emp emp : emps) {

			System.out.println(emp.getEno());
			System.out.println(emp.getEname());
			System.out.println(emp.getSal());

		}

	}

}
