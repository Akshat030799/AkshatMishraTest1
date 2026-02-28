
public class Inheritancecon {
	public static void main(String[] args) {
		A abc=new B();
		abc.tick();
	}

}
class A{
	A(){System.out.println("parent");}
	int lo=9;
	int ko=8;
	public void tick() {
		System.out.println("tick");
	}
}

class B extends A{
	int jo=99;
	int io=89;
	B(){System.out.println("child");}
	public void tick() {
		
	System.out.println("Tikku");
	}
}

