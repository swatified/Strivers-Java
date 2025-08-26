public class StringBuild{
public static void main(String[] args){
StringBuilder sb = new StringBuilder(2);
System.out.println(sb.capacity());
sb.ensureCapacity(10);
System.out.println(sb.append("text")); 
System.out.println(sb.capacity());
System.out.println(sb.append(123));
System.out.println(sb.insert(2, "text"));
System.out.println(sb.delete(0,3));
System.out.println(sb.deleteCharAt(4));
System.out.println(sb.toString());
System.out.println(sb.length());
System.out.println(sb.charAt(2));
System.out.println(sb.capacity()); 
}}