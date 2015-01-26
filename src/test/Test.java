/**
 * 
 */
package test;

import javax.ejb.EJB;
import javax.inject.Inject;

//import com.opensymphony.xwork2.inject.Inject;



import ejb.business.RegisterServiceImpl;
import ejb.business.RegisterServiceLocal;
import ejb.dao.StudentDaoLocal;
import ejb.domain.Student;

/**
 * @author root
 *
 */
public class Test {

	/**
	 * @param args
	 */
	@Inject
	public static RegisterServiceLocal rsl;
	public static RegisterServiceImpl rs;
	@EJB
	public static StudentDaoLocal sdl;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student("G00760357", "noumessi", "SWE", true, "tnoumess@gmu.edu", "xxxx");
		System.out.println("begin");
		//rs=new RegisterServiceImpl();
		//String st=Test.rsl.register(s);
		sdl.createS(s);
  System.out.println(s);
	}

}
