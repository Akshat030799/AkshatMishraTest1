package testNgPrac;

import org.testng.annotations.Test;

public class Testabc {
  @Test(groups="reg")
  public void a() {
	 System.out.println("Reg");
  }

@Test(groups="reg")
public void a1() {
	 System.out.println("reg1");
}
@Test(groups="mog")
public void a2() {
	 System.out.println("mog");
}
}
