/**
 * 
 */
package test;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.inject.Inject;

//import com.opensymphony.xwork2.inject.Inject;





import javax.inject.Named;
import ejb.business.RegisterServiceImpl;
import ejb.business.RegisterServiceLocal;
import ejb.dao.StudentDaoLocal;
import ejb.domain.Student;

/**
 * @author root
 *
 */


@Named

public class Test {

	/**
	 * @param args
	 */
	@Inject
	public static RegisterServiceLocal rsl;
	@Inject
	public static RegisterServiceImpl rs;
	@Inject
	public static StudentDaoLocal sdl;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student("G00760357", "noumessi", "SWE", true, "tnoumess@gmu.edu", "xxxx");
		System.out.println("begin");
		//rs=new RegisterServiceImpl();
		//String st=Test.rsl.register(s);
		//sdl.createS(s);
  System.out.println(rsl);
  System.out.println(rs);
  System.out.println(rsl);
	}

}
