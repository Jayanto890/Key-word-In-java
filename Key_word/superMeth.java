package Key_word;

public class superMeth {

 void show() {
	 System.out.println("hello PUBLIC");
 }
}
class m extends superMeth
	{
	void show(){
	super.show();
	 System.out.println("hello Jayanto");
	}
}
class t 
{
	public static void main (String []args) {
		 m  r = new m();
		r.show();
	}
}
// super constructor appne app create ho jata ha by default
// sur parameteriszed constructor ke time pr hume super key word ko decleare krna padta aur uss ki value bhi  super(100,20); ese