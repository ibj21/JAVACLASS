class Capacity2{
public static void main(String[]args){
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("Hello");
System.out.println(sb.capacity());
sb.append("java is my favourite langauge");
System.out.println(sb.capacity());
sb.ensureCapacity(10); //no change
System.out.println(sb.capacity()); //34
sb.ensureCapacity(50);
System.out.println(sb.capacity()); //70
}
}
