/**
 * 
 */
package test;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import ejb.business.RegisterServiceLocal;
import ejb.domain.Student;

/**
 * @author root
 *
 */
public class Tests {

	@Inject
	public  RegisterServiceLocal rsl;
	
	
	@Test
	public void test() {
		Student s=new Student("G00760357", "noumessi", "SWE", true, "tnoumess@gmu.edu", "xxxx");
		System.out.println("begin");
		//rs=new RegisterServiceImpl();
		assertEquals("edson", rsl.register(s));
		String st=rsl.register(s);
		//sdl.createS(s);
  System.out.println(s);
	}

}
