class Test1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("main start");
		System.out.println("main end");
		m1 (10);
		m1 ((byte)10);
    m1 ((short)10);
	m1 ((long)10);
    //longl1 =12345678901;
	//longl1 =long 12345678901;
	long l1 =12345678901L;
	System.out.println(12345678901L);
	System.out.println(1234567890);
	long l2 =5;
	long l3 =5L;
	//conversion purpose use cast
	int l4 = (int)5L;
    System.out.println(10);
	System.out.println(5L);
	System.out.println(5);
}
static void m1 (byte a1){
System.out.println("ok byte");
}
static void m1 (short a2){
System.out.println("short ok!");
}static void m1 (int a3){
	System.out.println("ok int");
}
static void m1 (long a4){
	System.out.println("long");
}
}