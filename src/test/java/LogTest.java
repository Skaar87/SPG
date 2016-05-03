import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import Uppgift.StartPage;

public class LogTest {

	Logger logger = Logger.getLogger(this.getClass());
	static StartPage start;

	@BeforeClass
	public static void beforeClass() {
		start = new StartPage();
	}

	@Ignore	
	@Test
	public void testLog(){
		logger.info("Starting");
		logger.debug("Very detailed log");
		logger.fatal("terribly fatal");
	}

	@Test
	public void task1(){
		start.task1();

	}
	@Test
	public void task2(){

		start.task2();
	}

	@Test
	public void task3(){

		start.task3();
	}

	@Test
	public void task4(){

		start.task4();
	}

	@Test
	public void task5(){

		start.task5();
	}

	@Test
	public void task6(){

		start.task6();
	}

	@Test
	public void task7(){

		start.task7();
	}

	@Test
	public void task8(){

		start.task8();
	}

	@Test
	public void task9(){

		start.task9();
	}

	@Test
	public void task10(){

		start.task10();
	}

	@Test
	public void task11(){

		start.task11();
	}

	@Test
	public void task12(){

		start.task12();
	}

	@Test
	public void task13(){

		start.task13();
	}

	@Test
	public void task14(){

		start.task14();
	}

	@Test
	public void task1516(){

		start.task1516();
	}

	@Test
	public void task17(){

		start.task17();
	}

}
