package MyProject_Day1;

public class string_example {
	 public static void main(String args[]) {
		 String str="hello this is java class";
		 String str1="hello";
		 String str2="HeLLo";
		 String str3="hi how are you";
		 String str4="hello";
		 String str5="1234";
		 String str6="Java234";
		 String str7="";
		 String str9="	hello java	";
		 System.out.println(str.length());
		 System.out.println(str.toUpperCase());
		 System.out.println(str.toLowerCase());
		 System.out.println(str3.charAt(9));
		 System.out.println(str1.compareTo(str4));
		 System.out.println(str1.compareToIgnoreCase(str2));
		 System.out.println(str1.concat(str3));
		 System.out.println(str1.contains("ell"));
		 System.out.println(str1.contentEquals(str3));
		 System.out.println(str3.endsWith("u"));
		 System.out.println(str1.equals(str3));
		 System.out.println(str1.equalsIgnoreCase(str2));
		 System.out.println(str1.indexOf('l'));
		 System.out.println(str1.matches("[a-zA-Z]+"));
		 System.out.println(str5.matches("\\d+"));
		 System.out.println(str7.isEmpty());
		 System.out.println(String.join("|",str2,str3,str4));
		 System.out.println(String.join(":","hi","how","are","you"));
		 System.out.println(str1.lastIndexOf('1'));
		 System.out.println(str1.replace('l', 'p'));
		 System.out.println(str1.replaceFirst("hel", "tro"));
		 String str10="hi;how;are;you";
		 String str8[]=str10.split(";");
		 for (String i:str8) {
			 System.out.println(i);
		 }
		 System.out.println(str6.startsWith("J"));
		 System.out.println(str.subSequence(5, 12));
		 char arr[]=str4.toCharArray();
		 System.out.println(arr[0]);
		 System.out.println(str9.trim());
		 float f=9.8f;
		 System.out.println(String.valueOf(f));
	 }
}
