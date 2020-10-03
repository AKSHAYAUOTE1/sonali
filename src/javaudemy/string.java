package javaudemy;

public class string {
	public string(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//****it is one of the prebuild cls in java
		//****two types of string
		//1.string literal
		//2.by creating object of the string
		
		String a="vasudevhari";
		String b=" ";
		string ram = new string("ramkrushnhari");
		
		System.out.println(a.length());
		System.out.println(a.indexOf("u"));
		System.out.println(a.charAt(5));
		System.out.println(a.substring(4, 9));
	System.out.println(a.toUpperCase());
	System.out.println(a.substring(6));
	System.out.println(a.concat("haremurari"));
	System.out.println(a.replace("vasudevhari", "shrikrushngovind"));
	for (int i = a.length()-1; i >=0; i--) {
	//	System.out.println(a.charAt(i));
		b=b+a.charAt(i) ;
		
		

	

	
		
		
		
	}
	System.out.println(b);
	}

}
