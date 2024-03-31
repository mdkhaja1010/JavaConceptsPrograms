package arrraysDefine;

public class Strings1s2 {

	public static void main(String[] args) {
		String name="khaja";
		String name1="khaja";
		System.out.println(name==name1);
		System.out.println(name.equals(name1));
		String s1=new String("khaja");
		String s2=new String("khaja");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		s1=s1.concat("mohammed");
		System.out.println(s1);
		System.out.println(s1==s2);

	}

}
