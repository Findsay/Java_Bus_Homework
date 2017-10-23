import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus("City Centre");
    person = new Person();
  }

  @Test
  public void hasRoute(){
    assertEquals("City Centre", bus.route());
  }

  @Test
  public void startsWithNoPassengers(){
    assertEquals(0, bus.count());
  }

  @Test
  public void canPickUpPassenger(){
    bus.pickUp(person);
    assertEquals(1, bus.count());
  }

  @Test
  public void isBusFull(){
    for(int i=0; i < 40; i++){
      bus.pickUp(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void cannotPickUpIfBusFull(){
    for(int i=0; i < 45; i++){
      bus.pickUp(person);
    }
    assertEquals(40, bus.count());
  }



}
