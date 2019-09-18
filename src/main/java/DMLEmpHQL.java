import org.hibernate.Session;
import org.hibernate.query.Query;

public class DMLEmpHQL {

	public static void main(String[] args) {
		Session session=Util.getSF().openSession();
		//insert
		String hql = "update Emp set ename = :Name" +
    				" where Eno = :id";
		org.hibernate.Transaction tr=session.beginTransaction();
		
		Query qr = session.createQuery(hql);
		qr.setParameter("Name", "FFF");
		qr.setParameter("id", 2);
		qr.executeUpdate();
		tr.commit();
		
		System.out.println("Data Update");
	}

}
