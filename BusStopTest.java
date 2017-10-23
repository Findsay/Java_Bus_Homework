import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop1;
  Bus bus;
  Person person;

  @Before
  public void before() {
    busStop1 = new BusStop("Stop1");
    bus = new Bus("City Centre");
    person = new Person();
  }

  @Test
  public void hasPassengers(){
    assertEquals(3, busStop1.count());
  }





}
